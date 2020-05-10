package typingsSlinky.reactBootstrapDaterangepicker.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.daterangepicker.daterangepickerStrings.center
import typingsSlinky.daterangepicker.daterangepickerStrings.down
import typingsSlinky.daterangepicker.daterangepickerStrings.left
import typingsSlinky.daterangepicker.daterangepickerStrings.right
import typingsSlinky.daterangepicker.daterangepickerStrings.up
import typingsSlinky.daterangepicker.mod.DateOrString
import typingsSlinky.daterangepicker.mod.Locale
import typingsSlinky.moment.mod.Duration_
import typingsSlinky.moment.mod.MomentInput
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateRangePicker {
  @JSGlobal("ReactBootstrapDaterangepicker.DateRangePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker.DateRangePicker
        ] {
    @scala.inline
    def alwaysShowCalendars(value: Boolean): this.type = set("alwaysShowCalendars", value.asInstanceOf[js.Any])
    @scala.inline
    def applyButtonClasses(value: String): this.type = set("applyButtonClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def autoApply(value: Boolean): this.type = set("autoApply", value.asInstanceOf[js.Any])
    @scala.inline
    def autoUpdateInput(value: Boolean): this.type = set("autoUpdateInput", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonClasses(value: js.Array[String]): this.type = set("buttonClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelButtonClasses(value: String): this.type = set("cancelButtonClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def containerClass(value: String): this.type = set("containerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyles(value: CSSProperties): this.type = set("containerStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def drops(value: down | up): this.type = set("drops", value.asInstanceOf[js.Any])
    @scala.inline
    def endDateDate(value: js.Date): this.type = set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def endDate(value: DateOrString): this.type = set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def isCustomDate(value: /* date */ DateOrString => js.UndefOr[String | js.Array[String]]): this.type = set("isCustomDate", js.Any.fromFunction1(value))
    @scala.inline
    def isInvalidDate(value: (/* startDate */ DateOrString, /* endDate */ js.UndefOr[DateOrString]) => Boolean): this.type = set("isInvalidDate", js.Any.fromFunction2(value))
    @scala.inline
    def linkedCalendars(value: Boolean): this.type = set("linkedCalendars", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDateDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: DateOrString): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def maxSpanDate(value: js.Date): this.type = set("maxSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def maxSpan(value: MomentInput | Duration_): this.type = set("maxSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def maxYear(value: Double): this.type = set("maxYear", value.asInstanceOf[js.Any])
    @scala.inline
    def minDateDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: DateOrString): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minYear(value: Double): this.type = set("minYear", value.asInstanceOf[js.Any])
    @scala.inline
    def onApply(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): this.type = set("onApply", js.Any.fromFunction2(value))
    @scala.inline
    def onCancel(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): this.type = set("onCancel", js.Any.fromFunction2(value))
    @scala.inline
    def onEvent(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): this.type = set("onEvent", js.Any.fromFunction2(value))
    @scala.inline
    def onHide(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): this.type = set("onHide", js.Any.fromFunction2(value))
    @scala.inline
    def onHideCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): this.type = set("onHideCalendar", js.Any.fromFunction2(value))
    @scala.inline
    def onShow(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): this.type = set("onShow", js.Any.fromFunction2(value))
    @scala.inline
    def onShowCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): this.type = set("onShowCalendar", js.Any.fromFunction2(value))
    @scala.inline
    def opens(value: left | right | center): this.type = set("opens", value.asInstanceOf[js.Any])
    @scala.inline
    def parentEl(value: String): this.type = set("parentEl", value.asInstanceOf[js.Any])
    @scala.inline
    def showCustomRangeLabel(value: Boolean): this.type = set("showCustomRangeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def showDropdowns(value: Boolean): this.type = set("showDropdowns", value.asInstanceOf[js.Any])
    @scala.inline
    def showISOWeekNumbers(value: Boolean): this.type = set("showISOWeekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def showWeekNumbers(value: Boolean): this.type = set("showWeekNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def singleDatePicker(value: Boolean): this.type = set("singleDatePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def startDateDate(value: js.Date): this.type = set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def startDate(value: DateOrString): this.type = set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def timePicker(value: Boolean): this.type = set("timePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def timePicker24Hour(value: Boolean): this.type = set("timePicker24Hour", value.asInstanceOf[js.Any])
    @scala.inline
    def timePickerIncrement(value: Double): this.type = set("timePickerIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def timePickerSeconds(value: Boolean): this.type = set("timePickerSeconds", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DateRangePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

