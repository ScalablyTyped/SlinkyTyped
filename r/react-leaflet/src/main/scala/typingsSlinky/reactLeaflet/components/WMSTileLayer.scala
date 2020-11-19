package typingsSlinky.reactLeaflet.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.leaflet.mod.TileLayer_.WMS
import typingsSlinky.reactLeaflet.mod.WMSTileLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object WMSTileLayer {
  
  @JSImport("react-leaflet", "WMSTileLayer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[P /* <: WMSTileLayerProps */, E /* <: WMS */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactLeaflet.mod.WMSTileLayer[P, E]]
  
  def apply[P /* <: WMSTileLayerProps */, E /* <: WMS */](p: P): Builder[P, E] = new Builder[P, E](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make[P /* <: WMSTileLayerProps */, E /* <: WMS */](companion: WMSTileLayer.type): Builder[P, E] = new Builder[P, E](js.Array(this.component, js.Dictionary.empty))()
}
