package typingsSlinky.reactNativeTabView.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeTabView.anon.Loading
import typingsSlinky.reactNativeTabView.reactNativeTabViewStrings.enter
import typingsSlinky.reactNativeTabView.sceneViewMod.Props
import typingsSlinky.reactNativeTabView.sceneViewMod.default
import typingsSlinky.reactNativeTabView.typesMod.Layout
import typingsSlinky.reactNativeTabView.typesMod.Listener
import typingsSlinky.reactNativeTabView.typesMod.NavigationState
import typingsSlinky.reactNativeTabView.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SceneView {
  
  @JSImport("react-native-tab-view/lib/typescript/src/SceneView", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: Route */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T]] {
    
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps[T /* <: Route */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T /* <: Route */](
    addListener: (enter, Listener) => Unit,
    children: Loading => ReactElement,
    index: Double,
    jumpTo: String => Unit,
    layout: Layout,
    `lazy`: Boolean,
    lazyPreloadDistance: Double,
    navigationState: NavigationState[T],
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    removeListener: (enter, Listener) => Unit
  ): Builder[T] = {
    val __props = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), children = js.Any.fromFunction1(children), index = index.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1(jumpTo), layout = layout.asInstanceOf[js.Any], lazyPreloadDistance = lazyPreloadDistance.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction2(removeListener))
    __props.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
}
