package typingsSlinky.reactNavigationStack

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNavigationStack.anon.Height
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.float
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.screen
import typingsSlinky.reactNavigationStack.vendorTypesMod.GestureDirection
import typingsSlinky.reactNavigationStack.vendorTypesMod.Layout
import typingsSlinky.reactNavigationStack.vendorTypesMod.Route
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderStyleInterpolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerContainerMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer", JSImport.Default)
  @js.native
  def default(
    hasModeScenesLayoutInsetsGetPreviousSceneGetFocusedRouteOnContentHeightChangeGestureDirectionStyleInterpolatorStyle: Props
  ): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    var gestureDirection: GestureDirection = js.native
    
    def getFocusedRoute(): Route[String] = js.native
    
    def getPreviousScene(props: typingsSlinky.reactNavigationStack.anon.Route): js.UndefOr[Scene[Route[String]]] = js.native
    
    var insets: EdgeInsets = js.native
    
    var layout: Layout = js.native
    
    var mode: float | screen = js.native
    
    var onContentHeightChange: js.UndefOr[js.Function1[/* props */ Height, Unit]] = js.native
    
    var scenes: js.Array[js.UndefOr[Scene[Route[String]]]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styleInterpolator: StackHeaderStyleInterpolator = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
      gestureDirection: GestureDirection,
      getFocusedRoute: () => Route[String],
      getPreviousScene: typingsSlinky.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]],
      insets: EdgeInsets,
      layout: Layout,
      mode: float | screen,
      scenes: js.Array[js.UndefOr[Scene[Route[String]]]],
      styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
    ): Props = {
      val __obj = js.Dynamic.literal(gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousScene = js.Any.fromFunction1(getPreviousScene), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGestureDirection(value: GestureDirection): Self = StObject.set(x, "gestureDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFocusedRoute(value: () => Route[String]): Self = StObject.set(x, "getFocusedRoute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousScene(value: typingsSlinky.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = StObject.set(x, "getPreviousScene", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: float | screen): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnContentHeightChange(value: /* props */ Height => Unit): Self = StObject.set(x, "onContentHeightChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentHeightChangeUndefined: Self = StObject.set(x, "onContentHeightChange", js.undefined)
      
      @scala.inline
      def setScenes(value: js.Array[js.UndefOr[Scene[Route[String]]]]): Self = StObject.set(x, "scenes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenesVarargs(value: js.UndefOr[Scene[Route[String]]]*): Self = StObject.set(x, "scenes", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
