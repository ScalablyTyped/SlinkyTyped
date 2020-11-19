package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.reactLeaflet.mod.MapLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object MapLayer {
  
  @JSImport("react-leaflet", "MapLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P /* <: MapLayerProps */, E /* <: Layer */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.MapLayer[P, E]]
  
  def apply[P /* <: MapLayerProps */, E /* <: Layer */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P /* <: MapLayerProps */, E /* <: Layer */](companion: MapLayer.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
