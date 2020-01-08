package typingsSlinky.reactDashLeafletDashMarkercluster

import typingsSlinky.leaflet.leafletMod.Layer
import typingsSlinky.leafletDotMarkercluster.leafletMod.MarkerClusterGroupOptions
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.MapLayer
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.MapLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet-markercluster", JSImport.Namespace)
@js.native
object reactDashLeafletDashMarkerclusterMod extends js.Object {
  @js.native
  class default[P /* <: MarkerClusterGroupProps */] () extends MapLayer[P, Layer]
  
  type MarkerClusterGroup[P /* <: MarkerClusterGroupProps */] = MapLayer[P, Layer]
  type MarkerClusterGroupProps = MapLayerProps with MarkerClusterGroupOptions
}

