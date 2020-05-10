package typingsSlinky.blueprintjsDatetime.dateRangePickerMod

import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerBaseProps
import typingsSlinky.blueprintjsDatetime.dateUtilsMod.DateRange
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateRangePickerProps
  extends IDatePickerBaseProps
     with IProps {
  /**
    * Whether the start and end dates of the range can be the same day.
    * If `true`, clicking a selected date will create a one-day range.
    * If `false`, clicking a selected date will clear the selection.
    * @default false
    */
  var allowSingleDayRange: js.UndefOr[Boolean] = js.native
  /**
    * The date-range boundary that the next click should modify.
    * This will be honored unless the next click would overlap the other boundary date.
    * In that case, the two boundary dates will be auto-swapped to keep them in chronological order.
    * If `undefined`, the picker will revert to its default selection behavior.
    */
  var boundaryToModify: js.UndefOr[Boundary] = js.native
  /**
    * Whether displayed months in the calendar are contiguous.
    * If false, each side of the calendar can move independently to non-contiguous months.
    * @default true
    */
  var contiguousCalendarMonths: js.UndefOr[Boolean] = js.native
  /**
    * Props to pass to ReactDayPicker. See API documentation
    * [here](http://react-day-picker.js.org/api/DayPicker).
    *
    * The following props are managed by the component and cannot be configured:
    * `canChangeMonth`, `captionElement`, `numberOfMonths`, `fromMonth` (use
    * `minDate`), `month` (use `initialMonth`), `toMonth` (use `maxDate`).
    */
  var dayPickerProps: js.UndefOr[DayPickerProps] = js.native
  /**
    * Initial `DateRange` the calendar will display as selected.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[DateRange] = js.native
  /**
    * Called when the user selects a day.
    * If no days are selected, it will pass `[null, null]`.
    * If a start date is selected but not an end date, it will pass `[selectedDate, null]`.
    * If both a start and end date are selected, it will pass `[startDate, endDate]`.
    */
  var onChange: js.UndefOr[js.Function1[/* selectedDates */ DateRange, Unit]] = js.native
  /**
    * Called when the user changes the hovered date range, either from mouseenter or mouseleave.
    * When triggered from mouseenter, it will pass the date range that would result from next click.
    * When triggered from mouseleave, it will pass `undefined`.
    */
  var onHoverChange: js.UndefOr[
    js.Function3[
      /* hoveredDates */ DateRange, 
      /* hoveredDay */ js.Date, 
      /* hoveredBoundary */ Boundary, 
      Unit
    ]
  ] = js.native
  /**
    * Called when the `shortcuts` props is enabled and the user changes the shortcut.
    */
  var onShortcutChange: js.UndefOr[js.Function2[/* shortcut */ IDateRangeShortcut, /* index */ Double, Unit]] = js.native
  /**
    * The currently selected shortcut.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var selectedShortcutIndex: js.UndefOr[Double] = js.native
  /**
    * Whether shortcuts to quickly select a range of dates are displayed or not.
    * If `true`, preset shortcuts will be displayed.
    * If `false`, no shortcuts will be displayed.
    * If an array is provided, the custom shortcuts will be displayed.
    * @default true
    */
  var shortcuts: js.UndefOr[Boolean | js.Array[IDateRangeShortcut]] = js.native
  /**
    * Whether to show only a single month calendar.
    * @default false
    */
  var singleMonthOnly: js.UndefOr[Boolean] = js.native
  /**
    * The currently selected `DateRange`.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[DateRange] = js.native
}

object IDateRangePickerProps {
  @scala.inline
  def apply(): IDateRangePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateRangePickerProps]
  }
  @scala.inline
  implicit class IDateRangePickerPropsOps[Self <: IDateRangePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSingleDayRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleDayRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSingleDayRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSingleDayRange")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryToModify(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryToModify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryToModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryToModify")(js.undefined)
        ret
    }
    @scala.inline
    def withContiguousCalendarMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contiguousCalendarMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContiguousCalendarMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contiguousCalendarMonths")(js.undefined)
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
    def withDefaultValue(value: DateRange): Self = {
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
    def withOnChange(value: /* selectedDates */ DateRange => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHoverChange(
      value: (/* hoveredDates */ DateRange, /* hoveredDay */ js.Date, /* hoveredBoundary */ Boundary) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoverChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnHoverChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHoverChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShortcutChange(value: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit): Self = {
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
    def withShortcuts(value: Boolean | js.Array[IDateRangeShortcut]): Self = {
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
    def withSingleMonthOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleMonthOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleMonthOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleMonthOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: DateRange): Self = {
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

