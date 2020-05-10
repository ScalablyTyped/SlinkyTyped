package typingsSlinky.reactPrimitives.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.Animated.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNative.mod.Animated.AnimatedProps[
typingsSlinky.reactNative.mod.Animated.ComponentProps[typingsSlinky.reactNative.mod.Text]] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object AnimatedText {
  @JSImport("react-primitives", "Animated.Text")
  @js.native
  object component extends js.Object
  
  def apply(p: AnimatedProps[ComponentProps[typingsSlinky.reactNative.mod.Text]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AnimatedText.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

