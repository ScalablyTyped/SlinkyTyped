package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.vertical
import typingsSlinky.baseui.radioMod.RadioGroupOverrides
import typingsSlinky.baseui.radioMod.RadioGroupProps
import typingsSlinky.baseui.radioMod.RadioOverrides
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  @JSImport("baseui/radio", "RadioGroup")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.radioMod.RadioGroup] {
    
    @scala.inline
    def align(value: horizontal | vertical): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-errormessage`(value: String): this.type = set("aria-errormessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isError(value: Boolean): this.type = set("isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelPlacement(value: top | right | bottom | left): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: ChangeEvent[HTMLInputElement] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: RadioOverrides with RadioGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RadioGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
