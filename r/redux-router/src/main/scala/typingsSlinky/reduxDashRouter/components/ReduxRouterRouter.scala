package typingsSlinky.reduxDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouterProps
import typingsSlinky.reduxDashRouter.libReduxRouterMod.default.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxRouterRouter
  extends ExternalComponentWithAttributesWithRefType[tag.type, Router] {
  @JSImport("redux-router/lib/ReduxRouter", "default.Router")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(history: History[LocationState], _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, Router] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RouterProps
}

