package typingsSlinky.reactGoogleMapsLoader

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googlemaps.google.maps.Data.Feature
import typingsSlinky.googlemaps.google.maps.Data.Geometry
import typingsSlinky.googlemaps.google.maps.Data.GeometryCollection
import typingsSlinky.googlemaps.google.maps.Data.LineString
import typingsSlinky.googlemaps.google.maps.Data.LinearRing
import typingsSlinky.googlemaps.google.maps.Data.MultiLineString
import typingsSlinky.googlemaps.google.maps.Data.MultiPoint
import typingsSlinky.googlemaps.google.maps.Data.MultiPolygon
import typingsSlinky.googlemaps.google.maps.Data.Point
import typingsSlinky.googlemaps.google.maps.Data.Polygon
import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofData extends js.Object {
  var Feature: Instantiable0[typingsSlinky.googlemaps.google.maps.Data.Feature] = js.native
  var Geometry: Instantiable0[typingsSlinky.googlemaps.google.maps.Data.Geometry] = js.native
  var GeometryCollection: Instantiable1[
    /* elements */ js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral], 
    typingsSlinky.googlemaps.google.maps.Data.GeometryCollection
  ] = js.native
  var LineString: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typingsSlinky.googlemaps.google.maps.Data.LineString
  ] = js.native
  var LinearRing: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typingsSlinky.googlemaps.google.maps.Data.LinearRing
  ] = js.native
  var MultiLineString: Instantiable1[
    /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
    typingsSlinky.googlemaps.google.maps.Data.MultiLineString
  ] = js.native
  var MultiPoint: Instantiable1[
    /* elements */ js.Array[LatLng | LatLngLiteral], 
    typingsSlinky.googlemaps.google.maps.Data.MultiPoint
  ] = js.native
  var MultiPolygon: Instantiable1[
    /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
    typingsSlinky.googlemaps.google.maps.Data.MultiPolygon
  ] = js.native
  var Point: Instantiable1[/* latLng */ LatLng, typingsSlinky.googlemaps.google.maps.Data.Point] = js.native
  var Polygon: Instantiable1[
    /* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], 
    typingsSlinky.googlemaps.google.maps.Data.Polygon
  ] = js.native
}

object TypeofData {
  @scala.inline
  def apply(
    Feature: Instantiable0[Feature],
    Geometry: Instantiable0[Geometry],
    GeometryCollection: Instantiable1[
      /* elements */ js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral], 
      GeometryCollection
    ],
    LineString: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LineString],
    LinearRing: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LinearRing],
    MultiLineString: Instantiable1[
      /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
      MultiLineString
    ],
    MultiPoint: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], MultiPoint],
    MultiPolygon: Instantiable1[
      /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
      MultiPolygon
    ],
    Point: Instantiable1[/* latLng */ LatLng, Point],
    Polygon: Instantiable1[/* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], Polygon]
  ): TypeofData = {
    val __obj = js.Dynamic.literal(Feature = Feature.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any], GeometryCollection = GeometryCollection.asInstanceOf[js.Any], LineString = LineString.asInstanceOf[js.Any], LinearRing = LinearRing.asInstanceOf[js.Any], MultiLineString = MultiLineString.asInstanceOf[js.Any], MultiPoint = MultiPoint.asInstanceOf[js.Any], MultiPolygon = MultiPolygon.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofData]
  }
  @scala.inline
  implicit class TypeofDataOps[Self <: TypeofData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeature(value: Instantiable0[Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometry(value: Instantiable0[Geometry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometryCollection(
      value: Instantiable1[
          /* elements */ js.Array[(js.Array[Geometry | LatLng]) | LatLngLiteral], 
          GeometryCollection
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeometryCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineString(value: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LineString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinearRing(value: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], LinearRing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinearRing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLineString(
      value: Instantiable1[
          /* elements */ js.Array[LineString | (js.Array[LatLng | LatLngLiteral])], 
          MultiLineString
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLineString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiPoint(value: Instantiable1[/* elements */ js.Array[LatLng | LatLngLiteral], MultiPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiPolygon(
      value: Instantiable1[
          /* elements */ js.Array[Polygon | (js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])])], 
          MultiPolygon
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiPolygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Instantiable1[/* latLng */ LatLng, Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygon(
      value: Instantiable1[/* elements */ js.Array[LinearRing | (js.Array[LatLng | LatLngLiteral])], Polygon]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

