package typingsSlinky.reactPrimitives.components

import org.scalablytyped.runtime.Instantiable0
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNative.mod.Animated.AnimatedProps[
typingsSlinky.react.mod.ComponentPropsWithRef[
  org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod.ScrollView]
]] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object ScrollView {
  
  @JSImport("react-primitives", "Animated.ScrollView")
  @js.native
  object component extends js.Object
  
  def apply(p: AnimatedProps[ComponentPropsWithRef[Instantiable0[typingsSlinky.reactNative.mod.ScrollView]]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ScrollView.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
