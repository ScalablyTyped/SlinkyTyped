package typingsSlinky.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait SingleDatePickerInputPhrases extends js.Object {
  var clearDate: js.UndefOr[String] = js.native
  var keyboardNavigationInstructions: js.UndefOr[String] = js.native
}

object SingleDatePickerInputPhrases {
  @scala.inline
  def apply(): SingleDatePickerInputPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleDatePickerInputPhrases]
  }
  @scala.inline
  implicit class SingleDatePickerInputPhrasesOps[Self <: SingleDatePickerInputPhrases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDate")(js.undefined)
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

