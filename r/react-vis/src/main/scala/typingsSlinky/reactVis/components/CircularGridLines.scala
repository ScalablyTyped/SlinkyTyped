package typingsSlinky.reactVis.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactVis.mod.CircularGridLinesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsSlinky.reactVis.mod.CircularGridLinesProps with T because: IArray(Could't extract props from T because couldn't resolve ClassTree.) */
object CircularGridLines {
  @JSImport("react-vis", "CircularGridLines")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVis.mod.CircularGridLines[T]]
  
  def apply[T](p: CircularGridLinesProps with T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[T](companion: CircularGridLines.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}

