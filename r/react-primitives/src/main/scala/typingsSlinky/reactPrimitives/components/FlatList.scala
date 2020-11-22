package typingsSlinky.reactPrimitives.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.FlatListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNative.mod.Animated.AnimatedProps[typingsSlinky.reactNative.mod.FlatListProps[ItemT]] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object FlatList {
  
  @JSImport("react-primitives", "Animated.FlatList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[ItemT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPrimitives.mod.Animated.FlatList[ItemT]]
  
  def apply[ItemT](p: AnimatedProps[FlatListProps[ItemT]]): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[ItemT](companion: FlatList.type): Builder[ItemT] = new Builder[ItemT](js.Array(this.component, js.Dictionary.empty))()
}
