package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapDateEditEventMap extends BootstrapClientEditEventMap {
  var buttonClick: ButtonEditClickEventArgs = js.native
  var calendarCustomDisabledDate: CalendarCustomDisabledDateEventArgs = js.native
  var closeUp: EventArgs = js.native
  var dateChanged: ProcessingModeEventArgs = js.native
  var dropDown: EventArgs = js.native
  var keyDown: EditKeyEventArgs = js.native
  var keyPress: EditKeyEventArgs = js.native
  var keyUp: EditKeyEventArgs = js.native
  var parseDate: ParseDateEventArgs = js.native
  var queryCloseUp: CancelEventArgs = js.native
  var textChanged: ProcessingModeEventArgs = js.native
  var userInput: EventArgs = js.native
}

object BootstrapDateEditEventMap {
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    calendarCustomDisabledDate: CalendarCustomDisabledDateEventArgs,
    closeUp: EventArgs,
    dateChanged: ProcessingModeEventArgs,
    dropDown: EventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    parseDate: ParseDateEventArgs,
    queryCloseUp: CancelEventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapDateEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick.asInstanceOf[js.Any], calendarCustomDisabledDate = calendarCustomDisabledDate.asInstanceOf[js.Any], closeUp = closeUp.asInstanceOf[js.Any], dateChanged = dateChanged.asInstanceOf[js.Any], dropDown = dropDown.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], parseDate = parseDate.asInstanceOf[js.Any], queryCloseUp = queryCloseUp.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapDateEditEventMap]
  }
  @scala.inline
  implicit class BootstrapDateEditEventMapOps[Self <: BootstrapDateEditEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonClick(value: ButtonEditClickEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalendarCustomDisabledDate(value: CalendarCustomDisabledDateEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarCustomDisabledDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseUp(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateChanged(value: ProcessingModeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropDown(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyDown(value: EditKeyEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPress(value: EditKeyEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyUp(value: EditKeyEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParseDate(value: ParseDateEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryCloseUp(value: CancelEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryCloseUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextChanged(value: ProcessingModeEventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserInput(value: EventArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInput")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

