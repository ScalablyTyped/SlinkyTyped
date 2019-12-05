package typingsSlinky.reactDashLeaflet.reactDashLeafletMod.LayersControl

import typingsSlinky.leaflet.leafletMod.Layer
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.LeafletContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "LayersControl.ControlledLayer")
@js.native
class ControlledLayer[P /* <: ControlledLayerProps */] ()
  extends Component[P, js.Object, js.Any] {
  var contextValue: LeafletContext = js.native
  var layer: js.UndefOr[Layer | Null] = js.native
  def removeLayer(layer: Layer): Unit = js.native
}

