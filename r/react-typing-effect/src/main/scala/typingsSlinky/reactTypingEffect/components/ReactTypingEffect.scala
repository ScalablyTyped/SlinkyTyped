package typingsSlinky.reactTypingEffect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTypingEffect.mod.ReactTypingEffectProps
import typingsSlinky.reactTypingEffect.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypingEffect {
  
  @JSImport("react-typing-effect", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursor(value: String): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cursorClassName(value: String): this.type = set("cursorClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eraseDelay(value: Double): this.type = set("eraseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def eraseSpeed(value: Double): this.type = set("eraseSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def staticText(value: String): this.type = set("staticText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typingDelay(value: Double): this.type = set("typingDelay", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactTypingEffectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(text: String | js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactTypingEffectProps]))
  }
}
