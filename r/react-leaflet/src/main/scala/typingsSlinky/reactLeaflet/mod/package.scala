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
  type LayersControl[P /* <: typingsSlinky.reactLeaflet.mod.LayersControlProps */, E /* <: typingsSlinky.leaflet.mod.Control_.Layers */] = typingsSlinky.reactLeaflet.mod.LayersControl_[P, E]
  type LeafletEvents = typingsSlinky.reactLeaflet.mod.MapEvents with typingsSlinky.reactLeaflet.mod.MarkerEvents with typingsSlinky.reactLeaflet.mod.TileLayerEvents with typingsSlinky.reactLeaflet.mod.PathEvents with typingsSlinky.reactLeaflet.mod.FeatureGroupEvents with typingsSlinky.reactLeaflet.mod.LayersControlEvents
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type RemoveLayerHandler = js.Function1[/* layer */ typingsSlinky.leaflet.mod.Layer, scala.Unit]
}
