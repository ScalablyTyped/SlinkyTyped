package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.Data.DataOptions
import typingsSlinky.googlemaps.google.maps.Data.FeatureOptions
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.Data")
@js.native
class Data ()
  extends typingsSlinky.googlemaps.google.maps.Data {
  def this(options: DataOptions) = this()
}
object Data {
  
  @JSGlobal("google.maps.Data.Feature")
  @js.native
  class Feature ()
    extends typingsSlinky.googlemaps.google.maps.Data.Feature {
    def this(options: FeatureOptions) = this()
  }
  
  @JSGlobal("google.maps.Data.Geometry")
  @js.native
  class Geometry ()
    extends typingsSlinky.googlemaps.google.maps.Data.Geometry
  
  @JSGlobal("google.maps.Data.GeometryCollection")
  @js.native
  class GeometryCollection protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.GeometryCollection {
    def this(elements: js.Array[
            (js.Array[
              typingsSlinky.googlemaps.google.maps.Data.Geometry | typingsSlinky.googlemaps.google.maps.LatLng
            ]) | LatLngLiteral
          ]) = this()
  }
  
  @JSGlobal("google.maps.Data.LineString")
  @js.native
  class LineString protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.LineString {
    def this(elements: js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
  }
  
  @JSGlobal("google.maps.Data.LinearRing")
  @js.native
  class LinearRing protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.LinearRing {
    def this(elements: js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
  }
  
  @JSGlobal("google.maps.Data.MultiLineString")
  @js.native
  class MultiLineString protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.MultiLineString {
    def this(elements: js.Array[
            typingsSlinky.googlemaps.google.maps.Data.LineString | (js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
  }
  
  @JSGlobal("google.maps.Data.MultiPoint")
  @js.native
  class MultiPoint protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.MultiPoint {
    def this(elements: js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
  }
  
  @JSGlobal("google.maps.Data.MultiPolygon")
  @js.native
  class MultiPolygon protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.MultiPolygon {
    def this(elements: js.Array[
            typingsSlinky.googlemaps.google.maps.Data.Polygon | (js.Array[
              typingsSlinky.googlemaps.google.maps.Data.LinearRing | (js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral])
            ])
          ]) = this()
  }
  
  @JSGlobal("google.maps.Data.Point")
  @js.native
  class Point protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.Point {
    def this(latLng: typingsSlinky.googlemaps.google.maps.LatLng) = this()
    def this(latLng: LatLngLiteral) = this()
  }
  
  @JSGlobal("google.maps.Data.Polygon")
  @js.native
  class Polygon protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.Polygon {
    def this(elements: js.Array[
            typingsSlinky.googlemaps.google.maps.Data.LinearRing | (js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
  }
}
