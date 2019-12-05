package typingsSlinky.rrc.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.LocationDescriptorObject
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.rrc.Anon_Pathname
import typingsSlinky.rrc.rrcMod.RouteConfiguration
import typingsSlinky.rrc.rrcMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigSwitch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rrc.rrcMod.ConfigSwitch] {
  @JSImport("rrc", "ConfigSwitch")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    location: LocationDescriptorObject[LocationState] with Anon_Pathname,
    routes: js.Array[RouteConfiguration],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rrc.rrcMod.ConfigSwitch] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwitchProps
}

