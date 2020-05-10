package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Circle_
import typingsSlinky.reactLeaflet.mod.CircleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Circle {
  @JSImport("react-leaflet", "Circle")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: CircleProps, E <: Circle_[js.Any]] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.Circle[js.Any, js.Any]]
  
  def apply[P <: CircleProps, E <: Circle_[js.Any]](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: CircleProps, E <: Circle_[js.Any]](companion: Circle.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

