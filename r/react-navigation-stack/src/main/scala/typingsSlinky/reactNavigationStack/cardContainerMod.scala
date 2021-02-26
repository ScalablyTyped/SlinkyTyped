package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.anon.Close
import typingsSlinky.reactNavigationStack.anon.Height
import typingsSlinky.reactNavigationStack.anon.Horizontal
import typingsSlinky.reactNavigationStack.anon.StyleWithAnimatedValue
import typingsSlinky.reactNavigationStack.vendorTypesMod.GestureDirection
import typingsSlinky.reactNavigationStack.vendorTypesMod.Layout
import typingsSlinky.reactNavigationStack.vendorTypesMod.Route
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardMode
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardStyleInterpolator
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderStyleInterpolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContainerMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardContainer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[
    js.Function1[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      ReactElement
    ]
  ] = js.native
  
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.TransitionPreset & {  index :number,   active :boolean,   focused :boolean,   closing :boolean,   layout :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Layout,   gesture :react-native.react-native.Animated.Value,   scene :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>>,   safeAreaInsetTop :number,   safeAreaInsetRight :number,   safeAreaInsetBottom :number,   safeAreaInsetLeft :number,   cardOverlay :(props : {  style :react-native.react-native.Animated.WithAnimatedValue<react-native.react-native.StyleProp<react-native.react-native.ViewStyle>>}): react.react.ReactNode | undefined,   cardOverlayEnabled :boolean | undefined,   cardShadowEnabled :boolean | undefined,   cardStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined, getPreviousScene (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Scene<react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>> | undefined, getFocusedRoute (): react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>, renderHeader (props : react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer.Props): react.react.ReactNode, renderScene (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): react.react.ReactNode, onOpenRoute (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void, onCloseRoute (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void,   onTransitionStart :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void | undefined,   onTransitionEnd :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}, closing : boolean): void | undefined,   onPageChangeStart :(): void | undefined,   onPageChangeConfirm :(force : boolean): void | undefined,   onPageChangeCancel :(): void | undefined,   onGestureStart :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void | undefined,   onGestureEnd :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void | undefined,   onGestureCancel :(props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>}): void | undefined,   gestureEnabled :boolean | undefined,   gestureResponseDistance :{  vertical :number | undefined,   horizontal :number | undefined} | undefined,   gestureVelocityImpact :number | undefined,   mode :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackCardMode,   headerMode :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.StackHeaderMode,   headerShown :boolean,   hasAbsoluteHeader :boolean,   headerHeight :number, onHeaderHeightChange (props : {  route :react-navigation-stack.react-navigation-stack/lib/typescript/src/vendor/types.Route<string>,   height :number}): void,   isParentHeaderShown :boolean} */
  @js.native
  trait Props extends StObject {
    
    var active: Boolean = js.native
    
    var cardOverlay: js.UndefOr[js.Function1[/* props */ StyleWithAnimatedValue, ReactElement]] = js.native
    
    var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
    
    var cardShadowEnabled: js.UndefOr[Boolean] = js.native
    
    var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Function which specifies interpolated styles for various parts of the card, e.g. the overlay, shadow etc.
      */
    var cardStyleInterpolator: StackCardStyleInterpolator = js.native
    
    var closing: Boolean = js.native
    
    var focused: Boolean = js.native
    
    var gesture: Value = js.native
    
    /**
      * The direction of swipe gestures, `horizontal` or `vertical`.
      */
    var gestureDirection: GestureDirection = js.native
    
    var gestureEnabled: js.UndefOr[Boolean] = js.native
    
    var gestureResponseDistance: js.UndefOr[Horizontal] = js.native
    
    var gestureVelocityImpact: js.UndefOr[Double] = js.native
    
    def getFocusedRoute(): Route[String] = js.native
    
    def getPreviousScene(props: typingsSlinky.reactNavigationStack.anon.Route): js.UndefOr[Scene[Route[String]]] = js.native
    
    var hasAbsoluteHeader: Boolean = js.native
    
    var headerHeight: Double = js.native
    
    var headerMode: StackHeaderMode = js.native
    
    var headerShown: Boolean = js.native
    
    /**
      * Function which specifies interpolated styles for various parts of the header, e.g. the title, left button etc.
      */
    var headerStyleInterpolator: StackHeaderStyleInterpolator = js.native
    
    var index: Double = js.native
    
    var isParentHeaderShown: Boolean = js.native
    
    var layout: Layout = js.native
    
    var mode: StackCardMode = js.native
    
    def onCloseRoute(props: typingsSlinky.reactNavigationStack.anon.Route): Unit = js.native
    
    var onGestureCancel: js.UndefOr[js.Function1[/* props */ typingsSlinky.reactNavigationStack.anon.Route, Unit]] = js.native
    
    var onGestureEnd: js.UndefOr[js.Function1[/* props */ typingsSlinky.reactNavigationStack.anon.Route, Unit]] = js.native
    
    var onGestureStart: js.UndefOr[js.Function1[/* props */ typingsSlinky.reactNavigationStack.anon.Route, Unit]] = js.native
    
    def onHeaderHeightChange(props: Height): Unit = js.native
    
    def onOpenRoute(props: typingsSlinky.reactNavigationStack.anon.Route): Unit = js.native
    
    var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPageChangeConfirm: js.UndefOr[js.Function1[/* force */ Boolean, Unit]] = js.native
    
    var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onTransitionEnd: js.UndefOr[
        js.Function2[
          /* props */ typingsSlinky.reactNavigationStack.anon.Route, 
          /* closing */ Boolean, 
          Unit
        ]
      ] = js.native
    
    var onTransitionStart: js.UndefOr[
        js.Function2[
          /* props */ typingsSlinky.reactNavigationStack.anon.Route, 
          /* closing */ Boolean, 
          Unit
        ]
      ] = js.native
    
    def renderHeader(props: typingsSlinky.reactNavigationStack.headerContainerMod.Props): ReactElement = js.native
    
    def renderScene(props: typingsSlinky.reactNavigationStack.anon.Route): ReactElement = js.native
    
    var safeAreaInsetBottom: Double = js.native
    
    var safeAreaInsetLeft: Double = js.native
    
    var safeAreaInsetRight: Double = js.native
    
    var safeAreaInsetTop: Double = js.native
    
    var scene: Scene[Route[String]] = js.native
    
    /**
      * Object which specifies the animation type (timing or spring) and their options (such as duration for timing).
      */
    var transitionSpec: Close = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      active: Boolean,
      cardStyleInterpolator: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle,
      closing: Boolean,
      focused: Boolean,
      gesture: Value,
      gestureDirection: GestureDirection,
      getFocusedRoute: () => Route[String],
      getPreviousScene: typingsSlinky.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]],
      hasAbsoluteHeader: Boolean,
      headerHeight: Double,
      headerMode: StackHeaderMode,
      headerShown: Boolean,
      headerStyleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle,
      index: Double,
      isParentHeaderShown: Boolean,
      layout: Layout,
      mode: StackCardMode,
      onCloseRoute: typingsSlinky.reactNavigationStack.anon.Route => Unit,
      onHeaderHeightChange: Height => Unit,
      onOpenRoute: typingsSlinky.reactNavigationStack.anon.Route => Unit,
      renderHeader: typingsSlinky.reactNavigationStack.headerContainerMod.Props => ReactElement,
      renderScene: typingsSlinky.reactNavigationStack.anon.Route => ReactElement,
      safeAreaInsetBottom: Double,
      safeAreaInsetLeft: Double,
      safeAreaInsetRight: Double,
      safeAreaInsetTop: Double,
      scene: Scene[Route[String]],
      transitionSpec: Close
    ): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], cardStyleInterpolator = js.Any.fromFunction1(cardStyleInterpolator), closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], gesture = gesture.asInstanceOf[js.Any], gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousScene = js.Any.fromFunction1(getPreviousScene), hasAbsoluteHeader = hasAbsoluteHeader.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerMode = headerMode.asInstanceOf[js.Any], headerShown = headerShown.asInstanceOf[js.Any], headerStyleInterpolator = js.Any.fromFunction1(headerStyleInterpolator), index = index.asInstanceOf[js.Any], isParentHeaderShown = isParentHeaderShown.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onHeaderHeightChange = js.Any.fromFunction1(onHeaderHeightChange), onOpenRoute = js.Any.fromFunction1(onOpenRoute), renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), safeAreaInsetBottom = safeAreaInsetBottom.asInstanceOf[js.Any], safeAreaInsetLeft = safeAreaInsetLeft.asInstanceOf[js.Any], safeAreaInsetRight = safeAreaInsetRight.asInstanceOf[js.Any], safeAreaInsetTop = safeAreaInsetTop.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardOverlay(value: /* props */ StyleWithAnimatedValue => ReactElement): Self = StObject.set(x, "cardOverlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardOverlayEnabled(value: Boolean): Self = StObject.set(x, "cardOverlayEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardOverlayEnabledUndefined: Self = StObject.set(x, "cardOverlayEnabled", js.undefined)
      
      @scala.inline
      def setCardOverlayUndefined: Self = StObject.set(x, "cardOverlay", js.undefined)
      
      @scala.inline
      def setCardShadowEnabled(value: Boolean): Self = StObject.set(x, "cardShadowEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardShadowEnabledUndefined: Self = StObject.set(x, "cardShadowEnabled", js.undefined)
      
      @scala.inline
      def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardStyleInterpolator(value: /* props */ StackCardInterpolationProps => StackCardInterpolatedStyle): Self = StObject.set(x, "cardStyleInterpolator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
      
      @scala.inline
      def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
      
      @scala.inline
      def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGesture(value: Value): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureEnabled(value: Boolean): Self = StObject.set(x, "gestureEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureEnabledUndefined: Self = StObject.set(x, "gestureEnabled", js.undefined)
      
      @scala.inline
      def setGestureResponseDistance(value: Horizontal): Self = StObject.set(x, "gestureResponseDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureResponseDistanceUndefined: Self = StObject.set(x, "gestureResponseDistance", js.undefined)
      
      @scala.inline
      def setGestureVelocityImpact(value: Double): Self = StObject.set(x, "gestureVelocityImpact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureVelocityImpactUndefined: Self = StObject.set(x, "gestureVelocityImpact", js.undefined)
      
      @scala.inline
      def setGetFocusedRoute(value: () => Route[String]): Self = StObject.set(x, "getFocusedRoute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousScene(value: typingsSlinky.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = StObject.set(x, "getPreviousScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasAbsoluteHeader(value: Boolean): Self = StObject.set(x, "hasAbsoluteHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderShown(value: Boolean): Self = StObject.set(x, "headerShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "headerStyleInterpolator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsParentHeaderShown(value: Boolean): Self = StObject.set(x, "isParentHeaderShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseRoute(value: typingsSlinky.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onCloseRoute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureCancel(value: /* props */ typingsSlinky.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureCancelUndefined: Self = StObject.set(x, "onGestureCancel", js.undefined)
      
      @scala.inline
      def setOnGestureEnd(value: /* props */ typingsSlinky.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureEndUndefined: Self = StObject.set(x, "onGestureEnd", js.undefined)
      
      @scala.inline
      def setOnGestureStart(value: /* props */ typingsSlinky.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onGestureStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureStartUndefined: Self = StObject.set(x, "onGestureStart", js.undefined)
      
      @scala.inline
      def setOnHeaderHeightChange(value: Height => Unit): Self = StObject.set(x, "onHeaderHeightChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenRoute(value: typingsSlinky.reactNavigationStack.anon.Route => Unit): Self = StObject.set(x, "onOpenRoute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeCancel(value: () => Unit): Self = StObject.set(x, "onPageChangeCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPageChangeCancelUndefined: Self = StObject.set(x, "onPageChangeCancel", js.undefined)
      
      @scala.inline
      def setOnPageChangeConfirm(value: /* force */ Boolean => Unit): Self = StObject.set(x, "onPageChangeConfirm", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeConfirmUndefined: Self = StObject.set(x, "onPageChangeConfirm", js.undefined)
      
      @scala.inline
      def setOnPageChangeStart(value: () => Unit): Self = StObject.set(x, "onPageChangeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPageChangeStartUndefined: Self = StObject.set(x, "onPageChangeStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: (/* props */ typingsSlinky.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnTransitionStart(value: (/* props */ typingsSlinky.reactNavigationStack.anon.Route, /* closing */ Boolean) => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionStartUndefined: Self = StObject.set(x, "onTransitionStart", js.undefined)
      
      @scala.inline
      def setRenderHeader(value: typingsSlinky.reactNavigationStack.headerContainerMod.Props => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderScene(value: typingsSlinky.reactNavigationStack.anon.Route => ReactElement): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSafeAreaInsetBottom(value: Double): Self = StObject.set(x, "safeAreaInsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeAreaInsetLeft(value: Double): Self = StObject.set(x, "safeAreaInsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeAreaInsetRight(value: Double): Self = StObject.set(x, "safeAreaInsetRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeAreaInsetTop(value: Double): Self = StObject.set(x, "safeAreaInsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScene(value: Scene[Route[String]]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSpec(value: Close): Self = StObject.set(x, "transitionSpec", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[
    js.Function1[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      ReactElement
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `cardContainerMod.foo` */
  override def _to: ReactComponentClass[
    js.Function1[
      /* hasActiveCardOverlayCardOverlayEnabledCardShadowEnabledCardStyleCardStyleInterpolatorClosingGestureFocusedGestureDirectionGestureEnabledGestureResponseDistanceGestureVelocityImpactGetPreviousSceneGetFocusedRouteModeHeaderModeHeaderShownHeaderStyleInterpolatorHasAbsoluteHeaderHeaderHeightOnHeaderHeightChangeIsParentHeaderShownIndexLayoutOnCloseRouteOnOpenRouteOnPageChangeCancelOnPageChangeConfirmOnPageChangeStartOnGestureCancelOnGestureEndOnGestureStartOnTransitionEndOnTransitionStartRenderHeaderRenderSceneSafeAreaInsetBottomSafeAreaInsetLeftSafeAreaInsetRightSafeAreaInsetTopSceneTransitionSpec */ Props, 
      ReactElement
    ]
  ] = default
}
