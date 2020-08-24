package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Overlay {
  @JSImport("react-leaflet", "LayersControl.Overlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[/* <: typingsSlinky.reactLeaflet.mod.LayersControl.ControlledLayerProps */ P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.LayersControl.Overlay[P]]
  
  def apply[/* <: typingsSlinky.reactLeaflet.mod.LayersControl.ControlledLayerProps */ P](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[/* <: typingsSlinky.reactLeaflet.mod.LayersControl.ControlledLayerProps */ P](companion: Overlay.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}

