package typingsSlinky.reactVirtualKeyboard.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVirtualKeyboard.mod.KeyboardProps
import typingsSlinky.reactVirtualKeyboard.mod.ReactKeyboardOptions
import typingsSlinky.reactVirtualKeyboard.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactVirtualKeyboard {
  
  @JSImport("react-virtual-keyboard", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def callbackParent(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): this.type = set("callbackParent", js.Any.fromFunction3(value))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAccepted(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): this.type = set("onAccepted", js.Any.fromFunction3(value))
    
    @scala.inline
    def onChange(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): this.type = set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def options(value: ReactKeyboardOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KeyboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactVirtualKeyboard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
