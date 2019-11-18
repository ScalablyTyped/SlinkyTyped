package typingsSlinky.reactDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Switch] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashRouter.reactDashRouterMod.Switch].asInstanceOf[String | js.Object]
  def apply(location: Location[LocationState] = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Switch] = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SwitchProps
}

