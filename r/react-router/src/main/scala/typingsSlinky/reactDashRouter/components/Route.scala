package typingsSlinky.reactDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Route
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Route[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashRouter.reactDashRouterMod.Route[js.Any]].asInstanceOf[String | js.Object]
  def apply(
    component: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteComponentProps[_, StaticContext, LocationState] => TagMod[Any] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashRouter.reactDashRouterMod.Route[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RouteProps
}

