package typingsSlinky.geodesy.latlonNvectorSphericalMod

import typingsSlinky.geodesy.mod.Dp
import typingsSlinky.geodesy.mod.Format
import typingsSlinky.geodesy.mod.GeoJSON
import typingsSlinky.geodesy.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LatLonNvectorSpherical extends PathBrngEnd {
  def alongTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd): Double = js.native
  def alongTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd, radius: Double): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd): Double = js.native
  def crossTrackDistanceTo(pathStart: LatLonNvectorSpherical, pathBrngEnd: PathBrngEnd, radius: Double): Double = js.native
  def destinationPoint(distance: Double, bearing: Double): LatLonNvectorSpherical = js.native
  def destinationPoint(distance: Double, bearing: Double, radius: Double): LatLonNvectorSpherical = js.native
  def distanceTo(point: LatLonNvectorSpherical): Double = js.native
  def distanceTo(point: LatLonNvectorSpherical, radius: Double): Double = js.native
  def equals(point: LatLonNvectorSpherical): Boolean = js.native
  def finalBearingTo(point: LatLonNvectorSpherical): Double = js.native
  def greatCircle(bearing: Double): typingsSlinky.geodesy.vector3dMod.default = js.native
  def initialBearingTo(point: LatLonNvectorSpherical): Double = js.native
  def intermediatePointTo(point: LatLonNvectorSpherical, fraction: Double): LatLonNvectorSpherical = js.native
  def isEnclosedBy(polygon: Polygon[LatLonNvectorSpherical]): Boolean = js.native
  def isWithinExtent(point1: LatLonNvectorSpherical, point2: LatLonNvectorSpherical): Boolean = js.native
  def lat: Double = js.native
  def lat(lat: Double): js.Any = js.native
  def latitude: Double = js.native
  def latitude(lat: Double): js.Any = js.native
  def lng: Double = js.native
  def lng(lon: Double): js.Any = js.native
  def lon: Double = js.native
  def lon(lon: Double): js.Any = js.native
  def longitude: Double = js.native
  def longitude(lon: Double): js.Any = js.native
  def midpointTo(point: LatLonNvectorSpherical): LatLonNvectorSpherical = js.native
  def nearestPointOnSegment(point1: LatLonNvectorSpherical, point2: LatLonNvectorSpherical): LatLonNvectorSpherical = js.native
  def toGeoJSON(): GeoJSON = js.native
  def toNvector(): NvectorSpherical = js.native
  def toString(format: Format): String = js.native
  def toString(format: Format, dp: Dp): String = js.native
}

