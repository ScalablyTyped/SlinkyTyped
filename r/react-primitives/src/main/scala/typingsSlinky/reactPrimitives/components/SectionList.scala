package typingsSlinky.reactPrimitives.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.SectionListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object SectionList {
  
  @JSImport("react-primitives", "Animated.SectionList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[SectionT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPrimitives.mod.Animated.SectionList[SectionT]]
  
  def apply[SectionT](p: SectionListProps[SectionT] | AnimatedProps[SectionListProps[SectionT]]): Builder[SectionT] = new Builder[SectionT](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[SectionT](companion: SectionList.type): Builder[SectionT] = new Builder[SectionT](js.Array(this.component, js.Dictionary.empty))()
}
