package typingsSlinky.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AMap {
  
  type BezierCurve[ExtraData] = typingsSlinky.amapJsApi.AMap.BezierCurve_[ExtraData]
  
  type Buildings = typingsSlinky.amapJsApi.AMap.Buildings_
  
  type Circle[ExtraData] = typingsSlinky.amapJsApi.AMap.Circle_[ExtraData]
  
  /**
    * 圆点标记
    */
  type CircleMarker[ExtraData] = typingsSlinky.amapJsApi.AMap.Circle[ExtraData]
  
  type ContextMenu[ExtraData] = typingsSlinky.amapJsApi.AMap.ContextMenu_[ExtraData]
  
  type Ellipse[ExtraData] = typingsSlinky.amapJsApi.AMap.Ellipse_[ExtraData]
  
  type Event_[N /* <: java.lang.String */, V] = typingsSlinky.amapJsApi.anon.Type[N] with (typingsSlinky.amapJsApi.anon.Value[V] | js.Object | V)
  
  type GeoJSON[ExtraData] = typingsSlinky.amapJsApi.AMap.GeoJSON_[ExtraData]
  
  type Icon = typingsSlinky.amapJsApi.AMap.Icon_
  
  type InfoWindow[ExtraData] = typingsSlinky.amapJsApi.AMap.InfoWindow_[ExtraData]
  
  type LabelMarker[ExtraData] = typingsSlinky.amapJsApi.AMap.LabelMarker_[ExtraData]
  
  type LabelsLayer = typingsSlinky.amapJsApi.AMap.LabelsLayer_
  
  type Layer = typingsSlinky.amapJsApi.AMap.Layer_
  
  type LocationValue = typingsSlinky.amapJsApi.AMap.LngLat | (js.Tuple2[scala.Double, scala.Double])
  
  type Map = typingsSlinky.amapJsApi.AMap.Map_
  
  type MapsEvent[N /* <: java.lang.String */, I] = typingsSlinky.amapJsApi.AMap.Event_[N, typingsSlinky.amapJsApi.anon.Lnglat[I]]
  
  type Marker[ExtraData] = typingsSlinky.amapJsApi.AMap.Marker_[ExtraData]
  
  type MarkerShape = typingsSlinky.amapJsApi.AMap.EventEmitter
  
  type MassMarks[D /* <: typingsSlinky.amapJsApi.AMap.MassMarks.Data */] = typingsSlinky.amapJsApi.AMap.MassMarks_[D]
  
  type MediaLayer[E /* <: org.scalajs.dom.raw.HTMLElement */] = typingsSlinky.amapJsApi.AMap.MediaLayer_[E]
  
  type Merge[O, T] = O with T
  
  type Omit[T, E /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Exclude<keyof T, E> ]: T[K]}
    */ typingsSlinky.amapJsApi.amapJsApiStrings.Omit with org.scalablytyped.runtime.TopLevel[T]
  
  type OptionalKey[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  
  type Overlay[ExtraData] = typingsSlinky.amapJsApi.AMap.Overlay_[ExtraData]
  
  type PathOverlay[ExtraData] = typingsSlinky.amapJsApi.AMap.PathOverlay_[ExtraData]
  
  type Polygon[ExtraData] = typingsSlinky.amapJsApi.AMap.Polygon_[ExtraData]
  
  type Polyline[ExtraData] = typingsSlinky.amapJsApi.AMap.Polyline_[ExtraData]
  
  type Rectangle[ExtraData] = typingsSlinky.amapJsApi.AMap.Rectangle_[ExtraData]
  
  type ShapeOverlay[ExtraData] = typingsSlinky.amapJsApi.AMap.ShapeOverlay_[ExtraData]
  
  type SizeValue = typingsSlinky.amapJsApi.AMap.Size | (js.Tuple2[scala.Double, scala.Double])
  
  type Text[ExtraData] = typingsSlinky.amapJsApi.AMap.Text_[ExtraData]
  
  type TileLayer = typingsSlinky.amapJsApi.AMap.TileLayer_
  
  type View2D = typingsSlinky.amapJsApi.AMap.EventEmitter
}
