package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDateNavigator.VisibleMonthChanged event.
  */
@js.native
trait ASPxClientDateNavigatorVisibleMonthChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the end date of the latest visible month.
    */
  var endDate: js.Date = js.native
  /**
    * Returns the start date of the latest visible month.
    */
  var startDate: js.Date = js.native
}

object ASPxClientDateNavigatorVisibleMonthChangedEventArgs {
  @scala.inline
  def apply(endDate: js.Date, startDate: js.Date): ASPxClientDateNavigatorVisibleMonthChangedEventArgs = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateNavigatorVisibleMonthChangedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientDateNavigatorVisibleMonthChangedEventArgsOps[Self <: ASPxClientDateNavigatorVisibleMonthChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

