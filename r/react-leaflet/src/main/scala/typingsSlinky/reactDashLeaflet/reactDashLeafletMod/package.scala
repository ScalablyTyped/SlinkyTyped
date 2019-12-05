package typingsSlinky.reactDashLeaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLeafletMod {
  import slinky.core.TagMod
  import typingsSlinky.leaflet.leafletMod.Control.AttributionOptions
  import typingsSlinky.leaflet.leafletMod.Control.Layers
  import typingsSlinky.leaflet.leafletMod.Control.ScaleOptions
  import typingsSlinky.leaflet.leafletMod.Control.ZoomOptions
  import typingsSlinky.leaflet.leafletMod.ControlOptions
  import typingsSlinky.leaflet.leafletMod.Layer
  import typingsSlinky.reactDashLeaflet.Anon_Leaflet
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type AddLayerHandler = js.Function3[/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean], Unit]
  type AttributionControlProps = AttributionOptions with MapControlProps
  type Children = TagMod[Any] | js.Array[TagMod[Any]]
  type LatLng = typingsSlinky.leaflet.leafletMod.LatLng | js.Array[Double] | js.Object
  type LatLngBounds = typingsSlinky.leaflet.leafletMod.LatLngBounds | js.Array[LatLng]
  type LayersControl[P /* <: LayersControlProps */, E /* <: Layers */] = LayersControl_[P, E]
  type LeafletEvents = MapEvents with MarkerEvents with TileLayerEvents with PathEvents with FeatureGroupEvents with LayersControlEvents
  type MapControlProps = Anon_Leaflet with ControlOptions
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Point = (js.Tuple2[Double, Double]) | typingsSlinky.leaflet.leafletMod.Point
  type RemoveLayerHandler = js.Function1[/* layer */ Layer, Unit]
  type ScaleControlProps = ScaleOptions with MapControlProps
  type ZoomControlProps = ZoomOptions with MapControlProps
}
