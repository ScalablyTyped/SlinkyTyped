package typingsSlinky.agGrid.dateComponentMod

import typingsSlinky.agGrid.dateFilterMod.IDateFilterParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateParams extends js.Object {
  var filterParams: IDateFilterParams = js.native
  /** Method for component to tell ag-Grid that the date has changed. */
  def onDateChanged(): Unit = js.native
}

object IDateParams {
  @scala.inline
  def apply(filterParams: IDateFilterParams, onDateChanged: () => Unit): IDateParams = {
    val __obj = js.Dynamic.literal(filterParams = filterParams.asInstanceOf[js.Any], onDateChanged = js.Any.fromFunction0(onDateChanged))
    __obj.asInstanceOf[IDateParams]
  }
  @scala.inline
  implicit class IDateParamsOps[Self <: IDateParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterParams(value: IDateFilterParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDateChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChanged")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

