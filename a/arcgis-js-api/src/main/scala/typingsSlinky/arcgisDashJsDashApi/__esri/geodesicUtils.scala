package typingsSlinky.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-centimeters`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-decimeters`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-inches`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-kilometers`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-meters`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-miles`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-millimeters`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`square-yards`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.acres
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ares
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centimeters
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decimeters
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hectares
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.millimeters
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait geodesicUtils extends js.Object {
  /**
    * Geodetically computes the area for one or more polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicAreas)
    *
    * @param polygons The polygons to compute the area for.
    * @param unit Output area units.
    *
    */
  def geodesicAreas(polygons: js.Array[Polygon]): js.Array[Double] = js.native
  def geodesicAreas(
    polygons: js.Array[Polygon],
    unit: `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
  ): js.Array[Double] = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double): Polyline | Polygon = js.native
  /**
    * Computes and returns a densified polyline or polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicDensify)
    *
    * @param geometry The input polyline or polygon.
    * @param maxSegmentLength The maximum length (in meters) between vertices.
    *
    */
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double): Polyline | Polygon = js.native
  /**
    * Geodetically computes the direction and distance between two known locations. Both input points must have the same geographic coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicDistance)
    *
    * @param from The origin location.
    * @param to The destination location.
    * @param unit Output linear units.
    *
    */
  def geodesicDistance(from: Point, to: Point): GeodesicDistanceResult = js.native
  def geodesicDistance(
    from: Point,
    to: Point,
    unit: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ): GeodesicDistanceResult = js.native
  /**
    * Geodetically computes polygon perimeter or polyline length for one or more geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicLengths)
    *
    * @param geometries The input polylines or polygons.
    * @param unit Output linear units.
    *
    */
  def geodesicLengths(geometries: js.Array[Polygon | Polyline]): js.Array[Double] = js.native
  def geodesicLengths(
    geometries: js.Array[Polygon | Polyline],
    unit: centimeters | decimeters | feet_ | inches | kilometers_ | meters_ | miles_ | millimeters | `nautical-miles` | `us-feet` | yards
  ): js.Array[Double] = js.native
  /**
    * Geodetically computes the location at a defined distance and direction from a known location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#pointFromDistance)
    *
    * @param point Origin location.
    * @param distance Distance from the origin in meters.
    * @param azimuth Direction from the origin in degrees.
    *
    */
  def pointFromDistance(point: Point, distance: Double, azimuth: Double): Point = js.native
}

@JSGlobal("__esri.geodesicUtils")
@js.native
object geodesicUtils extends TopLevel[geodesicUtils]

