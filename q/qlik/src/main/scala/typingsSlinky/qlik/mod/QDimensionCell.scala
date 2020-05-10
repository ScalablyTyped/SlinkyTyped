package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QDimensionCell extends js.Object {
  var qElemNumber: Double = js.native
  var qNum: js.UndefOr[Double] = js.native
  var qState: String = js.native
  var qText: String = js.native
  def select(): Unit = js.native
}

object QDimensionCell {
  @scala.inline
  def apply(qElemNumber: Double, qState: String, qText: String, select: () => Unit): QDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[QDimensionCell]
  }
  @scala.inline
  implicit class QDimensionCellOps[Self <: QDimensionCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQElemNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qElemNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
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

