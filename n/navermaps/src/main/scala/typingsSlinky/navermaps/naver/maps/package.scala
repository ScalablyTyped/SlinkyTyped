package typingsSlinky.navermaps.naver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maps {
  type AroundControl = typingsSlinky.navermaps.naver.maps.CustomControl
  type ArrayOfBounds = js.Array[
    typingsSlinky.navermaps.naver.maps.LatLngBounds | typingsSlinky.navermaps.naver.maps.PointBounds
  ]
  type ArrayOfBoundsLiteral = js.Array[
    typingsSlinky.navermaps.naver.maps.LatLngBoundsLiteral | typingsSlinky.navermaps.naver.maps.PointBoundsLiteral
  ]
  type ArrayOfCoords = js.Array[
    typingsSlinky.navermaps.naver.maps.LatLng | typingsSlinky.navermaps.naver.maps.Point
  ]
  type ArrayOfCoordsLiteral = js.Array[
    typingsSlinky.navermaps.naver.maps.LatLngLiteral | typingsSlinky.navermaps.naver.maps.PointLiteral
  ]
  type BoundsLiteral = typingsSlinky.navermaps.naver.maps.PointBoundsLiteral | typingsSlinky.navermaps.naver.maps.LatLngBoundsLiteral
  type CanvasTile = typingsSlinky.navermaps.naver.maps.Tile
  type CoordLiteral = typingsSlinky.navermaps.naver.maps.PointLiteral | typingsSlinky.navermaps.naver.maps.LatLngLiteral
  type DOMEvent = org.scalajs.dom.raw.Event
  type GPX = js.Any
  type GeoJSON = js.Any
  type KML = js.Any
  type KVOArrayOfCoords = js.Any
  // Naver Layers
  type LabelLayer = typingsSlinky.navermaps.naver.maps.Layer
  type LatLngBoundsLiteral = typingsSlinky.navermaps.naver.maps.PointBoundsLiteral | typingsSlinky.navermaps.naver.maps.LatLngBoundsObjectLiteral
  type LatLngLiteral = typingsSlinky.navermaps.naver.maps.PointLiteral | typingsSlinky.navermaps.naver.maps.LatLngObjectLiteral
  // Naver Controls
  type LogoControl = typingsSlinky.navermaps.naver.maps.CustomControl
  type MapDataControl = typingsSlinky.navermaps.naver.maps.CustomControl
  type MapTypeControl = typingsSlinky.navermaps.naver.maps.CustomControl
  type MapTypeId = java.lang.String
  /**
    * Types
    */
  type PointArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type PointBoundsArrayLiteral = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type PointBoundsLiteral = typingsSlinky.navermaps.naver.maps.PointBoundsArrayLiteral | typingsSlinky.navermaps.naver.maps.PointBoundsObjectLiteral
  type PointLiteral = typingsSlinky.navermaps.naver.maps.PointArrayLiteral | typingsSlinky.navermaps.naver.maps.PointObjectLiteral
  type ScaleControl = typingsSlinky.navermaps.naver.maps.CustomControl
  type SizeArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type SizeLiteral = typingsSlinky.navermaps.naver.maps.SizeArrayLiteral | typingsSlinky.navermaps.naver.maps.SizeObjectLiteral
  type StylingFunction = js.Function1[
    /* feature */ typingsSlinky.navermaps.naver.maps.Feature, 
    typingsSlinky.navermaps.naver.maps.StyleOptions
  ]
  type SymbolStyle = java.lang.String
  type ZoomControl = typingsSlinky.navermaps.naver.maps.CustomControl
  type forEachOverlayCallback = js.Function2[
    /* overlay */ typingsSlinky.navermaps.naver.maps.Marker | typingsSlinky.navermaps.naver.maps.Polyline | typingsSlinky.navermaps.naver.maps.Polygon, 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
