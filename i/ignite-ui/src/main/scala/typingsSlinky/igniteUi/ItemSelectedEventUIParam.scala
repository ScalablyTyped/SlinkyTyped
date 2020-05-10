package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemSelectedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to jQuery UI date picker widget, used as a calendar from the igDatePicker.
  	 */
  var calendar: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the selected date object.
  	 */
  var dateFromPicker: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the selected html element from the calendar.
  	 */
  var item: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets a reference to the editor.
  	 */
  var owner: js.UndefOr[js.Any] = js.native
}

object ItemSelectedEventUIParam {
  @scala.inline
  def apply(): ItemSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemSelectedEventUIParam]
  }
  @scala.inline
  implicit class ItemSelectedEventUIParamOps[Self <: ItemSelectedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFromPicker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFromPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFromPicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFromPicker")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

