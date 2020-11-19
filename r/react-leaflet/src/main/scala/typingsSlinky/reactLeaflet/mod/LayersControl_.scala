package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.Control_.Layers
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.reactLeaflet.anon.AddBaseLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "LayersControl")
@js.native
class LayersControl_[P /* <: LayersControlProps */, E /* <: Layers */] () extends MapControl[P, E] {
  
  def addBaseLayer(layer: Layer, name: String, checked: Boolean): Unit = js.native
  
  def addOverlay(layer: Layer, name: String, checked: Boolean): Unit = js.native
  
  var controlProps: AddBaseLayer = js.native
  
  def removeLayer(layer: Layer): Unit = js.native
  
  def removeLayerControl(layer: Layer): Unit = js.native
}
