package typingsSlinky.reachRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.reachRouter.mod.RedirectProps
import typingsSlinky.reachRouter.mod.RouteComponentProps
import typingsSlinky.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Redirect
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reachRouter.mod.Redirect[js.Any]] {
  @JSImport("@reach/router", "Redirect")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[TState](
    to: String,
    from: String = null,
    location: WindowLocation = null,
    navigate: NavigateFn = null,
    noThrow: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null,
    uri: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reachRouter.mod.Redirect[js.Any]] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(navigate.asInstanceOf[js.Any])
    if (!js.isUndefined(noThrow)) __obj.updateDynamic("noThrow")(noThrow.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reachRouter.mod.Redirect[js.Any]]]
  }
  type Props = RouteComponentProps[RedirectProps[js.Any]]
}

