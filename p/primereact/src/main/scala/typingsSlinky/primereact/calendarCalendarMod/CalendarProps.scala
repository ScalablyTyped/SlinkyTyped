package typingsSlinky.primereact.calendarCalendarMod

import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import typingsSlinky.primereact.anon.OriginalEventEvent
import typingsSlinky.primereact.anon.OriginalEventValue
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.native
  var ariaLabelledBy: js.UndefOr[String] = js.native
  var autoZIndex: js.UndefOr[Boolean] = js.native
  var baseZIndex: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var clearButtonStyleClass: js.UndefOr[String] = js.native
  var dateFormat: js.UndefOr[String] = js.native
  var dateTemplate: js.UndefOr[js.Function1[/* dateMeta */ DateMetaData, TagMod[Any]]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledDates: js.UndefOr[js.Array[js.Date]] = js.native
  var disabledDays: js.UndefOr[js.Array[Double]] = js.native
  var footerTemplate: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var headerTemplate: js.UndefOr[js.Function0[TagMod[Any]]] = js.native
  var hideOnDateTimeSelect: js.UndefOr[Boolean] = js.native
  var hourFormat: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inputClassName: js.UndefOr[String] = js.native
  var inputId: js.UndefOr[String] = js.native
  var inputStyle: js.UndefOr[js.Object] = js.native
  var locale: js.UndefOr[LocaleSettings] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var maxDateCount: js.UndefOr[Double] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var monthNavigator: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var numberOfMonths: js.UndefOr[Double] = js.native
  var onBlur: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ OriginalEventEvent, Unit]] = js.native
  var onClearButtonClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onInput: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* e */ OriginalEventValue, Unit]] = js.native
  var onTodayButtonClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onViewDateChange: js.UndefOr[js.Function1[/* e */ OriginalEventValue, Unit]] = js.native
  var panelClassName: js.UndefOr[String] = js.native
  var panelStyle: js.UndefOr[js.Object] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnlyInput: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var selectOtherMonths: js.UndefOr[Boolean] = js.native
  var selectionMode: js.UndefOr[String] = js.native
  var shortYearCutoff: js.UndefOr[String] = js.native
  var showButtonBar: js.UndefOr[Boolean] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var showOnFocus: js.UndefOr[Boolean] = js.native
  var showOtherMonths: js.UndefOr[Boolean] = js.native
  var showSeconds: js.UndefOr[Boolean] = js.native
  var showTime: js.UndefOr[Boolean] = js.native
  var showWeek: js.UndefOr[Boolean] = js.native
  var stepHour: js.UndefOr[Double] = js.native
  var stepMinute: js.UndefOr[Double] = js.native
  var stepSecond: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var tabIndex: js.UndefOr[String] = js.native
  var timeOnly: js.UndefOr[Boolean] = js.native
  var todayButtonClassName: js.UndefOr[String] = js.native
  var tooltip: js.UndefOr[js.Any] = js.native
  var tooltipOptions: js.UndefOr[TooltipOptions] = js.native
  var touchUI: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[js.Date | js.Array[js.Date]] = js.native
  var view: js.UndefOr[String] = js.native
  var viewDate: js.UndefOr[js.Date] = js.native
  var yearNavigator: js.UndefOr[Boolean] = js.native
  var yearRange: js.UndefOr[String] = js.native
}

object CalendarProps {
  @scala.inline
  def apply(): CalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarProps]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendTo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabelledBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabelledBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoZIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClearButtonStyleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonStyleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonStyleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonStyleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTemplate(value: /* dateMeta */ DateMetaData => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDateTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDays(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDays")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterTemplate(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFooterTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnDateTimeSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnDateTimeSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnDateTimeSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnDateTimeSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withHourFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInputClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withInputId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(js.undefined)
        ret
    }
    @scala.inline
    def withInputStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: LocaleSettings): Self = {
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
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDateCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthNavigator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNavigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthNavigator")(js.undefined)
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
    def withNumberOfMonths(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* e */ OriginalEventEvent => Unit): Self = {
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
    def withOnClearButtonClick(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClearButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClearButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* e */ OriginalEventValue => Unit): Self = {
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
    def withOnTodayButtonClick(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTodayButtonClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTodayButtonClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTodayButtonClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnViewDateChange(value: /* e */ OriginalEventValue => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnViewDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelStyle")(js.undefined)
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
    def withReadOnlyInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnlyInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnlyInput")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectOtherMonths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOtherMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectOtherMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectOtherMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShortYearCutoff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortYearCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortYearCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortYearCutoff")(js.undefined)
        ret
    }
    @scala.inline
    def withShowButtonBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtonBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowButtonBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showButtonBar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(js.undefined)
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
    def withShowSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeek(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withStepHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepHour")(js.undefined)
        ret
    }
    @scala.inline
    def withStepMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withStepSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipOptions(value: TooltipOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchUI")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Date | js.Array[js.Date]): Self = {
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
    def withView(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewDate")(js.undefined)
        ret
    }
    @scala.inline
    def withYearNavigator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearNavigator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearNavigator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearNavigator")(js.undefined)
        ret
    }
    @scala.inline
    def withYearRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearRange")(js.undefined)
        ret
    }
  }
  
}

