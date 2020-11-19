package typingsSlinky.reactNavigationStack.headerContainerMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
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
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGestureDirection(value: GestureDirection): Self = this.set("gestureDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFocusedRoute(value: () => Route[String]): Self = this.set("getFocusedRoute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPreviousScene(value: typingsSlinky.reactNavigationStack.anon.Route => js.UndefOr[Scene[Route[String]]]): Self = this.set("getPreviousScene", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsets(value: EdgeInsets): Self = this.set("insets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: float | screen): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenesVarargs(value: js.UndefOr[Scene[Route[String]]]*): Self = this.set("scenes", js.Array(value :_*))
    
    @scala.inline
    def setScenes(value: js.Array[js.UndefOr[Scene[Route[String]]]]): Self = this.set("scenes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = this.set("styleInterpolator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContentHeightChange(value: /* props */ Height => Unit): Self = this.set("onContentHeightChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentHeightChange: Self = this.set("onContentHeightChange", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
