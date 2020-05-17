package typingsSlinky.geodesy.latlonNvectorSphericalMod

import typingsSlinky.geodesy.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geodesy/latlon-nvector-spherical", "default")
@js.native
class default protected () extends LatLonNvectorSpherical {
  def this(lat: Double, lon: Double) = this()
}

/* static members */
@JSImport("geodesy/latlon-nvector-spherical", "default")
@js.native
object default extends js.Object {
  def areaOf(polygon: Polygon[LatLonNvectorSpherical]): Double = js.native
  def areaOf(polygon: Polygon[LatLonNvectorSpherical], radius: Double): Double = js.native
  def intersection(
    path1start: LatLonNvectorSpherical,
    path1brngEnd: PathBrngEnd,
    path2start: LatLonNvectorSpherical,
    path2brngEnd: PathBrngEnd
  ): LatLonNvectorSpherical = js.native
  def meanOf(points: Polygon[LatLonNvectorSpherical]): LatLonNvectorSpherical = js.native
  def metresToKm: Double = js.native
  def metresToMiles: Double = js.native
  def metresToNauticalMiles: Double = js.native
  def triangulate(point1: LatLonNvectorSpherical, bearing1: Double, point2: LatLonNvectorSpherical, bearing2: Double): LatLonNvectorSpherical = js.native
  def trilaterate(
    point1: LatLonNvectorSpherical,
    distance1: Double,
    point2: LatLonNvectorSpherical,
    distance2: Double,
    point3: LatLonNvectorSpherical,
    distance3: Double
  ): LatLonNvectorSpherical = js.native
  def trilaterate(
    point1: LatLonNvectorSpherical,
    distance1: Double,
    point2: LatLonNvectorSpherical,
    distance2: Double,
    point3: LatLonNvectorSpherical,
    distance3: Double,
    radius: Double
  ): LatLonNvectorSpherical = js.native
}

