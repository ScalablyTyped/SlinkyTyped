package typingsSlinky.primereact.components

import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.OriginalEventTarget
import typingsSlinky.primereact.anon.OriginalEventValue
import typingsSlinky.primereact.calendarCalendarMod.CalendarProps
import typingsSlinky.primereact.calendarCalendarMod.DateMetaData
import typingsSlinky.primereact.calendarCalendarMod.LocaleSettings
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("primereact/calendar", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.calendarMod.Calendar] {
    
    @scala.inline
    def appendTo(value: js.Any): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoZIndex(value: Boolean): this.type = set("autoZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearButtonClassName(value: String): this.type = set("clearButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateFormat(value: String): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dateTemplate(value: /* dateMeta */ DateMetaData => ReactElement): this.type = set("dateTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def disabledDays(value: js.Array[Double]): this.type = set("disabledDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDaysVarargs(value: Double*): this.type = set("disabledDays", js.Array(value :_*))
    
    @scala.inline
    def footerTemplate(value: () => ReactElement): this.type = set("footerTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def headerTemplate(value: () => ReactElement): this.type = set("headerTemplate", js.Any.fromFunction0(value))
    
    @scala.inline
    def hideOnDateTimeSelect(value: Boolean): this.type = set("hideOnDateTimeSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hourFormat(value: String): this.type = set("hourFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: String): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputStyle(value: js.Object): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepInvalid(value: Boolean): this.type = set("keepInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: LocaleSettings): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDateCount(value: Double): this.type = set("maxDateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def monthNavigator(value: Boolean): this.type = set("monthNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def numberOfMonths(value: Double): this.type = set("numberOfMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* event */ Event => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* e */ OriginalEventTarget => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClearButtonClick(value: /* event */ Event => Unit): this.type = set("onClearButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: /* event */ Event => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(value: /* event */ Event => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: /* e */ OriginalEventValue => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTodayButtonClick(value: /* event */ Event => Unit): this.type = set("onTodayButtonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onViewDateChange(value: /* e */ OriginalEventValue => Unit): this.type = set("onViewDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def panelClassName(value: String): this.type = set("panelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelStyle(value: js.Object): this.type = set("panelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnlyInput(value: Boolean): this.type = set("readOnlyInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectOtherMonths(value: Boolean): this.type = set("selectOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectionMode(value: String): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shortYearCutoff(value: String): this.type = set("shortYearCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showButtonBar(value: Boolean): this.type = set("showButtonBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showMillisec(value: Boolean): this.type = set("showMillisec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showOnFocus(value: Boolean): this.type = set("showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showOtherMonths(value: Boolean): this.type = set("showOtherMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSeconds(value: Boolean): this.type = set("showSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showTime(value: Boolean): this.type = set("showTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showWeek(value: Boolean): this.type = set("showWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepHour(value: Double): this.type = set("stepHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepMillisec(value: Double): this.type = set("stepMillisec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepMinute(value: Double): this.type = set("stepMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stepSecond(value: Double): this.type = set("stepSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeOnly(value: Boolean): this.type = set("timeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def todayButtonClassName(value: String): this.type = set("todayButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: js.Any): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchUI(value: Boolean): this.type = set("touchUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Date | js.Array[js.Date]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueDate(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Date*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def view(value: String): this.type = set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewDate(value: js.Date): this.type = set("viewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yearNavigator(value: Boolean): this.type = set("yearNavigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def yearRange(value: String): this.type = set("yearRange", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
