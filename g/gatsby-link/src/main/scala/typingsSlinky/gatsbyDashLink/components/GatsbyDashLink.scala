package typingsSlinky.gatsbyDashLink.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.a.tag
import typingsSlinky.atReachRouter.atReachRouterMod.LinkGetProps
import typingsSlinky.gatsbyDashLink.gatsbyDashLinkMod.GatsbyLinkProps
import typingsSlinky.gatsbyDashLink.gatsbyDashLinkMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatsbyDashLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("gatsby-link", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onClick */
  def apply[TState](
    to: String,
    activeClassName: String = null,
    activeStyle: js.Object = null,
    getProps: /* props */ LinkGetProps => js.Object = null,
    innerRef: js.Function = null,
    partiallyActive: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1(getProps))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(partiallyActive)) __obj.updateDynamic("partiallyActive")(partiallyActive.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.a.tag.type, 
  typingsSlinky.gatsbyDashLink.gatsbyDashLinkMod.default[js.Any]]]
  }
  type Props = GatsbyLinkProps[js.Any]
}

