package typingsSlinky.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// defaultPhrases.js
@js.native
trait DayPickerNavigationPhrases extends js.Object {
  var jumpToNextMonth: js.UndefOr[String] = js.native
  var jumpToPrevMonth: js.UndefOr[String] = js.native
}

object DayPickerNavigationPhrases {
  @scala.inline
  def apply(): DayPickerNavigationPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayPickerNavigationPhrases]
  }
  @scala.inline
  implicit class DayPickerNavigationPhrasesOps[Self <: DayPickerNavigationPhrases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJumpToNextMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToNextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJumpToNextMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToNextMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withJumpToPrevMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToPrevMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJumpToPrevMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jumpToPrevMonth")(js.undefined)
        ret
    }
  }
  
}

