package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactLeaflet.mod.LayersControl.ControlledLayerProps
import typingsSlinky.reactLeaflet.mod.LayersControl.Overlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object LayersControlOverlay {
  @JSImport("react-leaflet", "LayersControl.Overlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P <: ControlledLayerProps] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Overlay[js.Any]]
  
  def apply[P <: ControlledLayerProps](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[P <: ControlledLayerProps](companion: LayersControlOverlay.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}

