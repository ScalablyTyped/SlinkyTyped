package typingsSlinky.reactLeaflet.mod.LayersControl

import typingsSlinky.leaflet.mod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-leaflet", "LayersControl.Overlay")
@js.native
class Overlay[P /* <: ControlledLayerProps */] protected () extends ControlledLayer[P] {
  def this(props: ControlledLayerProps) = this()
  
  def addLayer(layer: Layer): Unit = js.native
}
