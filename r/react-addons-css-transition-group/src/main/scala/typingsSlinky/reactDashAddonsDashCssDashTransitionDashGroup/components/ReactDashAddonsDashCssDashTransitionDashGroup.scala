package typingsSlinky.reactDashAddonsDashCssDashTransitionDashGroup.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAddonsDashCssDashTransitionDashGroup.reactDashAddonsDashCssDashTransitionDashGroupMod.reactMod.CSSTransitionGroupProps
import typingsSlinky.reactDashAddonsDashCssDashTransitionDashGroup.reactDashAddonsDashCssDashTransitionDashGroupMod.reactMod.CSSTransitionGroupTransitionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashAddonsDashCssDashTransitionDashGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-addons-css-transition-group", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    transitionName: String | CSSTransitionGroupTransitionName,
    transitionAppear: js.UndefOr[Boolean] = js.undefined,
    transitionAppearTimeout: Int | Double = null,
    transitionEnter: js.UndefOr[Boolean] = js.undefined,
    transitionEnterTimeout: Int | Double = null,
    transitionLeave: js.UndefOr[Boolean] = js.undefined,
    transitionLeaveTimeout: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(transitionName = transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear.asInstanceOf[js.Any])
    if (transitionAppearTimeout != null) __obj.updateDynamic("transitionAppearTimeout")(transitionAppearTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionEnter)) __obj.updateDynamic("transitionEnter")(transitionEnter.asInstanceOf[js.Any])
    if (transitionEnterTimeout != null) __obj.updateDynamic("transitionEnterTimeout")(transitionEnterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionLeave)) __obj.updateDynamic("transitionLeave")(transitionLeave.asInstanceOf[js.Any])
    if (transitionLeaveTimeout != null) __obj.updateDynamic("transitionLeaveTimeout")(transitionLeaveTimeout.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CSSTransitionGroupProps
}

