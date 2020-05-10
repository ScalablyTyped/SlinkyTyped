package typingsSlinky.reactNativeMaterialKit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object MKComponent {
  @JSImport("react-native-material-kit", "MKComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P, S] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeMaterialKit.mod.MKComponent[js.Any, js.Any]]
  
  def apply[P, S](p: P): Builder[P, S] = new Builder[P, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P, S](companion: MKComponent.type): Builder[P, S] = new Builder[P, S](js.Array(this.component, js.Dictionary.empty))()
}

