package typingsSlinky.gestaltDatepicker.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.dateFns.mod.Locale
import typingsSlinky.gestaltDatepicker.anon.Event
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.down
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.end
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.left
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.right
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.start
import typingsSlinky.gestaltDatepicker.gestaltDatepickerStrings.up
import typingsSlinky.gestaltDatepicker.mod.DatePickerProps
import typingsSlinky.gestaltDatepicker.mod.default
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GestaltDatepicker {
  
  @JSImport("gestalt-datepicker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def excludeDatesVarargs(value: js.Date*): this.type = set("excludeDates", js.Array(value :_*))
    
    @scala.inline
    def excludeDates(value: js.Array[js.Date]): this.type = set("excludeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def idealDirection(value: up | right | down | left): this.type = set("idealDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def includeDatesVarargs(value: js.Date*): this.type = set("includeDates", js.Array(value :_*))
    
    @scala.inline
    def includeDates(value: js.Array[js.Date]): this.type = set("includeDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localeData(value: Locale): this.type = set("localeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextRefRefObject(value: ReactRef[_]): this.type = set("nextRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("nextRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def nextRef(value: Ref[_]): this.type = set("nextRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextRefNull: this.type = set("nextRef", null)
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rangeEndDate(value: js.Date): this.type = set("rangeEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rangeSelector(value: start | end): this.type = set("rangeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rangeStartDate(value: js.Date): this.type = set("rangeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DatePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(id: String, onChange: Event => Unit): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[DatePickerProps]))
  }
}
