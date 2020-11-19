package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.TileLayer_
import typingsSlinky.reactLeaflet.mod.TileLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object TileLayer {
  
  @JSImport("react-leaflet", "TileLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P /* <: TileLayerProps */, E /* <: TileLayer_ */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.TileLayer[P, E]]
  
  def apply[P /* <: TileLayerProps */, E /* <: TileLayer_ */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P /* <: TileLayerProps */, E /* <: TileLayer_ */](companion: TileLayer.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
