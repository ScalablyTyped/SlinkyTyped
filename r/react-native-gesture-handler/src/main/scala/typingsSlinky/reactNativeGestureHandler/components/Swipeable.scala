package typingsSlinky.reactNativeGestureHandler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.AnonBottom
import typingsSlinky.reactNativeGestureHandler.AnonBottomHeight
import typingsSlinky.reactNativeGestureHandler.AnonHeight
import typingsSlinky.reactNativeGestureHandler.AnonLeft
import typingsSlinky.reactNativeGestureHandler.AnonRight
import typingsSlinky.reactNativeGestureHandler.swipeableMod.SwipeableProperties
import typingsSlinky.reactNativeGestureHandler.swipeableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-gesture-handler/Swipeable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    activeOffsetX: Double | js.Array[Double] = null,
    activeOffsetY: Double | js.Array[Double] = null,
    avgTouches: js.UndefOr[Boolean] = js.undefined,
    childrenContainerStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    failOffsetX: Double | js.Array[Double] = null,
    failOffsetY: Double | js.Array[Double] = null,
    friction: Int | Double = null,
    hitSlop: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight = null,
    leftThreshold: Int | Double = null,
    maxDeltaX: Int | Double = null,
    maxDeltaY: Int | Double = null,
    maxPointers: Int | Double = null,
    minDeltaX: Int | Double = null,
    minDeltaY: Int | Double = null,
    minDist: Int | Double = null,
    minOffsetX: Int | Double = null,
    minOffsetY: Int | Double = null,
    minPointers: Int | Double = null,
    minVelocity: Int | Double = null,
    minVelocityX: Int | Double = null,
    minVelocityY: Int | Double = null,
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
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: Ref[_] | js.Array[Ref[_]] = null,
    useNativeAnimations: js.UndefOr[Boolean] = js.undefined,
    waitFor: Ref[_] | js.Array[Ref[_]] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (activeOffsetX != null) __obj.updateDynamic("activeOffsetX")(activeOffsetX.asInstanceOf[js.Any])
    if (activeOffsetY != null) __obj.updateDynamic("activeOffsetY")(activeOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(avgTouches)) __obj.updateDynamic("avgTouches")(avgTouches.asInstanceOf[js.Any])
    if (childrenContainerStyle != null) __obj.updateDynamic("childrenContainerStyle")(childrenContainerStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (failOffsetX != null) __obj.updateDynamic("failOffsetX")(failOffsetX.asInstanceOf[js.Any])
    if (failOffsetY != null) __obj.updateDynamic("failOffsetY")(failOffsetY.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (leftThreshold != null) __obj.updateDynamic("leftThreshold")(leftThreshold.asInstanceOf[js.Any])
    if (maxDeltaX != null) __obj.updateDynamic("maxDeltaX")(maxDeltaX.asInstanceOf[js.Any])
    if (maxDeltaY != null) __obj.updateDynamic("maxDeltaY")(maxDeltaY.asInstanceOf[js.Any])
    if (maxPointers != null) __obj.updateDynamic("maxPointers")(maxPointers.asInstanceOf[js.Any])
    if (minDeltaX != null) __obj.updateDynamic("minDeltaX")(minDeltaX.asInstanceOf[js.Any])
    if (minDeltaY != null) __obj.updateDynamic("minDeltaY")(minDeltaY.asInstanceOf[js.Any])
    if (minDist != null) __obj.updateDynamic("minDist")(minDist.asInstanceOf[js.Any])
    if (minOffsetX != null) __obj.updateDynamic("minOffsetX")(minOffsetX.asInstanceOf[js.Any])
    if (minOffsetY != null) __obj.updateDynamic("minOffsetY")(minOffsetY.asInstanceOf[js.Any])
    if (minPointers != null) __obj.updateDynamic("minPointers")(minPointers.asInstanceOf[js.Any])
    if (minVelocity != null) __obj.updateDynamic("minVelocity")(minVelocity.asInstanceOf[js.Any])
    if (minVelocityX != null) __obj.updateDynamic("minVelocityX")(minVelocityX.asInstanceOf[js.Any])
    if (minVelocityY != null) __obj.updateDynamic("minVelocityY")(minVelocityY.asInstanceOf[js.Any])
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
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.asInstanceOf[js.Any])
    if (simultaneousHandlers != null) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeGestureHandler.swipeableMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SwipeableProperties
}

