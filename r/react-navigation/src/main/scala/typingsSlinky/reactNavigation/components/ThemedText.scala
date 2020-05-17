package typingsSlinky.reactNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigation.mod.Themed.Text
import typingsSlinky.reactNavigation.mod.ThemedTextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Not a trait, Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree. */
object ThemedText {
  @JSImport("react-navigation", "Themed.Text")
  @js.native
  object component extends js.Object
  
  def apply(p: ThemedTextProps): Default[tag.type, Text] = new Default[tag.type, Text](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ThemedText.type): Default[tag.type, Text] = new Default[tag.type, Text](js.Array(this.component, js.Dictionary.empty))()
}

