package typingsSlinky.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait DateRangePickerInputPhrases extends js.Object {
  var clearDates: js.UndefOr[String] = js.native
  var focusStartDate: js.UndefOr[String] = js.native
  var keyboardNavigationInstructions: js.UndefOr[String] = js.native
}

object DateRangePickerInputPhrases {
  @scala.inline
  def apply(): DateRangePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerInputPhrases]
  }
  @scala.inline
  implicit class DateRangePickerInputPhrasesOps[Self <: DateRangePickerInputPhrases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearDates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDates")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNavigationInstructions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigationInstructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNavigationInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigationInstructions")(js.undefined)
        ret
    }
  }
  
}

