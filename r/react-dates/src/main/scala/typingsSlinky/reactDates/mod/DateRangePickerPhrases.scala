package typingsSlinky.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// PHRASES
//
// defaultPhrases.js
@js.native
trait DateRangePickerPhrases extends js.Object {
  var calendarLabel: js.UndefOr[String] = js.native
  var chooseAvailableEndDate: js.UndefOr[js.Function1[/* date */ String, String]] = js.native
  var chooseAvailableStartDate: js.UndefOr[js.Function1[/* date */ String, String]] = js.native
  var clearDates: js.UndefOr[String] = js.native
  var closeDatePicker: js.UndefOr[String] = js.native
  var dateIsSelected: js.UndefOr[js.Function1[/* date */ String, String]] = js.native
  var dateIsUnavailable: js.UndefOr[js.Function1[/* date */ String, String]] = js.native
  var enterKey: js.UndefOr[String] = js.native
  var escape: js.UndefOr[String] = js.native
  var focusStartDate: js.UndefOr[String] = js.native
  var hideKeyboardShortcutsPanel: js.UndefOr[String] = js.native
  var homeEnd: js.UndefOr[String] = js.native
  var jumpToNextMonth: js.UndefOr[String] = js.native
  var jumpToPrevMonth: js.UndefOr[String] = js.native
  var keyboardNavigationInstructions: js.UndefOr[String] = js.native
  var keyboardShortcuts: js.UndefOr[String] = js.native
  var leftArrowRightArrow: js.UndefOr[String] = js.native
  var moveFocusByOneDay: js.UndefOr[String] = js.native
  var moveFocusByOneMonth: js.UndefOr[String] = js.native
  var moveFocusByOneWeek: js.UndefOr[String] = js.native
  var moveFocustoStartAndEndOfWeek: js.UndefOr[String] = js.native
  var openThisPanel: js.UndefOr[String] = js.native
  var pageUpPageDown: js.UndefOr[String] = js.native
  var questionMark: js.UndefOr[String] = js.native
  var returnFocusToInput: js.UndefOr[String] = js.native
  var selectFocusedDate: js.UndefOr[String] = js.native
  var showKeyboardShortcutsPanel: js.UndefOr[String] = js.native
  var upArrowDownArrow: js.UndefOr[String] = js.native
}

object DateRangePickerPhrases {
  @scala.inline
  def apply(): DateRangePickerPhrases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerPhrases]
  }
  @scala.inline
  implicit class DateRangePickerPhrasesOps[Self <: DateRangePickerPhrases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withChooseAvailableEndDate(value: /* date */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseAvailableEndDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChooseAvailableEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseAvailableEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withChooseAvailableStartDate(value: /* date */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseAvailableStartDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChooseAvailableStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseAvailableStartDate")(js.undefined)
        ret
    }
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
    def withCloseDatePicker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDatePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDatePicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDatePicker")(js.undefined)
        ret
    }
    @scala.inline
    def withDateIsSelected(value: /* date */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIsSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDateIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIsSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDateIsUnavailable(value: /* date */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIsUnavailable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDateIsUnavailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIsUnavailable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
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
    def withHideKeyboardShortcutsPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideKeyboardShortcutsPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideKeyboardShortcutsPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideKeyboardShortcutsPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("homeEnd")(js.undefined)
        ret
    }
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
    @scala.inline
    def withKeyboardShortcuts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftArrowRightArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrowRightArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftArrowRightArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrowRightArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveFocusByOneDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusByOneDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveFocusByOneDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusByOneDay")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveFocusByOneMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusByOneMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveFocusByOneMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusByOneMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveFocusByOneWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusByOneWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveFocusByOneWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocusByOneWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveFocustoStartAndEndOfWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocustoStartAndEndOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveFocustoStartAndEndOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveFocustoStartAndEndOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenThisPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openThisPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenThisPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openThisPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUpPageDown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUpPageDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageUpPageDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUpPageDown")(js.undefined)
        ret
    }
    @scala.inline
    def withQuestionMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuestionMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("questionMark")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnFocusToInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocusToInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFocusToInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFocusToInput")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectFocusedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFocusedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectFocusedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFocusedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withShowKeyboardShortcutsPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboardShortcutsPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowKeyboardShortcutsPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showKeyboardShortcutsPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withUpArrowDownArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upArrowDownArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpArrowDownArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upArrowDownArrow")(js.undefined)
        ret
    }
  }
  
}

