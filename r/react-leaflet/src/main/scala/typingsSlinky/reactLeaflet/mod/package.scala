package typingsSlinky.reactLeaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddLayerHandler = js.Function3[
    /* layer */ typingsSlinky.leaflet.mod.Layer, 
    /* name */ java.lang.String, 
    /* checked */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type Children = slinky.core.facade.ReactElement | js.Array[slinky.core.facade.ReactElement]
  type LatLng = typingsSlinky.leaflet.mod.LatLng_ | js.Array[scala.Double] | js.Object
  type LatLngBounds = typingsSlinky.leaflet.mod.LatLngBounds_ | js.Array[typingsSlinky.reactLeaflet.mod.LatLng]
  type LayersControl[P /* <: typingsSlinky.reactLeaflet.mod.LayersControlProps */, E /* <: typingsSlinky.leaflet.mod.Control_.Layers */] = typingsSlinky.reactLeaflet.mod.LayersControl_[P, E]
  type LeafletEvents = typingsSlinky.reactLeaflet.mod.MapEvents with typingsSlinky.reactLeaflet.mod.MarkerEvents with typingsSlinky.reactLeaflet.mod.TileLayerEvents with typingsSlinky.reactLeaflet.mod.PathEvents with typingsSlinky.reactLeaflet.mod.FeatureGroupEvents with typingsSlinky.reactLeaflet.mod.LayersControlEvents
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type Point = (js.Tuple2[scala.Double, scala.Double]) | typingsSlinky.leaflet.mod.Point_
  type RemoveLayerHandler = js.Function1[/* layer */ typingsSlinky.leaflet.mod.Layer, scala.Unit]
}
