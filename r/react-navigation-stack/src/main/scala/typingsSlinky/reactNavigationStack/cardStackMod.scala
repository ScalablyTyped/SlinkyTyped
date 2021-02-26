package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigationStack.anon.Gestures
import typingsSlinky.reactNavigationStack.anon.Route
import typingsSlinky.reactNavigationStack.vendorTypesMod.Layout
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardMode
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackDescriptorMap
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderMode
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardStackMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardStack", JSImport.Default)
  @js.native
  class default protected () extends CardStack {
    def this(props: Props) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Stack/CardStack", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: Props, state: State): Gestures | Null = js.native
  }
  
  @js.native
  trait CardStack
    extends Component[Props, State, js.Any] {
    
    var getFocusedRoute: js.Any = js.native
    
    var getPreviousScene: js.Any = js.native
    
    var handleHeaderLayout: js.Any = js.native
    
    var handleLayout: js.Any = js.native
  }
  
  type GestureValues = StringDictionary[Value]
  
  @js.native
  trait Props extends StObject {
    
    var closingRouteKeys: js.Array[String] = js.native
    
    var descriptors: StackDescriptorMap = js.native
    
    var detachInactiveScreens: js.UndefOr[Boolean] = js.native
    
    def getGesturesEnabled(props: Route): Boolean = js.native
    
    def getPreviousRoute(props: Route): js.UndefOr[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]] = js.native
    
    var headerMode: StackHeaderMode = js.native
    
    var insets: EdgeInsets = js.native
    
    var isParentHeaderShown: Boolean = js.native
    
    var mode: StackCardMode = js.native
    
    def onCloseRoute(props: Route): Unit = js.native
    
    var onGestureCancel: js.UndefOr[js.Function1[/* props */ Route, Unit]] = js.native
    
    var onGestureEnd: js.UndefOr[js.Function1[/* props */ Route, Unit]] = js.native
    
    var onGestureStart: js.UndefOr[js.Function1[/* props */ Route, Unit]] = js.native
    
    def onOpenRoute(props: Route): Unit = js.native
    
    var onPageChangeCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPageChangeConfirm: js.UndefOr[js.Function1[/* force */ Boolean, Unit]] = js.native
    
    var onPageChangeStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    def onTransitionEnd(props: Route, closing: Boolean): Unit = js.native
    
    def onTransitionStart(props: Route, closing: Boolean): Unit = js.native
    
    var openingRouteKeys: js.Array[String] = js.native
    
    def renderHeader(props: typingsSlinky.reactNavigationStack.headerContainerMod.Props): ReactElement = js.native
    
    def renderScene(props: Route): ReactElement = js.native
    
    var routes: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]] = js.native
    
    var state: NavigationState = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      closingRouteKeys: js.Array[String],
      descriptors: StackDescriptorMap,
      getGesturesEnabled: Route => Boolean,
      getPreviousRoute: Route => js.UndefOr[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]],
      headerMode: StackHeaderMode,
      insets: EdgeInsets,
      isParentHeaderShown: Boolean,
      mode: StackCardMode,
      onCloseRoute: Route => Unit,
      onOpenRoute: Route => Unit,
      onTransitionEnd: (Route, Boolean) => Unit,
      onTransitionStart: (Route, Boolean) => Unit,
      openingRouteKeys: js.Array[String],
      renderHeader: typingsSlinky.reactNavigationStack.headerContainerMod.Props => ReactElement,
      renderScene: Route => ReactElement,
      routes: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]],
      state: NavigationState
    ): Props = {
      val __obj = js.Dynamic.literal(closingRouteKeys = closingRouteKeys.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], getGesturesEnabled = js.Any.fromFunction1(getGesturesEnabled), getPreviousRoute = js.Any.fromFunction1(getPreviousRoute), headerMode = headerMode.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any], isParentHeaderShown = isParentHeaderShown.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onCloseRoute = js.Any.fromFunction1(onCloseRoute), onOpenRoute = js.Any.fromFunction1(onOpenRoute), onTransitionEnd = js.Any.fromFunction2(onTransitionEnd), onTransitionStart = js.Any.fromFunction2(onTransitionStart), openingRouteKeys = openingRouteKeys.asInstanceOf[js.Any], renderHeader = js.Any.fromFunction1(renderHeader), renderScene = js.Any.fromFunction1(renderScene), routes = routes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosingRouteKeys(value: js.Array[String]): Self = StObject.set(x, "closingRouteKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosingRouteKeysVarargs(value: String*): Self = StObject.set(x, "closingRouteKeys", js.Array(value :_*))
      
      @scala.inline
      def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
      
      @scala.inline
      def setGetGesturesEnabled(value: Route => Boolean): Self = StObject.set(x, "getGesturesEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPreviousRoute(value: Route => js.UndefOr[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]]): Self = StObject.set(x, "getPreviousRoute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderMode(value: StackHeaderMode): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsParentHeaderShown(value: Boolean): Self = StObject.set(x, "isParentHeaderShown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: StackCardMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseRoute(value: Route => Unit): Self = StObject.set(x, "onCloseRoute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureCancel(value: /* props */ Route => Unit): Self = StObject.set(x, "onGestureCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureCancelUndefined: Self = StObject.set(x, "onGestureCancel", js.undefined)
      
      @scala.inline
      def setOnGestureEnd(value: /* props */ Route => Unit): Self = StObject.set(x, "onGestureEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureEndUndefined: Self = StObject.set(x, "onGestureEnd", js.undefined)
      
      @scala.inline
      def setOnGestureStart(value: /* props */ Route => Unit): Self = StObject.set(x, "onGestureStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnGestureStartUndefined: Self = StObject.set(x, "onGestureStart", js.undefined)
      
      @scala.inline
      def setOnOpenRoute(value: Route => Unit): Self = StObject.set(x, "onOpenRoute", js.Any.fromFunction1(value))
      
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
      def setOnTransitionEnd(value: (Route, Boolean) => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionStart(value: (Route, Boolean) => Unit): Self = StObject.set(x, "onTransitionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOpeningRouteKeys(value: js.Array[String]): Self = StObject.set(x, "openingRouteKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpeningRouteKeysVarargs(value: String*): Self = StObject.set(x, "openingRouteKeys", js.Array(value :_*))
      
      @scala.inline
      def setRenderHeader(value: typingsSlinky.reactNavigationStack.headerContainerMod.Props => ReactElement): Self = StObject.set(x, "renderHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderScene(value: Route => ReactElement): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoutes(value: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setState(value: NavigationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var descriptors: StackDescriptorMap = js.native
    
    var gestures: GestureValues = js.native
    
    var headerHeights: Record[String, Double] = js.native
    
    var layout: Layout = js.native
    
    var routes: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]] = js.native
    
    var scenes: js.Array[Scene[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]]] = js.native
  }
  object State {
    
    @scala.inline
    def apply(
      descriptors: StackDescriptorMap,
      gestures: GestureValues,
      headerHeights: Record[String, Double],
      layout: Layout,
      routes: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]],
      scenes: js.Array[Scene[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]]]
    ): State = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], gestures = gestures.asInstanceOf[js.Any], headerHeights = headerHeights.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptors(value: StackDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestures(value: GestureValues): Self = StObject.set(x, "gestures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeights(value: Record[String, Double]): Self = StObject.set(x, "headerHeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: js.Array[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setScenes(value: js.Array[Scene[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]]]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenesVarargs(value: Scene[typingsSlinky.reactNavigationStack.vendorTypesMod.Route[String]]*): Self = StObject.set(x, "scenes", js.Array(value :_*))
    }
  }
}
