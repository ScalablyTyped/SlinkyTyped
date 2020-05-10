package typingsSlinky.blueprintjsDatetime.datePickerMod

import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerProps
  extends IDatePickerBaseProps
     with IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.native
  /**
    * Text for the reset button in the action bar.
    * @default "Clear"
    */
  var clearButtonText: js.UndefOr[String] = js.native
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `fromMonth` (use `minDate`), `month` (use
    * `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  /**
    * Initial day the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[js.Date] = js.native
  /**
    * Whether the current day should be highlighted in the calendar.
    * @default false
    */
  var highlightCurrentDay: js.UndefOr[Boolean] = js.native
  /**
    * Called when the user selects a day.
    * If being used in an uncontrolled manner, `selectedDate` will be `null` if the user clicks the currently selected
    * day. If being used in a controlled manner, `selectedDate` will contain the day clicked no matter what.
    * `isUserChange` is true if the user selected a day, and false if the date was automatically changed
    * by the user navigating to a new month or year rather than explicitly clicking on a date in the calendar.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.native
  /**
    * Called when the `shortcuts` props is enabled and the user changes the shortcut.
    */
  var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDatePickerShortcut, /* index */ Double, Unit]] = js.native
  /**
    * The currently selected shortcut.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  /**
    * Whether shortcuts to quickly select a date are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDatePickerShortcut]] = js.native
  /**
    * Whether the bottom bar displaying "Today" and "Clear" buttons should be shown.
    * @default false
    */
  var showActionsBar: js.UndefOr[Boolean] = js.native
  /**
    * Text for the today button in the action bar.
    * @default "Today"
    */
  var todayButtonText: js.UndefOr[String] = js.native
  /**
    * The currently selected day. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[js.Date] = js.native
}

object IDatePickerProps {
  @scala.inline
  def apply(): IDatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerProps]
  }
  @scala.inline
  implicit class IDatePickerPropsOps[Self <: IDatePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanClearSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canClearSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanClearSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canClearSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDayPickerProps(value: DayPickerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayPickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayPickerProps")(js.undefined)
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
    def withHighlightCurrentDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCurrentDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCurrentDay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): Self = {
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
    def withOnShortcutChange(value: (/* shortcut */ IDatePickerShortcut, /* index */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShortcutChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShortcutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShortcutChange")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedShortcutIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedShortcutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedShortcutIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: Boolean | js.Array[IDatePickerShortcut]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withShowActionsBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showActionsBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowActionsBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showActionsBar")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButtonText")(js.undefined)
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

