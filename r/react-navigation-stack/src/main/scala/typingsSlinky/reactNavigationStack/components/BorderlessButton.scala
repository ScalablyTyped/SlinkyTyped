package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNavigationStack.borderlessButtonMod.Props
import typingsSlinky.reactNavigationStack.borderlessButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactNavigationStack.borderlessButtonMod.Props because: IArray(Not a trait, Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object BorderlessButton {
  @JSImport("react-navigation-stack/lib/typescript/views/BorderlessButton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def apply(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BorderlessButton.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}

