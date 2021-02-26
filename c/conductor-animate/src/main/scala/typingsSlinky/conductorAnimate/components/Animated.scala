package typingsSlinky.conductorAnimate.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.conductorAnimate.mod.AnimatedProps
import typingsSlinky.react.mod.ReactNodeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animated {
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnimatedProps]))
  }
  
  @JSImport("conductor-animate", "Animated")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.conductorAnimate.mod.Animated] {
    
    @scala.inline
    def additional(value: js.Object): this.type = set("additional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: ReactElement | ReactNodeArray): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenNull: this.type = set("children", null)
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimatedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
