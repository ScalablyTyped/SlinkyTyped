package typingsSlinky.blueprintjsDatetime.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsDatetime.anon.FormatDate
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import typingsSlinky.blueprintjsDatetime.dateRangePickerMod.IDateRangePickerProps
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangePicker {
  
  @JSImport("@blueprintjs/datetime", "DateRangePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateRangePicker] {
    
    @scala.inline
    def allowSingleDayRange(value: Boolean): this.type = set("allowSingleDayRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def boundaryToModify(value: Boundary): this.type = set("boundaryToModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contiguousCalendarMonths(value: Boolean): this.type = set("contiguousCalendarMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayPickerProps(value: DayPickerProps): this.type = set("dayPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: DateRange): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialMonth(value: js.Date): this.type = set("initialMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localeUtils(value: FormatDate): this.type = set("localeUtils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modifiers(value: IDatePickerModifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* selectedDates */ DateRange => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHoverChange(
      value: (/* hoveredDates */ DateRange, /* hoveredDay */ js.Date, /* hoveredBoundary */ Boundary) => Unit
    ): this.type = set("onHoverChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def onShortcutChange(value: (/* shortcut */ IDateRangeShortcut, /* index */ Double) => Unit): this.type = set("onShortcutChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedShortcutIndex(value: Double): this.type = set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shortcutsVarargs(value: IDateRangeShortcut*): this.type = set("shortcuts", js.Array(value :_*))
    
    @scala.inline
    def shortcuts(value: Boolean | js.Array[IDateRangeShortcut]): this.type = set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def singleMonthOnly(value: Boolean): this.type = set("singleMonthOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timePickerProps(value: ITimePickerProps): this.type = set("timePickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timePrecision(value: TimePrecision): this.type = set("timePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: DateRange): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDateRangePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DateRangePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
