package typingsSlinky.reduxRouter.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouter.mod.SwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  @JSImport("redux-router", "ReduxRouter.Switch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reduxRouter.mod.ReduxRouter.Switch] {
    
    @scala.inline
    def location(value: Location[LocationState]): this.type = set("location", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Switch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
