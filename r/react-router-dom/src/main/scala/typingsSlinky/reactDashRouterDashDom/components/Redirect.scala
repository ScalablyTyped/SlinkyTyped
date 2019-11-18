package typingsSlinky.reactDashRouterDashDom.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.LocationDescriptor
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.RedirectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Redirect
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.Redirect] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.Redirect].asInstanceOf[String | js.Object]
  def apply(
    to: LocationDescriptor[LocationState],
    exact: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    path: String = null,
    push: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashRouterDashDom.reactDashRouterDashDomMod.Redirect] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RedirectProps
}

