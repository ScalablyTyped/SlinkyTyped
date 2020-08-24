package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLeaflet.mod.LayersControl_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object LayersControl {
  @JSImport("react-leaflet", "LayersControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactLeaflet.mod.AttributionControlProps */ P, /* <: typingsSlinky.leaflet.mod.Control_.Attribution */ E] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, LayersControl_[P, E]]
  
  def apply[/* <: typingsSlinky.reactLeaflet.mod.LayersControlProps */ P, /* <: typingsSlinky.leaflet.mod.Control_.Layers */ E](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactLeaflet.mod.LayersControlProps */ P, /* <: typingsSlinky.leaflet.mod.Control_.Layers */ E](companion: LayersControl.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}

