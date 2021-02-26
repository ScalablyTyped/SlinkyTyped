package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.hotkeyMod.IHotkeyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hotkey {
  
  @scala.inline
  def apply(combo: String): Builder = {
    val __props = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IHotkeyProps]))
  }
  
  @JSImport("@blueprintjs/core", "Hotkey")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Hotkey] {
    
    @scala.inline
    def allowInInput(value: Boolean): this.type = set("allowInInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def global(value: Boolean): this.type = set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyDown(value: /* e */ KeyboardEvent => _): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: /* e */ KeyboardEvent => _): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def preventDefault(value: Boolean): this.type = set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopPropagation(value: Boolean): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IHotkeyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
