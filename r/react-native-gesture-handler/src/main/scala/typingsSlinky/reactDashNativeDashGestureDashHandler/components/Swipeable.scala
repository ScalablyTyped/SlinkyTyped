package typingsSlinky.reactDashNativeDashGestureDashHandler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.Animated.AnimatedInterpolation
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashGestureDashHandler.swipeableMod.SwipeableProperties
import typingsSlinky.reactDashNativeDashGestureDashHandler.swipeableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-gesture-handler/Swipeable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    childrenContainerStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    friction: Int | Double = null,
    leftThreshold: Int | Double = null,
    onSwipeableClose: () => Unit = null,
    onSwipeableLeftOpen: () => Unit = null,
    onSwipeableLeftWillOpen: () => Unit = null,
    onSwipeableOpen: () => Unit = null,
    onSwipeableRightOpen: () => Unit = null,
    onSwipeableRightWillOpen: () => Unit = null,
    onSwipeableWillClose: () => Unit = null,
    onSwipeableWillOpen: () => Unit = null,
    overshootFriction: Int | Double = null,
    overshootLeft: js.UndefOr[Boolean] = js.undefined,
    overshootRight: js.UndefOr[Boolean] = js.undefined,
    renderLeftActions: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => TagMod[Any] = null,
    renderRightActions: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => TagMod[Any] = null,
    rightThreshold: Int | Double = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (childrenContainerStyle != null) __obj.updateDynamic("childrenContainerStyle")(childrenContainerStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (leftThreshold != null) __obj.updateDynamic("leftThreshold")(leftThreshold.asInstanceOf[js.Any])
    if (onSwipeableClose != null) __obj.updateDynamic("onSwipeableClose")(js.Any.fromFunction0(onSwipeableClose))
    if (onSwipeableLeftOpen != null) __obj.updateDynamic("onSwipeableLeftOpen")(js.Any.fromFunction0(onSwipeableLeftOpen))
    if (onSwipeableLeftWillOpen != null) __obj.updateDynamic("onSwipeableLeftWillOpen")(js.Any.fromFunction0(onSwipeableLeftWillOpen))
    if (onSwipeableOpen != null) __obj.updateDynamic("onSwipeableOpen")(js.Any.fromFunction0(onSwipeableOpen))
    if (onSwipeableRightOpen != null) __obj.updateDynamic("onSwipeableRightOpen")(js.Any.fromFunction0(onSwipeableRightOpen))
    if (onSwipeableRightWillOpen != null) __obj.updateDynamic("onSwipeableRightWillOpen")(js.Any.fromFunction0(onSwipeableRightWillOpen))
    if (onSwipeableWillClose != null) __obj.updateDynamic("onSwipeableWillClose")(js.Any.fromFunction0(onSwipeableWillClose))
    if (onSwipeableWillOpen != null) __obj.updateDynamic("onSwipeableWillOpen")(js.Any.fromFunction0(onSwipeableWillOpen))
    if (overshootFriction != null) __obj.updateDynamic("overshootFriction")(overshootFriction.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootLeft)) __obj.updateDynamic("overshootLeft")(overshootLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootRight)) __obj.updateDynamic("overshootRight")(overshootRight.asInstanceOf[js.Any])
    if (renderLeftActions != null) __obj.updateDynamic("renderLeftActions")(js.Any.fromFunction2(renderLeftActions))
    if (renderRightActions != null) __obj.updateDynamic("renderRightActions")(js.Any.fromFunction2(renderRightActions))
    if (rightThreshold != null) __obj.updateDynamic("rightThreshold")(rightThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashGestureDashHandler.swipeableMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwipeableProperties
}

