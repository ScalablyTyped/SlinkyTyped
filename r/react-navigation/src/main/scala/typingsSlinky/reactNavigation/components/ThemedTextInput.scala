package typingsSlinky.reactNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigation.mod.Themed.TextInput
import typingsSlinky.reactNavigation.mod.ThemedTextInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Not a trait, Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree. */
object ThemedTextInput {
  @JSImport("react-navigation", "Themed.TextInput")
  @js.native
  object component extends js.Object
  
  def apply(p: ThemedTextInputProps): Default[tag.type, TextInput] = new Default[tag.type, TextInput](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ThemedTextInput.type): Default[tag.type, TextInput] = new Default[tag.type, TextInput](js.Array(this.component, js.Dictionary.empty))()
}

