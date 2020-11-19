package typingsSlinky.geodesy

import typingsSlinky.geodesy.dmsMod.Precision
import typingsSlinky.geodesy.mod.Dp
import typingsSlinky.geodesy.mod.Format
import typingsSlinky.geodesy.mod.GeoJSON
import typingsSlinky.geodesy.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geodesy/latlon-nvector-spherical", JSImport.Namespace)
@js.native
object latlonNvectorSphericalMod extends js.Object {
  
  // tslint:disable-next-line no-unnecessary-class
  @js.native
  class Dms ()
    extends typingsSlinky.geodesy.dmsMod.default
  /* static members */
  @js.native
  object Dms extends js.Object {
    
    def compassPoint(bearing: Double): String = js.native
    def compassPoint(bearing: Double, precision: Precision): String = js.native
    
    def fromLocale(str: String): String = js.native
    
    def parse(dms: String): Double = js.native
    def parse(dms: Double): Double = js.native
    
    def separator: String = js.native
    def separator_=(char: String): Unit = js.native
    
    def toBrng(deg: Double): String = js.native
    def toBrng(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toBrng(deg: Double, format: Format): String = js.native
    def toBrng(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toDms(deg: Double): String = js.native
    def toDms(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toDms(deg: Double, format: Format): String = js.native
    def toDms(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toLat(deg: Double): String = js.native
    def toLat(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toLat(deg: Double, format: Format): String = js.native
    def toLat(deg: Double, format: Format, dp: Dp): String = js.native
    
    def toLocale(str: String): String = js.native
    
    def toLon(deg: Double): String = js.native
    def toLon(deg: Double, format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toLon(deg: Double, format: Format): String = js.native
    def toLon(deg: Double, format: Format, dp: Dp): String = js.native
    
    def wrap360(degrees: Double): String = js.native
    
    def wrap90(degrees: Double): String = js.native
  }
  
  @js.native
  trait LatLonNvectorSpherical extends js.Object {
    
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
    def lat_=(lat: Double): Unit = js.native
    
    def latitude: Double = js.native
    def latitude_=(lat: Double): Unit = js.native
    
    def lng: Double = js.native
    def lng_=(lon: Double): Unit = js.native
    
    def lon: Double = js.native
    def lon_=(lon: Double): Unit = js.native
    
    def longitude: Double = js.native
    def longitude_=(lon: Double): Unit = js.native
    
    def midpointTo(point: LatLonNvectorSpherical): LatLonNvectorSpherical = js.native
    
    def nearestPointOnSegment(point1: LatLonNvectorSpherical, point2: LatLonNvectorSpherical): LatLonNvectorSpherical = js.native
    
    def toGeoJSON(): GeoJSON = js.native
    
    def toNvector(): NvectorSpherical = js.native
    
    def toString(format: js.UndefOr[scala.Nothing], dp: Dp): String = js.native
    def toString(format: Format): String = js.native
    def toString(format: Format, dp: Dp): String = js.native
  }
  
  @js.native
  class Nvector protected () extends NvectorSpherical {
    def this(x: Double, y: Double, z: Double) = this()
  }
  
  @js.native
  trait NvectorSpherical
    extends typingsSlinky.geodesy.vector3dMod.default {
    
    def greatCircle(bearing: Double): typingsSlinky.geodesy.vector3dMod.default = js.native
    
    def toLatLon(): LatLonNvectorSpherical = js.native
  }
  
  @js.native
  class default protected () extends LatLonNvectorSpherical {
    def this(lat: Double, lon: Double) = this()
  }
  /* static members */
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
  
  type PathBrngEnd = LatLonNvectorSpherical | Double
}
