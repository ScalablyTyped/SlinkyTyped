package typingsSlinky.googlemaps.global.google.maps

import typingsSlinky.googlemaps.google.maps.Data.DataOptions
import typingsSlinky.googlemaps.google.maps.Data.FeatureOptions
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.maps.Data")
@js.native
class Data ()
  extends typingsSlinky.googlemaps.google.maps.Data {
  def this(options: DataOptions) = this()
}

@JSGlobal("google.maps.Data")
@js.native
object Data extends js.Object {
  @js.native
  class Feature ()
    extends typingsSlinky.googlemaps.google.maps.Data.Feature {
    def this(options: FeatureOptions) = this()
  }
  
  @js.native
  class Geometry ()
    extends typingsSlinky.googlemaps.google.maps.Data.Geometry {
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class GeometryCollection protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.GeometryCollection {
    def this(elements: js.Array[
            (js.Array[
              typingsSlinky.googlemaps.google.maps.Data.Geometry | typingsSlinky.googlemaps.google.maps.LatLng
            ]) | LatLngLiteral
          ]) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.Data.Geometry] = js.native
    /* CompleteClass */
    override def getAt(n: Double): typingsSlinky.googlemaps.google.maps.Data.Geometry = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class LineString protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.LineString {
    def this(elements: js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.LatLng] = js.native
    /* CompleteClass */
    override def getAt(n: Double): typingsSlinky.googlemaps.google.maps.LatLng = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class LinearRing protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.LinearRing {
    def this(elements: js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.LatLng] = js.native
    /* CompleteClass */
    override def getAt(n: Double): typingsSlinky.googlemaps.google.maps.LatLng = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class MultiLineString protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.MultiLineString {
    def this(elements: js.Array[
            typingsSlinky.googlemaps.google.maps.Data.LineString | (js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.Data.LineString] = js.native
    /* CompleteClass */
    override def getAt(n: Double): typingsSlinky.googlemaps.google.maps.Data.LineString = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class MultiPoint protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.MultiPoint {
    def this(elements: js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.LatLng] = js.native
    /* CompleteClass */
    override def getAt(n: Double): typingsSlinky.googlemaps.google.maps.LatLng = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class MultiPolygon protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.MultiPolygon {
    def this(elements: js.Array[
            typingsSlinky.googlemaps.google.maps.Data.Polygon | (js.Array[
              typingsSlinky.googlemaps.google.maps.Data.LinearRing | (js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral])
            ])
          ]) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.Data.Polygon] = js.native
    /* CompleteClass */
    override def getAt(n: Double): typingsSlinky.googlemaps.google.maps.Data.Polygon = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class Point protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.Point {
    def this(latLng: typingsSlinky.googlemaps.google.maps.LatLng) = this()
    def this(latLng: LatLngLiteral) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def get(): typingsSlinky.googlemaps.google.maps.LatLng = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @js.native
  class Polygon protected ()
    extends typingsSlinky.googlemaps.google.maps.Data.Polygon {
    def this(elements: js.Array[
            typingsSlinky.googlemaps.google.maps.Data.LinearRing | (js.Array[typingsSlinky.googlemaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typingsSlinky.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    /* CompleteClass */
    override def getArray(): js.Array[typingsSlinky.googlemaps.google.maps.Data.LinearRing] = js.native
    /* CompleteClass */
    override def getAt(n: Double): typingsSlinky.googlemaps.google.maps.Data.LinearRing = js.native
    /* CompleteClass */
    override def getLength(): Double = js.native
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
}

