package typingsSlinky.rrc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rrc.anon.LocationDescriptorObjectL
import typingsSlinky.rrc.mod.RouteConfiguration
import typingsSlinky.rrc.mod.SwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigSwitch {
  
  @scala.inline
  def apply(location: LocationDescriptorObjectL, routes: js.Array[RouteConfiguration]): Default[tag.type, typingsSlinky.rrc.mod.ConfigSwitch] = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.rrc.mod.ConfigSwitch](js.Array(this.component, __props.asInstanceOf[SwitchProps]))
  }
  
  @JSImport("rrc", "ConfigSwitch")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SwitchProps): Default[tag.type, typingsSlinky.rrc.mod.ConfigSwitch] = new Default[tag.type, typingsSlinky.rrc.mod.ConfigSwitch](js.Array(this.component, p.asInstanceOf[js.Any]))
}
