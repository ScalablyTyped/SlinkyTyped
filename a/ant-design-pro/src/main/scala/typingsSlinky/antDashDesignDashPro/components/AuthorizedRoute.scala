package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.IAuthorizedRouteProps
import typingsSlinky.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.authority
import typingsSlinky.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.default
import typingsSlinky.history.historyMod.Location
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typingsSlinky.reactDashRouter.reactDashRouterMod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AuthorizedRoute
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/Authorized/AuthorizedRoute", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    authority: authority,
    component: ReactComponentClass[_ | (RouteComponentProps[_, StaticContext, LocationState])] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteComponentProps[_, StaticContext, LocationState] => TagMod[Any] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IAuthorizedRouteProps
}

