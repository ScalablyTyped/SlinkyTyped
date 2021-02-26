package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.Id
import typingsSlinky.baseui.datepickerMod.TimezonePickerProps
import typingsSlinky.baseui.selectMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimezonePicker {
  
  @JSImport("baseui/datepicker", "TimezonePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.datepickerMod.TimezonePicker] {
    
    @scala.inline
    def date(value: js.Date): this.type = set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mapLabels(value: /* args */ Option => ReactElement): this.type = set("mapLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* value */ Id => _): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: typingsSlinky.baseui.anon.Select): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positive(value: Boolean): this.type = set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimezonePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimezonePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
