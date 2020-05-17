package typingsSlinky.reactNavigation.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigation.mod.Themed.StatusBar
import typingsSlinky.reactNavigation.mod.ThemedStatusBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Not a trait, Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree. */
object ThemedStatusBar {
  @JSImport("react-navigation", "Themed.StatusBar")
  @js.native
  object component extends js.Object
  
  def apply(p: ThemedStatusBarProps): Default[tag.type, StatusBar] = new Default[tag.type, StatusBar](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ThemedStatusBar.type): Default[tag.type, StatusBar] = new Default[tag.type, StatusBar](js.Array(this.component, js.Dictionary.empty))()
}

