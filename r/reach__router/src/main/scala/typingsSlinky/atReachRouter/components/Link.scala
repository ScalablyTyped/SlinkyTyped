package typingsSlinky.atReachRouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atReachRouter.atReachRouterMod.LinkGetProps
import typingsSlinky.atReachRouter.atReachRouterMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Link[js.Any]] {
  @JSImport("@reach/router", "Link")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[TState](
    to: String,
    getProps: /* props */ LinkGetProps => js.Object = null,
    replace: js.UndefOr[Boolean] = js.undefined,
    state: TState = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atReachRouter.atReachRouterMod.Link[js.Any]] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (getProps != null) __obj.updateDynamic("getProps")(js.Any.fromFunction1(getProps))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atReachRouter.atReachRouterMod.Link[js.Any]]]
  }
  type Props = LinkProps[js.Any]
}

