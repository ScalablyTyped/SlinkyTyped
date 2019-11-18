package typingsSlinky.reactDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Router] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashRouter.reactDashRouterMod.Router].asInstanceOf[String | js.Object]
  def apply(history: History[LocationState], overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Router] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RouterProps
}

