package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QMeasureCell extends js.Object {
  var qNum: js.UndefOr[Double] = js.native
  var qText: String = js.native
  def getPercent(): Double = js.native
  def getPercentOfMax(): Double = js.native
}

object QMeasureCell {
  @scala.inline
  def apply(getPercent: () => Double, getPercentOfMax: () => Double, qText: String): QMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[QMeasureCell]
  }
  @scala.inline
  implicit class QMeasureCellOps[Self <: QMeasureCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPercent(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPercent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPercentOfMax(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPercentOfMax")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNum")(js.undefined)
        ret
    }
  }
  
}

