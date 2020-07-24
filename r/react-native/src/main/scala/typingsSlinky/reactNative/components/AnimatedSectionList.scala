package typingsSlinky.reactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.SectionListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNative.reactNativeStrings.AnimatedProps with typingsSlinky.reactNative.mod.SectionListProps[SectionT] with (js.Object | typingsSlinky.reactNative.anon.`2`) because: IArray(Not a trait) */
object AnimatedSectionList {
  @JSImport("react-native", "Animated.SectionList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[SectionT] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNative.mod.Animated.SectionList[SectionT]]
  
  def apply[SectionT](p: SectionListProps[SectionT] | AnimatedProps[SectionListProps[SectionT]]): Builder[SectionT] = new Builder[SectionT](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[SectionT](companion: AnimatedSectionList.type): Builder[SectionT] = new Builder[SectionT](js.Array(this.component, js.Dictionary.empty))()
}

