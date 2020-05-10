package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expoLinearGradient.linearGradientMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.expoLinearGradient.linearGradientMod.Props because: IArray(Not a trait, Could't extract props from / * import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[T] * / js.Any because couldn't resolve ClassTree.) */
object LinearGradient {
  @JSImport("expo/build/globals.web", "LinearGradient")
  @js.native
  object component extends js.Object
  
  def apply(p: Props): Default[tag.type, typingsSlinky.expo.globalsWebMod.LinearGradient] = new Default[tag.type, typingsSlinky.expo.globalsWebMod.LinearGradient](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LinearGradient.type): Default[tag.type, typingsSlinky.expo.globalsWebMod.LinearGradient] = new Default[tag.type, typingsSlinky.expo.globalsWebMod.LinearGradient](js.Array(this.component, js.Dictionary.empty))()
}

