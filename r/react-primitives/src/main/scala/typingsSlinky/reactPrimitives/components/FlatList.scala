package typingsSlinky.reactPrimitives.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.FlatListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object FlatList {
  @JSImport("react-primitives", "Animated.FlatList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[ItemT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPrimitives.mod.Animated.FlatList[ItemT]]
  
  def apply[ItemT](p: FlatListProps[ItemT] | AnimatedProps[FlatListProps[ItemT]]): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[ItemT](companion: FlatList.type): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, js.Dictionary.empty))()
}

