package typingsSlinky.reactToolbox.timePickerTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerTheme extends js.Object {
  /**
    * Added to the number which is active in clock face.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * AM label in dialog header when mode is AM/PM.
    */
  var am: js.UndefOr[String] = js.native
  /**
    * Added to the dialog when the selected format is AM.
    */
  var amFormat: js.UndefOr[String] = js.native
  /**
    * Wrapper for AM and PM labels in header when mode is AM/PM.
    */
  var ampm: js.UndefOr[String] = js.native
  /**
    * Used for buttons inside the dialog of the picker.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Clock root class element.
    */
  var clock: js.UndefOr[String] = js.native
  /**
    * Wrapper for the proper positioning of the clock.
    */
  var clockWrapper: js.UndefOr[String] = js.native
  /**
    * Used for the dialog component.
    */
  var dialog: js.UndefOr[String] = js.native
  /**
    * Used to style the clock face.
    */
  var face: js.UndefOr[String] = js.native
  /**
    * Used for the clock's hand.
    */
  var hand: js.UndefOr[String] = js.native
  /**
    * Dialog header wrapper class.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * Used for hours in dialog header.
    */
  var hours: js.UndefOr[String] = js.native
  /**
    * Added to the dialog hours are displayed.
    */
  var hoursDisplay: js.UndefOr[String] = js.native
  /**
    * Used for Input element that opens the picker.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used for the knob of the hand.
    */
  var knob: js.UndefOr[String] = js.native
  /**
    * Used for minutes in dialog header.
    */
  var minutes: js.UndefOr[String] = js.native
  /**
    * Added to the dialog minutes are displayed.
    */
  var minutesDisplay: js.UndefOr[String] = js.native
  /**
    * Each of the numbers in the clock's face.
    */
  var number: js.UndefOr[String] = js.native
  /**
    * Placeholder for the clock inside the dialog (inner wrapper).
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * PM label in dialog header when mode is AM/PM.
    */
  var pm: js.UndefOr[String] = js.native
  /**
    * Added to the dialog when the selected format is PM.
    */
  var pmFormat: js.UndefOr[String] = js.native
  /**
    * Is the : separator between hours and minutes in dialog header.
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Added to the knob when no round number is selected.
    */
  var small: js.UndefOr[String] = js.native
}

object TimePickerTheme {
  @scala.inline
  def apply(): TimePickerTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerTheme]
  }
  @scala.inline
  implicit class TimePickerThemeOps[Self <: TimePickerTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("am")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("am")(js.undefined)
        ret
    }
    @scala.inline
    def withAmFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAmpm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ampm")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withClock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(js.undefined)
        ret
    }
    @scala.inline
    def withClockWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(js.undefined)
        ret
    }
    @scala.inline
    def withFace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("face")(js.undefined)
        ret
    }
    @scala.inline
    def withHand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hand")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHours(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.undefined)
        ret
    }
    @scala.inline
    def withHoursDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoursDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoursDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withKnob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knob")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutesDisplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutesDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm")(js.undefined)
        ret
    }
    @scala.inline
    def withPmFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pmFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPmFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pmFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
  }
  
}

