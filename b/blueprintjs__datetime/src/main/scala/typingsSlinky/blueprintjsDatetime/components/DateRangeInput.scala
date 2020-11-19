package typingsSlinky.blueprintjsDatetime.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsDatetime.anon.FormatDate
import typingsSlinky.blueprintjsDatetime.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.dateRangeInputMod.IDateRangeInputProps
import typingsSlinky.blueprintjsDatetime.dateRangeMod.DateRange
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDateRangeShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangeInput {
  
  @JSImport("@blueprintjs/datetime", "DateRangeInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateRangeInput] {
    
    @scala.inline
    def allowSingleDayRange(value: Boolean): this.type = set("allowSingleDayRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeOnSelection(value: Boolean): this.type = set("closeOnSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contiguousCalendarMonths(value: Boolean): this.type = set("contiguousCalendarMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dayPickerProps(value: DayPickerProps): this.type = set("dayPickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: DateRange): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def endInputProps(value: HTMLInputProps with IInputGroupProps): this.type = set("endInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialMonth(value: js.Date): this.type = set("initialMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invalidDateMessage(value: String): this.type = set("invalidDateMessage", value.asInstanceOf[js.Any])
    
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
    def onChange(value: /* selectedRange */ DateRange => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: /* errorRange */ DateRange => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def outOfRangeMessage(value: String): this.type = set("outOfRangeMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overlappingDatesMessage(value: String): this.type = set("overlappingDatesMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popoverProps(value: PartialIPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectAllOnFocus(value: Boolean): this.type = set("selectAllOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shortcutsVarargs(value: IDateRangeShortcut*): this.type = set("shortcuts", js.Array(value :_*))
    
    @scala.inline
    def shortcuts(value: Boolean | js.Array[IDateRangeShortcut]): this.type = set("shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def singleMonthOnly(value: Boolean): this.type = set("singleMonthOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def startInputProps(value: HTMLInputProps with IInputGroupProps): this.type = set("startInputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timePickerProps(value: ITimePickerProps): this.type = set("timePickerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timePrecision(value: TimePrecision): this.type = set("timePrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: DateRange): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDateRangeInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    formatDate: (js.Date, js.UndefOr[String]) => String,
    parseDate: (String, js.UndefOr[String]) => js.Date | Null | `false`
  ): Builder = {
    val __props = js.Dynamic.literal(formatDate = js.Any.fromFunction2(formatDate), parseDate = js.Any.fromFunction2(parseDate))
    new Builder(js.Array(this.component, __props.asInstanceOf[IDateRangeInputProps]))
  }
}
