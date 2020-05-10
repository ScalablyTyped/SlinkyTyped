package typingsSlinky.reactNativeGestureHandler.swipeableMod

import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.AnonBottom
import typingsSlinky.reactNativeGestureHandler.AnonBottomHeight
import typingsSlinky.reactNativeGestureHandler.AnonHeight
import typingsSlinky.reactNativeGestureHandler.AnonLeft
import typingsSlinky.reactNativeGestureHandler.AnonRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, react-native-gesture-handler.react-native-gesture-handler/Swipeable.SwipeableExcludes> */
@js.native
trait SwipeableProperties extends js.Object {
  var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  var avgTouches: js.UndefOr[Boolean] = js.native
  var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
  var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
  var friction: js.UndefOr[Double] = js.native
  var hitSlop: js.UndefOr[Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight] = js.native
  var id: js.UndefOr[String] = js.native
  var leftThreshold: js.UndefOr[Double] = js.native
  var maxDeltaX: js.UndefOr[Double] = js.native
  var maxDeltaY: js.UndefOr[Double] = js.native
  var maxPointers: js.UndefOr[Double] = js.native
  var minDeltaX: js.UndefOr[Double] = js.native
  var minDeltaY: js.UndefOr[Double] = js.native
  var minDist: js.UndefOr[Double] = js.native
  var minOffsetX: js.UndefOr[Double] = js.native
  var minOffsetY: js.UndefOr[Double] = js.native
  var minPointers: js.UndefOr[Double] = js.native
  var minVelocity: js.UndefOr[Double] = js.native
  var minVelocityX: js.UndefOr[Double] = js.native
  var minVelocityY: js.UndefOr[Double] = js.native
  var onSwipeableClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeableLeftOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeableLeftWillOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeableOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeableRightOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeableRightWillOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeableWillClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeableWillOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var overshootFriction: js.UndefOr[Double] = js.native
  var overshootLeft: js.UndefOr[Boolean] = js.native
  var overshootRight: js.UndefOr[Boolean] = js.native
  /**
    *
    * This map describes the values to use as inputRange for extra interpolation:
    * AnimatedValue: [startValue, endValue]
    *
    * progressAnimatedValue: [0, 1]
    * dragAnimatedValue: [0, +]
    *
    * To support `rtl` flexbox layouts use `flexDirection` styling.
    * */
  var renderLeftActions: js.UndefOr[
    js.Function2[
      /* progressAnimatedValue */ AnimatedInterpolation, 
      /* dragAnimatedValue */ AnimatedInterpolation, 
      TagMod[Any]
    ]
  ] = js.native
  /**
    *
    * This map describes the values to use as inputRange for extra interpolation:
    * AnimatedValue: [startValue, endValue]
    *
    * progressAnimatedValue: [0, 1]
    * dragAnimatedValue: [0, -]
    *
    * To support `rtl` flexbox layouts use `flexDirection` styling.
    * */
  var renderRightActions: js.UndefOr[
    js.Function2[
      /* progressAnimatedValue */ AnimatedInterpolation, 
      /* dragAnimatedValue */ AnimatedInterpolation, 
      TagMod[Any]
    ]
  ] = js.native
  var rightThreshold: js.UndefOr[Double] = js.native
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.native
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
  var useNativeAnimations: js.UndefOr[Boolean] = js.native
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
}

object SwipeableProperties {
  @scala.inline
  def apply(): SwipeableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeableProperties]
  }
  @scala.inline
  implicit class SwipeablePropertiesOps[Self <: SwipeableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOffsetX(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveOffsetY(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withAvgTouches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgTouches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvgTouches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avgTouches")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildrenContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childrenContainerStyle")(null)
        ret
    }
    @scala.inline
    def withContainerStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyle")(null)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOffsetX(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOffsetY(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withHitSlop(value: Double | AnonBottom | AnonLeft | AnonRight | AnonHeight | AnonBottomHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeltaX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaX")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPointers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeltaX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDist")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPointers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPointers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPointers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPointers")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVelocityX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityX")(js.undefined)
        ret
    }
    @scala.inline
    def withMinVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinVelocityY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVelocityY")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableLeftOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableLeftOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableLeftOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableLeftOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableLeftWillOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableLeftWillOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableLeftWillOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableLeftWillOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableRightOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableRightOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableRightOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableRightOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableRightWillOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableRightWillOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableRightWillOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableRightWillOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableWillClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableWillClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableWillClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableWillClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeableWillOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableWillOpen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeableWillOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeableWillOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOvershootFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootFriction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOvershootFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootFriction")(js.undefined)
        ret
    }
    @scala.inline
    def withOvershootLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOvershootLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withOvershootRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOvershootRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overshootRight")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderLeftActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLeftActions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderLeftActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderLeftActions")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderRightActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRightActions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderRightActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRightActions")(js.undefined)
        ret
    }
    @scala.inline
    def withRightThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCancelWhenOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCancelWhenOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCancelWhenOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCancelWhenOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withSimultaneousHandlersRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSimultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimultaneousHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withSimultaneousHandlersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(null)
        ret
    }
    @scala.inline
    def withUseNativeAnimations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeAnimations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNativeAnimations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeAnimations")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWaitFor(value: Ref[_] | js.Array[Ref[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(null)
        ret
    }
  }
  
}

