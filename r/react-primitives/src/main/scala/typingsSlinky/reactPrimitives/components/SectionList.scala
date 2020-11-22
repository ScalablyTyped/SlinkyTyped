package typingsSlinky.reactPrimitives.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.SectionListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNative.mod.Animated.AnimatedProps[typingsSlinky.reactNative.mod.SectionListProps[ItemT, SectionT]] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object SectionList {
  
  @JSImport("react-primitives", "Animated.SectionList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[ItemT, SectionT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPrimitives.mod.Animated.SectionList[ItemT, SectionT]]
  
  def apply[ItemT, SectionT](p: AnimatedProps[SectionListProps[ItemT, SectionT]]): Builder[ItemT, SectionT] = new Builder[ItemT, SectionT](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[ItemT, SectionT](companion: SectionList.type): Builder[ItemT, SectionT] = new Builder[ItemT, SectionT](js.Array(this.component, js.Dictionary.empty))()
}
