package typingsSlinky.reactPrimitives.components

import org.scalablytyped.runtime.Instantiable0
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod._ScrollView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNative.mod.Animated.AnimatedProps[
typingsSlinky.react.mod.ComponentPropsWithRef[
  org.scalablytyped.runtime.Instantiable0[typingsSlinky.reactNative.mod._ScrollView]
]] because: IArray(Could't extract props from js.Any because couldn't resolve ClassTree.) */
object ScrollView {
  
  def apply(p: AnimatedProps[ComponentPropsWithRef[Instantiable0[_ScrollView]]]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-primitives", "Animated.ScrollView")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ScrollView.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
