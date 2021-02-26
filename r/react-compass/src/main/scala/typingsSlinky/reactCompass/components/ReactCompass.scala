package typingsSlinky.reactCompass.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCompass.mod.ReactCompassProps
import typingsSlinky.reactCompass.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCompass {
  
  @scala.inline
  def apply(direction: Double): Builder = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactCompassProps]))
  }
  
  @JSImport("react-compass", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def directionNames(value: js.Array[String]): this.type = set("directionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def directionNamesVarargs(value: String*): this.type = set("directionNames", js.Array(value :_*))
  }
  
  def withProps(p: ReactCompassProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
