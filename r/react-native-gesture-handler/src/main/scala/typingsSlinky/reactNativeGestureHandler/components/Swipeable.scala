package typingsSlinky.reactNativeGestureHandler.components

import slinky.core.TagMod
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.anon.Bottom
import typingsSlinky.reactNativeGestureHandler.anon.BottomHeight
import typingsSlinky.reactNativeGestureHandler.anon.Height
import typingsSlinky.reactNativeGestureHandler.anon.Left
import typingsSlinky.reactNativeGestureHandler.anon.Right
import typingsSlinky.reactNativeGestureHandler.swipeableMod.SwipeableProperties
import typingsSlinky.reactNativeGestureHandler.swipeableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable {
  @JSImport("react-native-gesture-handler/Swipeable", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def activeOffsetX(value: Double | js.Array[Double]): this.type = set("activeOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def activeOffsetY(value: Double | js.Array[Double]): this.type = set("activeOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def avgTouches(value: Boolean): this.type = set("avgTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenContainerStyle(value: StyleProp[ViewStyle]): this.type = set("childrenContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def childrenContainerStyleNull: this.type = set("childrenContainerStyle", null)
    @scala.inline
    def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def containerStyleNull: this.type = set("containerStyle", null)
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def failOffsetX(value: Double | js.Array[Double]): this.type = set("failOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def failOffsetY(value: Double | js.Array[Double]): this.type = set("failOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def friction(value: Double): this.type = set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def hitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def leftThreshold(value: Double): this.type = set("leftThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDeltaX(value: Double): this.type = set("maxDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def maxDeltaY(value: Double): this.type = set("maxDeltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def maxPointers(value: Double): this.type = set("maxPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def minDeltaX(value: Double): this.type = set("minDeltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def minDeltaY(value: Double): this.type = set("minDeltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def minDist(value: Double): this.type = set("minDist", value.asInstanceOf[js.Any])
    @scala.inline
    def minOffsetX(value: Double): this.type = set("minOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def minOffsetY(value: Double): this.type = set("minOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def minPointers(value: Double): this.type = set("minPointers", value.asInstanceOf[js.Any])
    @scala.inline
    def minVelocity(value: Double): this.type = set("minVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def minVelocityX(value: Double): this.type = set("minVelocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def minVelocityY(value: Double): this.type = set("minVelocityY", value.asInstanceOf[js.Any])
    @scala.inline
    def onSwipeableClose(value: () => Unit): this.type = set("onSwipeableClose", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeableLeftOpen(value: () => Unit): this.type = set("onSwipeableLeftOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeableLeftWillOpen(value: () => Unit): this.type = set("onSwipeableLeftWillOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeableOpen(value: () => Unit): this.type = set("onSwipeableOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeableRightOpen(value: () => Unit): this.type = set("onSwipeableRightOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeableRightWillOpen(value: () => Unit): this.type = set("onSwipeableRightWillOpen", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeableWillClose(value: () => Unit): this.type = set("onSwipeableWillClose", js.Any.fromFunction0(value))
    @scala.inline
    def onSwipeableWillOpen(value: () => Unit): this.type = set("onSwipeableWillOpen", js.Any.fromFunction0(value))
    @scala.inline
    def overshootFriction(value: Double): this.type = set("overshootFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def overshootLeft(value: Boolean): this.type = set("overshootLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def overshootRight(value: Boolean): this.type = set("overshootRight", value.asInstanceOf[js.Any])
    @scala.inline
    def renderLeftActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => TagMod[Any]
    ): this.type = set("renderLeftActions", js.Any.fromFunction2(value))
    @scala.inline
    def renderRightActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => TagMod[Any]
    ): this.type = set("renderRightActions", js.Any.fromFunction2(value))
    @scala.inline
    def rightThreshold(value: Double): this.type = set("rightThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersRefObject(value: ReactRef[_]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): this.type = set("simultaneousHandlers", js.Any.fromFunction1(value))
    @scala.inline
    def simultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    @scala.inline
    def useNativeAnimations(value: Boolean): this.type = set("useNativeAnimations", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForRefObject(value: ReactRef[_]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForFunction1(value: /* instance */ _ | Null => Unit): this.type = set("waitFor", js.Any.fromFunction1(value))
    @scala.inline
    def waitFor(value: Ref[_] | js.Array[Ref[_]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def waitForNull: this.type = set("waitFor", null)
  }
  
  def withProps(p: SwipeableProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Swipeable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

