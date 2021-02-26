package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.Date
import typingsSlinky.fundamentalReact.anon.NextMonth
import typingsSlinky.fundamentalReact.anon.State
import typingsSlinky.fundamentalReact.datePickerMod.DatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("fundamental-react", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fundamentalReact.mod.DatePicker] {
    
    @scala.inline
    def blockedDates(value: js.Array[js.Date]): this.type = set("blockedDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blockedDatesVarargs(value: js.Date*): this.type = set("blockedDates", js.Array(value :_*))
    
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
    def disableWeekdayVarargs(value: String*): this.type = set("disableWeekday", js.Array(value :_*))
    
    @scala.inline
    def disableWeekends(value: Boolean): this.type = set("disableWeekends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def enableRangeSelection(value: Boolean): this.type = set("enableRangeSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localizedText(value: NextMonth): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: /* hasDateFormattedDate */ Date => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def validationState(value: State): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DatePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
