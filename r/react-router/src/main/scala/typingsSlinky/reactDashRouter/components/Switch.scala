package typingsSlinky.reactDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Switch] {
  @JSImport("react-router", "Switch")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(location: Location[LocationState] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Switch] = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Switch] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashRouter.reactDashRouterMod.Switch](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwitchProps
}

