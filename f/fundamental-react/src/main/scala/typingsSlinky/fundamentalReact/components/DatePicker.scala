package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.AnonDate
import typingsSlinky.fundamentalReact.AnonNextMonth
import typingsSlinky.fundamentalReact.AnonState
import typingsSlinky.fundamentalReact.datePickerMod.DatePickerProps
import typingsSlinky.fundamentalReact.datePickerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  @JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def blockedDates(value: js.Array[js.Date]): this.type = set("blockedDates", value.asInstanceOf[js.Any])
    @scala.inline
    def buttonLabel(value: String): this.type = set("buttonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disableAfterDate(value: js.Date): this.type = set("disableAfterDate", value.asInstanceOf[js.Any])
    @scala.inline
    def disableBeforeDate(value: js.Date): this.type = set("disableBeforeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def disableFutureDates(value: Boolean): this.type = set("disableFutureDates", value.asInstanceOf[js.Any])
    @scala.inline
    def disablePastDates(value: Boolean): this.type = set("disablePastDates", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def disableWeekday(value: js.Array[String]): this.type = set("disableWeekday", value.asInstanceOf[js.Any])
    @scala.inline
    def disableWeekends(value: Boolean): this.type = set("disableWeekends", value.asInstanceOf[js.Any])
    @scala.inline
    def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def enableRangeSelection(value: Boolean): this.type = set("enableRangeSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def localizedText(value: AnonNextMonth): this.type = set("localizedText", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: /* hasDateFormattedDate */ AnonDate => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def validationState(value: AnonState): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

