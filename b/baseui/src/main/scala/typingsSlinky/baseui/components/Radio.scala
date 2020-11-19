package typingsSlinky.baseui.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.right
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.radioMod.RadioGroupOverrides
import typingsSlinky.baseui.radioMod.RadioOverrides
import typingsSlinky.baseui.radioMod.RadioProps
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  @JSImport("baseui/radio", "Radio")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.radioMod.Radio] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    
    @scala.inline
    def isError(value: Boolean): this.type = set("isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFocusVisible(value: Boolean): this.type = set("isFocusVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
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
    def onMouseDown(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: SyntheticMouseEvent[HTMLInputElement] => Unit): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def overrides(value: RadioOverrides with RadioGroupOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RadioProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Radio.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
