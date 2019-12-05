package typingsSlinky.reduxDashLittleDashRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.web.html.`*`.tag
import typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.FragmentProps
import typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.Location
import typingsSlinky.reduxDashLittleDashRouter.reduxDashLittleDashRouterMod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_FragmentProps_1190256894[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    forNoMatch: js.UndefOr[Boolean] = js.undefined,
    forRoute: String = null,
    location: Location = null,
    matchRoute: js.Function = null,
    matchWildcardRoute: js.Function = null,
    parentId: String = null,
    parentRoute: String = null,
    style: ObjectLiteral[_] = null,
    withConditions: /* location */ Location => Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forNoMatch)) __obj.updateDynamic("forNoMatch")(forNoMatch.asInstanceOf[js.Any])
    if (forRoute != null) __obj.updateDynamic("forRoute")(forRoute.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (matchRoute != null) __obj.updateDynamic("matchRoute")(matchRoute.asInstanceOf[js.Any])
    if (matchWildcardRoute != null) __obj.updateDynamic("matchWildcardRoute")(matchWildcardRoute.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (parentRoute != null) __obj.updateDynamic("parentRoute")(parentRoute.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (withConditions != null) __obj.updateDynamic("withConditions")(js.Any.fromFunction1(withConditions))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FragmentProps
}

