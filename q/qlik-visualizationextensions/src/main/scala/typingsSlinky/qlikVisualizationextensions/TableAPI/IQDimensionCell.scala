package typingsSlinky.qlikVisualizationextensions.TableAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQDimensionCell extends IQMeasureCell {
  /**
    * Cell value index.
    */
  var qElemNumber: Double = js.native
  /**
    * Cell state.
    */
  var qState: String = js.native
  /**
    * Selects the value in this cell.
    */
  def select(): Unit = js.native
}

object IQDimensionCell {
  @scala.inline
  def apply(
    getPercent: () => Double,
    getPercentOfMax: () => Double,
    qElemNumber: Double,
    qState: String,
    qText: String,
    select: () => Unit
  ): IQDimensionCell = {
    val __obj = js.Dynamic.literal(getPercent = js.Any.fromFunction0(getPercent), getPercentOfMax = js.Any.fromFunction0(getPercentOfMax), qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = js.Any.fromFunction0(select))
    __obj.asInstanceOf[IQDimensionCell]
  }
  @scala.inline
  implicit class IQDimensionCellOps[Self <: IQDimensionCell] (val x: Self) extends AnyVal {
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
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

