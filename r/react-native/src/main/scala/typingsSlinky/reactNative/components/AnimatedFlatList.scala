package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.FlatListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNative.reactNativeStrings.AnimatedProps with typingsSlinky.reactNative.mod.FlatListProps[ItemT] with (js.Object | typingsSlinky.reactNative.anon.`2`) because: IArray(Not a trait) */
object AnimatedFlatList {
  @JSImport("react-native", "Animated.FlatList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[ItemT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.Animated.FlatList[ItemT]]
  
  def apply[ItemT](p: FlatListProps[ItemT] | AnimatedProps[FlatListProps[ItemT]]): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[ItemT](companion: AnimatedFlatList.type): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, js.Dictionary.empty))()
}

