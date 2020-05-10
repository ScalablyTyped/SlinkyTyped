package typingsSlinky.reactWidgets.dateTimePickerMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.reactWidgets.commonPropsMod.AutoFocus
import typingsSlinky.reactWidgets.commonPropsMod.ReactWidgetsCommonDropdownProps
import typingsSlinky.reactWidgets.reactWidgetsStrings.century
import typingsSlinky.reactWidgets.reactWidgetsStrings.decade
import typingsSlinky.reactWidgets.reactWidgetsStrings.month
import typingsSlinky.reactWidgets.reactWidgetsStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimePickerProps
  extends ReactWidgetsCommonDropdownProps
     with AutoFocus {
  /**
    * Whether to show the date picker button.
    * @default true
    * @deprecated Use `date` instead
    */
  var calendar: js.UndefOr[Boolean] = js.native
  /**
    * Adds a css class to the input container element.
    */
  var containerClassName: js.UndefOr[String] = js.native
  /**
    * Set the culture of the DateTimePicker, passed to the configured localizer.
    */
  var culture: js.UndefOr[String] = js.native
  /**
    * Default current date at which the calendar opens. If none is provided, opens at today's
    * date or the value date (if any).
    * @default Date()
    */
  var currentDate: js.UndefOr[js.Date] = js.native
  /**
    * Default value for current date. Useful for suggesting a date when the caldenar opens without keep forcing it once 'value' is set.
    */
  var date: js.UndefOr[Boolean] = js.native
  /**
    * Specify the element used to render the calendar dropdown icon.
    */
  var dateIcon: js.UndefOr[ReactElement] = js.native
  /**
    * Default current date
    */
  var defaultCurrentDate: js.UndefOr[js.Date] = js.native
  /**
    * The defaultOpen prop can be used to set an
    * initialization value for uncontrolled widgets.
    */
  var defaultOpen: js.UndefOr[Open] = js.native
  /**
    * Default value.
    */
  var defaultValue: js.UndefOr[js.Date] = js.native
  /**
    * The speed, in milliseconds, of the either dropdown animation.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * A string format to be used while the date input has focus. Useful for showing a simpler
    * format for inputing.
    */
  var editFormat: js.UndefOr[String] = js.native
  /**
    * The highest level view the calendar can navigate up to. This value should be higher than
    * initialView.
    */
  var finalView: js.UndefOr[month | year | decade | century] = js.native
  /**
    * A string format used to display the date value.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The starting and lowest level view the calendar can navigate down to.
    */
  var initialView: js.UndefOr[month | year | decade | century] = js.native
  /**
    * An object of props that is passed directly to the underlying input component.
    */
  var inputProps: js.UndefOr[js.Object] = js.native
  /**
    * The maximum Date that can be selected. Max only limits selection, it doesn't constrain
    * the date values that can be typed or pasted into the widget. If you need this behavior
    * you can constrain values via the onChange handler.
    * @default Date(2099, 11, 31)
    */
  var max: js.UndefOr[js.Date] = js.native
  /**
    * Object hash containing display text and/or text for screen readers. Use the messages
    * object to localize widget text and increase accessibility.
    */
  var messages: js.UndefOr[DateTimePickerMessages] = js.native
  /**
    * The minimum Date that can be selected. Min only limits selection, it doesn't constrain
    * the date values that can be typed or pasted into the widget. If you need this behavior
    * you can constrain values via the onChange handler.
    * @default Date(1900, 0, 1)
    */
  var min: js.UndefOr[js.Date] = js.native
  /**
    * The HTML name attribute, passed directly to the input element.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The native onBlur event, called when focus leaves the DateTimePicker entirely.
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Change event Handler that is called when the value is changed. The handler is called with
    * both the current Date object (or null if it was not parseable), and the second argument
    * is a string representation of the date value, formated by the format prop.
    */
  var onChange: js.UndefOr[
    js.Function2[/* date */ js.UndefOr[js.Date], /* dateStr */ js.UndefOr[String], Unit]
  ] = js.native
  /**
    * Change event Handler that is called when the currentDate is changed. The handler is
    * called with the currentDate object.
    */
  var onCurrentDateChange: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Date], Unit]] = js.native
  /**
    * The native onFocus event, called when focus enters the DateTimePicker.
    */
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * The native onKeyDown event, called preventDefault will prevent any custom behavior, included keyboard shortcuts.
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[_], Unit]] = js.native
  /**
    * The native onKeyPress event, called preventDefault will stop any custom behavior.
    */
  var onKeyPress: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent[_], Unit]] = js.native
  /**
    * This handler fires when an item has been selected from the list or calendar. It fires
    * before the onChange handler, and fires regardless of whether the value has actually
    * changed.
    */
  var onSelect: js.UndefOr[js.Function1[/* date */ js.UndefOr[js.Date], Unit]] = js.native
  /**
    * Called when the DateTimePicker is about to open or close. onToggle should be used when
    * the open prop is set otherwise the widget will never open or close.
    */
  var onToggle: js.UndefOr[js.Function1[/* isOpen */ Open, Unit]] = js.native
  /**
    * Whether or not the DateTimePicker is open. When unset (undefined) the DateTimePicker will
    * handle the opening and closing internally.
    * @default false
    */
  var open: js.UndefOr[Open] = js.native
  /**
    * Determines how the widget parses the typed date string into a Date object. You can
    * provide an array of formats to try, or provide a function that returns a date to handle
    * parsing yourself. When parse is unspecified and the format prop is a String parse will
    * automatically use that format as its default
    */
  var parse: js.UndefOr[(js.Function1[/* str */ String, js.Date]) | js.Array[String] | String] = js.native
  /**
    * Text to display in the input when the value is empty.
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * A Transition component from react-transition-group v2.
    * The provided component will be used instead of the default SlideDownTransition for fully customizable animations.
    * The transition component is also injected with a dropUp prop indicating the direction it should open.
    */
  var popupTransition: js.UndefOr[ReactComponentClass[_] | String] = js.native
  /**
    * The amount of minutes between each entry in the time list.
    */
  var step: js.UndefOr[Double | Boolean] = js.native
  /**
    * Whether to show the time picker button.
    * @default true
    */
  var time: js.UndefOr[Boolean] = js.native
  /**
    * A customize the rendering of times but providing a custom component.
    */
  var timeComponent: js.UndefOr[ReactComponentClass[_] | String] = js.native
  /**
    * A string format used by the time dropdown to render times.
    */
  var timeFormat: js.UndefOr[String] = js.native
  /**
    * Specify the element used to render the time list dropdown icon.
    */
  var timeIcon: js.UndefOr[ReactElement] = js.native
  /**
    * The current selected date, should be a Date instance or null.
    */
  var value: js.UndefOr[js.Date] = js.native
}

object DateTimePickerProps {
  @scala.inline
  def apply(): DateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerProps]
  }
  @scala.inline
  implicit class DateTimePickerPropsOps[Self <: DateTimePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendar(value: Boolean): Self = {
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
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("culture")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDateIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCurrentDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrentDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCurrentDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCurrentDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpen(value: Open): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEditFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalView(value: month | year | decade | century): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalView")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialView(value: month | year | decade | century): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialView")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: DateTimePickerMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* date */ js.UndefOr[js.Date], /* dateStr */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCurrentDateChange(value: /* date */ js.UndefOr[js.Date] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCurrentDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* event */ SyntheticKeyboardEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: /* event */ SyntheticKeyboardEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* date */ js.UndefOr[js.Date] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: /* isOpen */ Open => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Open): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withParseFunction1(value: /* str */ String => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: (js.Function1[/* str */ String, js.Date]) | js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
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
    def withPopupTransitionFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupTransitionComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopupTransition(value: ReactComponentClass[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeComponent(value: ReactComponentClass[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeIcon(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
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
  }
  
}

