package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.inlineHelpMod.InlineHelpPlacement
import typingsSlinky.fundamentalReact.inlineHelpMod.InlineHelpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineHelp {
  
  @scala.inline
  def apply(placement: InlineHelpPlacement): Builder = {
    val __props = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InlineHelpProps]))
  }
  
  @JSImport("fundamental-react", "InlineHelp")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InlineHelpProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
