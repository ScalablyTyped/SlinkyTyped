package typingsSlinky.baseui.datepickerMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerState extends js.Object {
  var calendarFocused: Boolean = js.native
  var isOpen: Boolean = js.native
  var isPseudoFocused: Boolean = js.native
  var lastActiveElm: js.UndefOr[HTMLElement] = js.native
}

object DatepickerState {
  @scala.inline
  def apply(calendarFocused: Boolean, isOpen: Boolean, isPseudoFocused: Boolean): DatepickerState = {
    val __obj = js.Dynamic.literal(calendarFocused = calendarFocused.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isPseudoFocused = isPseudoFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatepickerState]
  }
  @scala.inline
  implicit class DatepickerStateOps[Self <: DatepickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPseudoFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPseudoFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastActiveElm(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActiveElm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastActiveElm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActiveElm")(js.undefined)
        ret
    }
  }
  
}

