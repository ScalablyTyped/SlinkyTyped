package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.float
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.screen
import typingsSlinky.reactNavigationStack.vendorTypesMod.Layout
import typingsSlinky.reactNavigationStack.vendorTypesMod.Route
import typingsSlinky.reactNavigationStack.vendorTypesMod.Scene
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("react-navigation-stack", "Header")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def previous(value: Scene[Route[String]]): this.type = set("previous", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StackHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    insets: EdgeInsets,
    layout: Layout,
    mode: float | screen,
    navigation: StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams],
    scene: Scene[Route[String]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
  ): Builder = {
    val __props = js.Dynamic.literal(insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    new Builder(js.Array(this.component, __props.asInstanceOf[StackHeaderProps]))
  }
}
