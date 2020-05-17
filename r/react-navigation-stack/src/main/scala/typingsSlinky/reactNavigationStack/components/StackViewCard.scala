package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.anon.PickPropsstylechildrensce
import typingsSlinky.reactNavigationStack.stackViewCardMod.default
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackViewCard {
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewCard", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def transparent(value: Boolean): this.type = set("transparent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsstylechildrensce): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    animatedStyle: js.Any,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: AnimatedInterpolation,
    realPosition: Value,
    scene: Scene
  ): Builder = {
    val __props = js.Dynamic.literal(animatedStyle = animatedStyle.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], realPosition = realPosition.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsstylechildrensce]))
  }
}

