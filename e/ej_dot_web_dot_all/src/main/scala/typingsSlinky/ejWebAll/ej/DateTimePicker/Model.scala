package typingsSlinky.ejWebAll.ej.DateTimePicker

import typingsSlinky.ejWebAll.ej.DatePicker.Header
import typingsSlinky.ejWebAll.ej.DatePicker.Level
import typingsSlinky.ejWebAll.ej.popupPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Used to allow or restrict the editing in DateTimePicker input field directly. By setting false to this API, You can only pick the date and time values from DateTimePicker popup.
    * @Default {true}
    */
  var allowEdit: js.UndefOr[Boolean] = js.native
  /** Fires before the datetime popup closed in the DateTimePicker.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  /** Fires before the datetime popup open in the DateTimePicker.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  /** Disable the list of specified date value.
    * @Default {{}}
    */
  var blackoutDates: js.UndefOr[js.Any] = js.native
  /** Displays the custom text for the buttons inside the DateTimePicker popup. when the culture value changed, we can change the buttons text based on the culture.
    * @Default {{ today: Today, timeNow: Time Now, done: Done, timeTitle: Time }}
    */
  var buttonText: js.UndefOr[ButtonText] = js.native
  /** Fires when the datetime value changed in the DateTimePicker textbox.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Fires when DateTimePicker popup closes.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  /** Fires after DateTimePicker control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Set the root class for DateTimePicker theme. This cssClass API helps to use custom skinning option for DateTimePicker control.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Defines the datetime format displayed in the DateTimePicker. The value should be a combination of date format and time format.
    * @Default {M/d/yyyy h:mm tt}
    */
  var dateTimeFormat: js.UndefOr[String] = js.native
  /** Specifies the header format of the datepicker inside the DateTimePicker popup. See DatePicker.Header
    * @Default {ej.DatePicker.Header.Short}
    */
  var dayHeaderFormat: js.UndefOr[Header | String] = js.native
  /** Specifies the navigation depth level in DatePicker calendar inside DateTimePicker popup. This option is not applied when start level view option is lower than depth level view.
    * See ej.DatePicker.Level
    */
  var depthLevel: js.UndefOr[Level | String] = js.native
  /** Fires when the DateTimePicker is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Specifies the list of time range to be disabled.
    * @Default {{}}
    */
  var disableTimeRanges: js.UndefOr[js.Any] = js.native
  /** Enable or disable the animation effect in DateTimePicker.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Enables or disables the state maintenance of DateTimePicker.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Sets the DateTimePicker direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** When enableStrictMode true it allows the value outside of the range also but it highlights the textbox with error class, otherwise it internally changed to the correct value.
    * @Default {false}
    */
  var enableStrictMode: js.UndefOr[Boolean] = js.native
  /** When this property is set to false, it disables the DateTimePicker control.
    * @Default {false}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Fires when the focus-in happens in the DateTimePicker textbox.
    */
  var focusIn: js.UndefOr[js.Function1[/* e */ FocusInEventArgs, Unit]] = js.native
  /** Fires when the focus-out happens in the DateTimePicker textbox.
    */
  var focusOut: js.UndefOr[js.Function1[/* e */ FocusOutEventArgs, Unit]] = js.native
  /** Specifies the header format to be displayed in the DatePicker calendar inside the DateTimePicker popup.
    * @Default {MMMM yyyy}
    */
  var headerFormat: js.UndefOr[String] = js.native
  /** Defines the height of the DateTimePicker textbox.
    * @Default {30}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the HTML Attributes of the ejDateTimePicker
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Sets the time interval between the two adjacent time values in the time popup.
    * @Default {30}
    */
  var interval: js.UndefOr[Double] = js.native
  /** Defines the localization culture for DateTimePicker.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum value to the DateTimePicker. Beyond the maximum value an error class is added to the wrapper element when we set true to enableStrictMode.
    * @Default {new Date(12/31/2099 11:59:59 PM)}
    */
  var maxDateTime: js.UndefOr[String | js.Date] = js.native
  /** Sets the minimum value to the DateTimePicker. Behind the minimum value an error class is added to the wrapper element.
    * @Default {new Date(1/1/1900 12:00:00 AM)}
    */
  var minDateTime: js.UndefOr[String | js.Date] = js.native
  /** Fires when DateTimePicker popup opens.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Specifies the popup position of DateTimePicker.See below to know available popup positions
    * @Default {ej.PopupPosition.Bottom}
    */
  var popupPosition: js.UndefOr[String | typingsSlinky.ejWebAll.ej.popupPosition] = js.native
  /** Indicates that the DateTimePicker value can only be read and canâ€™t change.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** It allows showing days in other months of DatePicker calendar inside the DateTimePicker popup.
    * @Default {true}
    */
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  /** Shows or hides the arrow button from the DateTimePicker textbox. When the button disabled, the DateTimePicker popup opens while focus in the textbox and hides while focus out from
    * the textbox.
    * @Default {true}
    */
  var showPopupButton: js.UndefOr[Boolean] = js.native
  /** Changes the sharped edges into rounded corner for the DateTimePicker textbox and popup.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Specifies the special dates in DateTimePicker.
    * @Default {null}
    */
  var specialDates: js.UndefOr[js.Any] = js.native
  /** Specifies the start day of the week in datepicker inside the DateTimePicker popup.
    * @Default {1}
    */
  var startDay: js.UndefOr[Double] = js.native
  /** Specifies the start level view in datepicker inside the DateTimePicker popup. See DatePicker.Level
    * @Default {ej.DatePicker.Level.Month or month}
    */
  var startLevel: js.UndefOr[Level | String] = js.native
  /** Specifies the number of months to navigate at one click of next and previous button in datepicker inside the DateTimePicker popup.
    * @Default {1}
    */
  var stepMonths: js.UndefOr[Double] = js.native
  /** Defines the time format displayed in the time dropdown inside the DateTimePicker popup.
    * @Default {h:mm tt}
    */
  var timeDisplayFormat: js.UndefOr[String] = js.native
  /** We can drill down up to time interval on selected date with meridian details.
    * @Default {{ enabled: false, interval: 5, showMeridian: false, autoClose: true }}
    */
  var timeDrillDown: js.UndefOr[TimeDrillDown] = js.native
  /** Defines the width of the time dropdown inside the DateTimePicker popup.
    * @Default {100}
    */
  var timePopupWidth: js.UndefOr[String | Double] = js.native
  /** Set the jQuery validation error message in DateTimePicker.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Set the jQuery validation rules in DateTimePicker.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** Sets the DateTime value to the control.
    */
  var value: js.UndefOr[String | js.Date] = js.native
  /** Specifies the water mark text to be displayed in input text.
    * @Default {Select date and time}
    */
  var watermarkText: js.UndefOr[String] = js.native
  /** Defines the width of the DateTimePicker textbox.
    * @Default {143}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBlackoutDates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackoutDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlackoutDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackoutDates")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonText(value: ButtonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ ChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: /* e */ CloseEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDayHeaderFormat(value: Header | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDepthLevel(value: Level | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTimeRanges(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTimeRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTimeRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTimeRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableStrictMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStrictMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableStrictMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableStrictMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusIn(value: /* e */ FocusInEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusIn")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusOut(value: /* e */ FocusOutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusOut")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDateTime(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDateTime(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupPosition(value: String | popupPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOtherMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOtherMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOtherMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOtherMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPopupButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPopupButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopupButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialDates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialDates")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDay")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLevel(value: Level | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withStepMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDisplayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDisplayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeDisplayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDisplayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDrillDown(value: TimeDrillDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDrillDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeDrillDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDrillDown")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePopupWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePopupWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePopupWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePopupWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withWatermarkText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatermarkText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watermarkText")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

