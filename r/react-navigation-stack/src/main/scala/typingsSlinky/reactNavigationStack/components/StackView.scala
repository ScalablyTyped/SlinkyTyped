package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.stackViewMod.Props
import typingsSlinky.reactNavigationStack.stackViewMod.default
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackConfig
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackView {
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackView", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onGestureBegin(value: () => Unit): this.type = set("onGestureBegin", js.Any.fromFunction0(value))
    @scala.inline
    def onGestureCanceled(value: () => Unit): this.type = set("onGestureCanceled", js.Any.fromFunction0(value))
    @scala.inline
    def onGestureEnd(value: () => Unit): this.type = set("onGestureEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onTransitionStart(value: () => Unit): this.type = set("onTransitionStart", js.Any.fromFunction0(value))
    @scala.inline
    def screenProps(value: js.Any): this.type = set("screenProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    navigationConfig: NavigationStackConfig
  ): Builder = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

