package typingsSlinky.reactDashFlipDashMove.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFlipDashMove.reactDashFlipDashMoveMod.FlipMove.AnimationProp
import typingsSlinky.reactDashFlipDashMove.reactDashFlipDashMoveMod.FlipMove.FlipMoveProps
import typingsSlinky.reactDashFlipDashMove.reactDashFlipDashMoveMod.FlipMove.Styles
import typingsSlinky.reactDashFlipDashMove.reactDashFlipDashMoveMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashFlipDashMove
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-flip-move", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    appearAnimation: AnimationProp = null,
    delay: Double | String = null,
    disableAllAnimations: js.UndefOr[Boolean] = js.undefined,
    duration: Double | String = null,
    easing: String = null,
    enterAnimation: AnimationProp = null,
    getPosition: /* node */ HTMLElement => ClientRect = null,
    leaveAnimation: AnimationProp = null,
    maintainContainerHeight: js.UndefOr[Boolean] = js.undefined,
    onFinish: (/* childElement */ ReactElement, /* domNode */ HTMLElement) => Unit = null,
    onFinishAll: (/* childElements */ js.Array[ReactElement], /* domNodes */ js.Array[HTMLElement]) => Unit = null,
    onStart: (/* childElement */ ReactElement, /* domNode */ HTMLElement) => Unit = null,
    onStartAll: (/* childElements */ js.Array[ReactElement], /* domNodes */ js.Array[HTMLElement]) => Unit = null,
    staggerDelayBy: Double | String = null,
    staggerDurationBy: Double | String = null,
    style: Styles = null,
    typeName: String = null,
    verticalAlignment: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (appearAnimation != null) __obj.updateDynamic("appearAnimation")(appearAnimation.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAllAnimations)) __obj.updateDynamic("disableAllAnimations")(disableAllAnimations.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation.asInstanceOf[js.Any])
    if (getPosition != null) __obj.updateDynamic("getPosition")(js.Any.fromFunction1(getPosition))
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainContainerHeight)) __obj.updateDynamic("maintainContainerHeight")(maintainContainerHeight.asInstanceOf[js.Any])
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction2(onFinish))
    if (onFinishAll != null) __obj.updateDynamic("onFinishAll")(js.Any.fromFunction2(onFinishAll))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction2(onStart))
    if (onStartAll != null) __obj.updateDynamic("onStartAll")(js.Any.fromFunction2(onStartAll))
    if (staggerDelayBy != null) __obj.updateDynamic("staggerDelayBy")(staggerDelayBy.asInstanceOf[js.Any])
    if (staggerDurationBy != null) __obj.updateDynamic("staggerDurationBy")(staggerDurationBy.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FlipMoveProps
}

