package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Marker_
import typingsSlinky.reactLeaflet.mod.MarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Marker {
  @JSImport("react-leaflet", "Marker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: MarkerProps, E <: Marker_[js.Any]] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.Marker[js.Any, js.Any]]
  
  def apply[P <: MarkerProps, E <: Marker_[js.Any]](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: MarkerProps, E <: Marker_[js.Any]](companion: Marker.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

