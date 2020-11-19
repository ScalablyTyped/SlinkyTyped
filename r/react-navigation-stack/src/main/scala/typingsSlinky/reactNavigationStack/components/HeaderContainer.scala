package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNavigationStack.anon.Height
import typingsSlinky.reactNavigationStack.headerContainerMod.Props
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.float
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.screen
import typingsSlinky.reactNavigationStack.vendorTypesMod.GestureDirection
import typingsSlinky.reactNavigationStack.vendorTypesMod.Layout
import typingsSlinky.reactNavigationStack.vendorTypesMod.Route
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderContainer {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderContainer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def onContentHeightChange(value: /* props */ Height => Unit): this.type = set("onContentHeightChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
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
  ): Builder = {
    val __props = js.Dynamic.literal(gestureDirection = gestureDirection.asInstanceOf[js.Any], getFocusedRoute = js.Any.fromFunction0(getFocusedRoute), getPreviousScene = js.Any.fromFunction1(getPreviousScene), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
