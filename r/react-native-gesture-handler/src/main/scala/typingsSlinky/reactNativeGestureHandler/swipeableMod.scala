package typingsSlinky.reactNativeGestureHandler

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeGestureHandler.anon.Bottom
import typingsSlinky.reactNativeGestureHandler.anon.BottomHeight
import typingsSlinky.reactNativeGestureHandler.anon.Height
import typingsSlinky.reactNativeGestureHandler.anon.Left
import typingsSlinky.reactNativeGestureHandler.anon.Right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeableMod {
  
  @JSImport("react-native-gesture-handler/Swipeable", JSImport.Default)
  @js.native
  class default () extends Swipeable
  
  @js.native
  trait Swipeable
    extends Component[SwipeableProperties, js.Object, js.Any] {
    
    def close(): Unit = js.native
    
    def openLeft(): Unit = js.native
    
    def openRight(): Unit = js.native
  }
  
  /* Inlined std.Exclude<keyof react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, 'onGestureEvent' | 'onHandlerStateChange'> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetY
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityX
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaX
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocity
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDist
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minPointers
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaY
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.avgTouches
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaX
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetY
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetX
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetX
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxPointers
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityY
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetY
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetX
    - typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaY
  */
  trait SwipeableExcludes extends StObject
  object SwipeableExcludes {
    
    @scala.inline
    def activeOffsetX: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetX = "activeOffsetX".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetX]
    
    @scala.inline
    def activeOffsetY: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetY = "activeOffsetY".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.activeOffsetY]
    
    @scala.inline
    def avgTouches: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.avgTouches = "avgTouches".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.avgTouches]
    
    @scala.inline
    def enabled: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled = "enabled".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.enabled]
    
    @scala.inline
    def failOffsetX: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetX = "failOffsetX".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetX]
    
    @scala.inline
    def failOffsetY: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetY = "failOffsetY".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.failOffsetY]
    
    @scala.inline
    def hitSlop: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop = "hitSlop".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.hitSlop]
    
    @scala.inline
    def id: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id = "id".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.id]
    
    @scala.inline
    def maxDeltaX: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaX = "maxDeltaX".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaX]
    
    @scala.inline
    def maxDeltaY: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaY = "maxDeltaY".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxDeltaY]
    
    @scala.inline
    def maxPointers: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxPointers = "maxPointers".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.maxPointers]
    
    @scala.inline
    def minDeltaX: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaX = "minDeltaX".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaX]
    
    @scala.inline
    def minDeltaY: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaY = "minDeltaY".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDeltaY]
    
    @scala.inline
    def minDist: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDist = "minDist".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minDist]
    
    @scala.inline
    def minOffsetX: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetX = "minOffsetX".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetX]
    
    @scala.inline
    def minOffsetY: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetY = "minOffsetY".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minOffsetY]
    
    @scala.inline
    def minPointers: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minPointers = "minPointers".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minPointers]
    
    @scala.inline
    def minVelocity: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocity = "minVelocity".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocity]
    
    @scala.inline
    def minVelocityX: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityX = "minVelocityX".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityX]
    
    @scala.inline
    def minVelocityY: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityY = "minVelocityY".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.minVelocityY]
    
    @scala.inline
    def shouldCancelWhenOutside: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside = "shouldCancelWhenOutside".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.shouldCancelWhenOutside]
    
    @scala.inline
    def simultaneousHandlers: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers = "simultaneousHandlers".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.simultaneousHandlers]
    
    @scala.inline
    def waitFor: typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor = "waitFor".asInstanceOf[typingsSlinky.reactNativeGestureHandler.reactNativeGestureHandlerStrings.waitFor]
  }
  
  /* Inlined parent std.Pick<react-native-gesture-handler.react-native-gesture-handler.PanGestureHandlerProperties, react-native-gesture-handler.react-native-gesture-handler/Swipeable.SwipeableExcludes> */
  @js.native
  trait SwipeableProperties extends StObject {
    
    var activeOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var activeOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var avgTouches: js.UndefOr[Boolean] = js.native
    
    var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var failOffsetX: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var failOffsetY: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var friction: js.UndefOr[Double] = js.native
    
    var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.native
    
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
          ReactElement
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
          ReactElement
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
    implicit class SwipeablePropertiesMutableBuilder[Self <: SwipeableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOffsetXUndefined: Self = StObject.set(x, "activeOffsetX", js.undefined)
      
      @scala.inline
      def setActiveOffsetXVarargs(value: Double*): Self = StObject.set(x, "activeOffsetX", js.Array(value :_*))
      
      @scala.inline
      def setActiveOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "activeOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOffsetYUndefined: Self = StObject.set(x, "activeOffsetY", js.undefined)
      
      @scala.inline
      def setActiveOffsetYVarargs(value: Double*): Self = StObject.set(x, "activeOffsetY", js.Array(value :_*))
      
      @scala.inline
      def setAvgTouches(value: Boolean): Self = StObject.set(x, "avgTouches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvgTouchesUndefined: Self = StObject.set(x, "avgTouches", js.undefined)
      
      @scala.inline
      def setChildrenContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "childrenContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenContainerStyleNull: Self = StObject.set(x, "childrenContainerStyle", null)
      
      @scala.inline
      def setChildrenContainerStyleUndefined: Self = StObject.set(x, "childrenContainerStyle", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFailOffsetX(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOffsetXUndefined: Self = StObject.set(x, "failOffsetX", js.undefined)
      
      @scala.inline
      def setFailOffsetXVarargs(value: Double*): Self = StObject.set(x, "failOffsetX", js.Array(value :_*))
      
      @scala.inline
      def setFailOffsetY(value: Double | js.Array[Double]): Self = StObject.set(x, "failOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOffsetYUndefined: Self = StObject.set(x, "failOffsetY", js.undefined)
      
      @scala.inline
      def setFailOffsetYVarargs(value: Double*): Self = StObject.set(x, "failOffsetY", js.Array(value :_*))
      
      @scala.inline
      def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      @scala.inline
      def setHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLeftThreshold(value: Double): Self = StObject.set(x, "leftThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftThresholdUndefined: Self = StObject.set(x, "leftThreshold", js.undefined)
      
      @scala.inline
      def setMaxDeltaX(value: Double): Self = StObject.set(x, "maxDeltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDeltaXUndefined: Self = StObject.set(x, "maxDeltaX", js.undefined)
      
      @scala.inline
      def setMaxDeltaY(value: Double): Self = StObject.set(x, "maxDeltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDeltaYUndefined: Self = StObject.set(x, "maxDeltaY", js.undefined)
      
      @scala.inline
      def setMaxPointers(value: Double): Self = StObject.set(x, "maxPointers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPointersUndefined: Self = StObject.set(x, "maxPointers", js.undefined)
      
      @scala.inline
      def setMinDeltaX(value: Double): Self = StObject.set(x, "minDeltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDeltaXUndefined: Self = StObject.set(x, "minDeltaX", js.undefined)
      
      @scala.inline
      def setMinDeltaY(value: Double): Self = StObject.set(x, "minDeltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDeltaYUndefined: Self = StObject.set(x, "minDeltaY", js.undefined)
      
      @scala.inline
      def setMinDist(value: Double): Self = StObject.set(x, "minDist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDistUndefined: Self = StObject.set(x, "minDist", js.undefined)
      
      @scala.inline
      def setMinOffsetX(value: Double): Self = StObject.set(x, "minOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOffsetXUndefined: Self = StObject.set(x, "minOffsetX", js.undefined)
      
      @scala.inline
      def setMinOffsetY(value: Double): Self = StObject.set(x, "minOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinOffsetYUndefined: Self = StObject.set(x, "minOffsetY", js.undefined)
      
      @scala.inline
      def setMinPointers(value: Double): Self = StObject.set(x, "minPointers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPointersUndefined: Self = StObject.set(x, "minPointers", js.undefined)
      
      @scala.inline
      def setMinVelocity(value: Double): Self = StObject.set(x, "minVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVelocityUndefined: Self = StObject.set(x, "minVelocity", js.undefined)
      
      @scala.inline
      def setMinVelocityX(value: Double): Self = StObject.set(x, "minVelocityX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVelocityXUndefined: Self = StObject.set(x, "minVelocityX", js.undefined)
      
      @scala.inline
      def setMinVelocityY(value: Double): Self = StObject.set(x, "minVelocityY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVelocityYUndefined: Self = StObject.set(x, "minVelocityY", js.undefined)
      
      @scala.inline
      def setOnSwipeableClose(value: () => Unit): Self = StObject.set(x, "onSwipeableClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableCloseUndefined: Self = StObject.set(x, "onSwipeableClose", js.undefined)
      
      @scala.inline
      def setOnSwipeableLeftOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableLeftOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableLeftOpenUndefined: Self = StObject.set(x, "onSwipeableLeftOpen", js.undefined)
      
      @scala.inline
      def setOnSwipeableLeftWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableLeftWillOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableLeftWillOpenUndefined: Self = StObject.set(x, "onSwipeableLeftWillOpen", js.undefined)
      
      @scala.inline
      def setOnSwipeableOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableOpenUndefined: Self = StObject.set(x, "onSwipeableOpen", js.undefined)
      
      @scala.inline
      def setOnSwipeableRightOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableRightOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableRightOpenUndefined: Self = StObject.set(x, "onSwipeableRightOpen", js.undefined)
      
      @scala.inline
      def setOnSwipeableRightWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableRightWillOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableRightWillOpenUndefined: Self = StObject.set(x, "onSwipeableRightWillOpen", js.undefined)
      
      @scala.inline
      def setOnSwipeableWillClose(value: () => Unit): Self = StObject.set(x, "onSwipeableWillClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableWillCloseUndefined: Self = StObject.set(x, "onSwipeableWillClose", js.undefined)
      
      @scala.inline
      def setOnSwipeableWillOpen(value: () => Unit): Self = StObject.set(x, "onSwipeableWillOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSwipeableWillOpenUndefined: Self = StObject.set(x, "onSwipeableWillOpen", js.undefined)
      
      @scala.inline
      def setOvershootFriction(value: Double): Self = StObject.set(x, "overshootFriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOvershootFrictionUndefined: Self = StObject.set(x, "overshootFriction", js.undefined)
      
      @scala.inline
      def setOvershootLeft(value: Boolean): Self = StObject.set(x, "overshootLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOvershootLeftUndefined: Self = StObject.set(x, "overshootLeft", js.undefined)
      
      @scala.inline
      def setOvershootRight(value: Boolean): Self = StObject.set(x, "overshootRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOvershootRightUndefined: Self = StObject.set(x, "overshootRight", js.undefined)
      
      @scala.inline
      def setRenderLeftActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactElement
      ): Self = StObject.set(x, "renderLeftActions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderLeftActionsUndefined: Self = StObject.set(x, "renderLeftActions", js.undefined)
      
      @scala.inline
      def setRenderRightActions(
        value: (/* progressAnimatedValue */ AnimatedInterpolation, /* dragAnimatedValue */ AnimatedInterpolation) => ReactElement
      ): Self = StObject.set(x, "renderRightActions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderRightActionsUndefined: Self = StObject.set(x, "renderRightActions", js.undefined)
      
      @scala.inline
      def setRightThreshold(value: Double): Self = StObject.set(x, "rightThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightThresholdUndefined: Self = StObject.set(x, "rightThreshold", js.undefined)
      
      @scala.inline
      def setShouldCancelWhenOutside(value: Boolean): Self = StObject.set(x, "shouldCancelWhenOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCancelWhenOutsideUndefined: Self = StObject.set(x, "shouldCancelWhenOutside", js.undefined)
      
      @scala.inline
      def setSimultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
      
      @scala.inline
      def setSimultaneousHandlersRefObject(value: ReactRef[_]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
      
      @scala.inline
      def setSimultaneousHandlersVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value :_*))
      
      @scala.inline
      def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeAnimationsUndefined: Self = StObject.set(x, "useNativeAnimations", js.undefined)
      
      @scala.inline
      def setWaitFor(value: Ref[_] | js.Array[Ref[_]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWaitForNull: Self = StObject.set(x, "waitFor", null)
      
      @scala.inline
      def setWaitForRefObject(value: ReactRef[_]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
      
      @scala.inline
      def setWaitForVarargs(value: Ref[js.Any]*): Self = StObject.set(x, "waitFor", js.Array(value :_*))
    }
  }
}
