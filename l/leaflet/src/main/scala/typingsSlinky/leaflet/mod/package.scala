package typingsSlinky.leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundsLiteral = js.Tuple2[typingsSlinky.leaflet.mod.PointTuple, typingsSlinky.leaflet.mod.PointTuple]
  type Control_ = typingsSlinky.leaflet.mod.Control__
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[js.Error], 
    /* tile */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  type DragEndEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.DragEndEvent, scala.Unit]
  type ErrorEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.ErrorEvent, scala.Unit]
  type Icon_[T /* <: typingsSlinky.leaflet.mod.BaseIconOptions */] = typingsSlinky.leaflet.mod.Icon__[T]
  type InternalTiles = org.scalablytyped.runtime.StringDictionary[typingsSlinky.leaflet.anon.Active]
  type LatLngBoundsLiteral = js.Array[typingsSlinky.leaflet.mod.LatLngTuple]
  type LatLngTuple = js.Tuple2[scala.Double, scala.Double]
  type LayerEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LayerEvent, scala.Unit]
  type LayersControlEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LayersControlEvent, scala.Unit]
  type LeafletEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LeafletEvent, scala.Unit]
  type LeafletKeyboardEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LeafletKeyboardEvent, scala.Unit]
  type LeafletMouseEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LeafletMouseEvent, scala.Unit]
  type LocationEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.LocationEvent, scala.Unit]
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
  type PopupEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.PopupEvent, scala.Unit]
  type ResizeEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.ResizeEvent, scala.Unit]
  type StyleFunction[P] = js.Function1[
    /* feature */ js.UndefOr[typingsSlinky.geojson.mod.Feature[typingsSlinky.geojson.mod.GeometryObject, P]], 
    typingsSlinky.leaflet.mod.PathOptions
  ]
  type TileErrorEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.TileErrorEvent, scala.Unit]
  type TileEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.TileEvent, scala.Unit]
  type TooltipEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.TooltipEvent, scala.Unit]
  type ZoomAnimEventHandlerFn = js.Function1[/* event */ typingsSlinky.leaflet.mod.ZoomAnimEvent, scala.Unit]
}
