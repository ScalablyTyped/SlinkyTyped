package typingsSlinky.blueprintjsDatetime.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsSlinky.blueprintjsCore.propsMod.HTMLInputProps
import typingsSlinky.blueprintjsDatetime.anon.PartialIPopoverProps
import typingsSlinky.blueprintjsDatetime.blueprintjsDatetimeBooleans.`false`
import typingsSlinky.blueprintjsDatetime.dateInputMod.IDateInputProps
import typingsSlinky.blueprintjsDatetime.datePickerCoreMod.IDatePickerModifiers
import typingsSlinky.blueprintjsDatetime.shortcutsMod.IDatePickerShortcut
import typingsSlinky.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsSlinky.blueprintjsDatetime.timePickerMod.TimePrecision
import typingsSlinky.reactDayPicker.propsMod.DayPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateInput {
  @JSImport("@blueprintjs/datetime", "DateInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsDatetime.mod.DateInput] {
    @scala.inline
    def canClearSelection(value: Boolean): this.type = set("canClearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clearButtonText(value: String): this.type = set("clearButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnSelection(value: Boolean): this.type = set("closeOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def dayPickerProps(value: DayPickerProps): this.type = set("dayPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: js.Date): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def initialMonth(value: js.Date): this.type = set("initialMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def inputProps(value: HTMLInputProps with IInputGroupProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def invalidDateMessage(value: String): this.type = set("invalidDateMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def localeUtils(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any): this.type = set("localeUtils", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def modifiers(value: IDatePickerModifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def onError(value: /* errorDate */ js.Date => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def outOfRangeMessage(value: String): this.type = set("outOfRangeMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def popoverProps(value: PartialIPopoverProps with js.Object): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def reverseMonthAndYearMenus(value: Boolean): this.type = set("reverseMonthAndYearMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def rightElement(value: ReactElement): this.type = set("rightElement", value.asInstanceOf[js.Any])
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
    @scala.inline
    def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: IDateInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    formatDate: (js.Date, js.UndefOr[String]) => String,
    parseDate: (String, js.UndefOr[String]) => js.Date | Null | `false`
  ): Builder = {
    val __props = js.Dynamic.literal(formatDate = js.Any.fromFunction2(formatDate), parseDate = js.Any.fromFunction2(parseDate))
    new Builder(js.Array(this.component, __props.asInstanceOf[IDateInputProps]))
  }
}

