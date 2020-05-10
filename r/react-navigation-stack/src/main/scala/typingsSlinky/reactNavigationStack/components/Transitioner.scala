package typingsSlinky.reactNavigationStack.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.transitionerMod.Props
import typingsSlinky.reactNavigationStack.transitionerMod.TransitionSpec
import typingsSlinky.reactNavigationStack.transitionerMod.default
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.SceneDescriptorMap
import typingsSlinky.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transitioner {
  @JSImport("react-navigation-stack/lib/typescript/views/Transitioner", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def configureTransition(
      value: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => TransitionSpec
    ): this.type = set("configureTransition", js.Any.fromFunction2(value))
    @scala.inline
    def onTransitionEnd(
      value: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => Unit | js.Promise[_]
    ): this.type = set("onTransitionEnd", js.Any.fromFunction2(value))
    @scala.inline
    def onTransitionStart(
      value: (/* current */ TransitionProps, /* previous */ js.UndefOr[TransitionProps]) => Unit | js.Promise[_]
    ): this.type = set("onTransitionStart", js.Any.fromFunction2(value))
    @scala.inline
    def screenProps(value: js.Any): this.type = set("screenProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    render: (TransitionProps, js.UndefOr[TransitionProps]) => TagMod[Any]
  ): Builder = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

