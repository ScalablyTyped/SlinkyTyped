package typingsSlinky.reactRouterNavigationCore.mod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactRouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ RouterProps, TagMod[Any]]) | TagMod[Any]] = js.undefined
  var component: js.UndefOr[ReactComponentClass[RouterProps]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ RouterProps, TagMod[Any]]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouteProps {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ RouterProps, TagMod[Any]]) | TagMod[Any] = null,
    component: ReactComponentClass[RouterProps] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    render: /* props */ RouterProps => TagMod[Any] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouteProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps]
  }
}

