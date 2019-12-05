package typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, TagMod[Any]]] = js.undefined
  var wrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(
    className: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    setCrumbs: /* crumbs */ Crumbs => TagMod[Any] = null,
    wrapper: ReactComponentClass[js.Object] = null
  ): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (setCrumbs != null) __obj.updateDynamic("setCrumbs")(js.Any.fromFunction1(setCrumbs))
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

