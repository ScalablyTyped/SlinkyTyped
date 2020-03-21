package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "MapLayer")
@js.native
class MapLayer[P /* <: MapLayerProps */, E /* <: Layer */] () extends MapComponent[P, E] {
  var contextValue: js.UndefOr[LeafletContext | Null] = js.native
  val layerContainer: LayerContainer | Map_ = js.native
  def createLeafletElement(props: P): E = js.native
  def updateLeafletElement(fromProps: P, toProps: P): Unit = js.native
}

