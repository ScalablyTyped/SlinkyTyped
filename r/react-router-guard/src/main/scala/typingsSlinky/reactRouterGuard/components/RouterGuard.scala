package typingsSlinky.reactRouterGuard.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reactRouterGuard.mod.RouterGuardConfigProps
import typingsSlinky.reactRouterGuard.mod.RouterGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RouterGuard
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRouterGuard.mod.RouterGuard[js.Any]] {
  @JSImport("react-router-guard", "RouterGuard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    config: js.Array[RouterGuardConfigProps],
    history: History[LocationState] = null,
    loading: Boolean | ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactRouterGuard.mod.RouterGuard[js.Any]] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactRouterGuard.mod.RouterGuard[js.Any]]]
  }
  type Props = RouterGuardProps
}

