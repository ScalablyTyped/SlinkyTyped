package typingsSlinky.dojo.dojox.geo.openlayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/GreatCircle.html
  *
  *
  */
@js.native
trait GreatCircle extends js.Object {
  /**
    *
    */
  var DEG2RAD: Double = js.native
  /**
    *
    */
  var RAD2DEG: Double = js.native
  /**
    *
    */
  var TOLERANCE: Double = js.native
  /**
    * Create a geodetic line as an array of dojox.geo.openlayers.GeometryFeature.
    * Create a geodetic line as a dojox.geo.openlayers.GeometryFeature between the point p1
    * ant the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toGeometryFeature(p1: Point, p2: Point, increment: Double): js.Any = js.native
  /**
    * Create a geodetic line as an array of OpenLayers.Geometry.LineString.
    * Create a geodetic line as a OpenLayers.Geometry.LineString between the point p1
    * and the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toLineString(p1: Point, p2: Point, increment: Double): js.Any = js.native
  /**
    * Create a geodetic line as an array of OpenLayers.Point.
    * Create a geodetic line as an array of OpenLayers.Point between the point p1
    * and the point p2. Result is a polyline approximation for which a new point is
    * calculated every increment degrees.
    *
    * @param p1 The first point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param p2 The second point of the geodetic line. x and y fields are longitude andlatitude in decimal degrees.
    * @param increment The value at which a new point is computed.
    */
  def toPointArray(p1: Point, p2: Point, increment: Double): js.Array[_] = js.native
}

object GreatCircle {
  @scala.inline
  def apply(
    DEG2RAD: Double,
    RAD2DEG: Double,
    TOLERANCE: Double,
    toGeometryFeature: (Point, Point, Double) => js.Any,
    toLineString: (Point, Point, Double) => js.Any,
    toPointArray: (Point, Point, Double) => js.Array[_]
  ): GreatCircle = {
    val __obj = js.Dynamic.literal(DEG2RAD = DEG2RAD.asInstanceOf[js.Any], RAD2DEG = RAD2DEG.asInstanceOf[js.Any], TOLERANCE = TOLERANCE.asInstanceOf[js.Any], toGeometryFeature = js.Any.fromFunction3(toGeometryFeature), toLineString = js.Any.fromFunction3(toLineString), toPointArray = js.Any.fromFunction3(toPointArray))
    __obj.asInstanceOf[GreatCircle]
  }
  @scala.inline
  implicit class GreatCircleOps[Self <: GreatCircle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEG2RAD(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEG2RAD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRAD2DEG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RAD2DEG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOLERANCE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOLERANCE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToGeometryFeature(value: (Point, Point, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toGeometryFeature")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withToLineString(value: (Point, Point, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLineString")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withToPointArray(value: (Point, Point, Double) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPointArray")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

