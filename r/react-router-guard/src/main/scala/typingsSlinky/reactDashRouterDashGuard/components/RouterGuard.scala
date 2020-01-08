package typingsSlinky.reactDashRouterDashGuard.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.History
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouterDashGuard.reactDashRouterDashGuardMod.RouterGuardConfigProps
import typingsSlinky.reactDashRouterDashGuard.reactDashRouterDashGuardMod.RouterGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RouterGuard
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashRouterDashGuard.reactDashRouterDashGuardMod.RouterGuard[js.Any]
    ] {
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    config: js.Array[RouterGuardConfigProps],
    history: History[LocationState] = null,
    loading: Boolean | ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashRouterDashGuard.reactDashRouterDashGuardMod.RouterGuard[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashRouterDashGuard.reactDashRouterDashGuardMod.RouterGuard[js.Any]]]
  }
  type Props = RouterGuardProps
}

