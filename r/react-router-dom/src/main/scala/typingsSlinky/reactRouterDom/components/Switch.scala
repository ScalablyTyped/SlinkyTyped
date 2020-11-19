package typingsSlinky.reactRouterDom.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("react-router-dom", "Switch")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactRouterDom.mod.Switch] {
    
    @scala.inline
    def location(value: Location[LocationState]): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
