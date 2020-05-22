package typingsSlinky.blueprintjsDatetime.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsDatetime.anon.FormatDate
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  @JSImport("@blueprintjs/datetime", "DatePicker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DatePicker] {
    @scala.inline
    def canClearSelection(value: Boolean): this.type = set("canClearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clearButtonText(value: String): this.type = set("clearButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def dayPickerProps(value: DayPickerProps): this.type = set("dayPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def highlightCurrentDay(value: Boolean): this.type = set("highlightCurrentDay", value.asInstanceOf[js.Any])
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
    def onChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onShortcutChange(value: (/* shortcut */ IDatePickerShortcut, /* index */ Double) => Unit): this.type = set("onShortcutChange", js.Any.fromFunction2(value))
    @scala.inline
    def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedShortcutIndex(value: Double): this.type = set("selectedShortcutIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def shortcuts(value: Boolean | js.Array[IDatePickerShortcut]): this.type = set("shortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def showActionsBar(value: Boolean): this.type = set("showActionsBar", value.asInstanceOf[js.Any])
    @scala.inline
    def timePickerProps(value: ITimePickerProps): this.type = set("timePickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def timePrecision(value: TimePrecision): this.type = set("timePrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def todayButtonText(value: String): this.type = set("todayButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

