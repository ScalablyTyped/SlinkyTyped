package typingsSlinky.heremaps.global.H

import typingsSlinky.heremaps.H.geo.Altitude
import typingsSlinky.heremaps.H.geo.AltitudeContext
import typingsSlinky.heremaps.H.geo.IPoint
import typingsSlinky.heremaps.H.geo.IProjection
import typingsSlinky.heremaps.H.geo.Latitude
import typingsSlinky.heremaps.H.geo.Longitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** geo *****/
object geo {
  
  /**
    * The base class for all geometry types.
    */
  @JSGlobal("H.geo.AbstractGeometry")
  @js.native
  class AbstractGeometry ()
    extends typingsSlinky.heremaps.H.geo.AbstractGeometry
  
  /**
    * Contexts for altitudes to specify the contextual origin of an altitude's value
    */
  @JSGlobal("H.geo.AltitudeContext")
  @js.native
  object AltitudeContext extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.heremaps.H.geo.AltitudeContext with Double] = js.native
    
    /* 1 */ val GL: typingsSlinky.heremaps.H.geo.AltitudeContext.GL with Double = js.native
    
    /* 2 */ val OL: typingsSlinky.heremaps.H.geo.AltitudeContext.OL with Double = js.native
    
    /* 4 */ val SB: typingsSlinky.heremaps.H.geo.AltitudeContext.SB with Double = js.native
    
    /* 3 */ val SL: typingsSlinky.heremaps.H.geo.AltitudeContext.SL with Double = js.native
    
    /* 5 */ val WE: typingsSlinky.heremaps.H.geo.AltitudeContext.WE with Double = js.native
    
    /* 6 */ val WG: typingsSlinky.heremaps.H.geo.AltitudeContext.WG with Double = js.native
    
    /* 0 */ val undefined: typingsSlinky.heremaps.H.geo.AltitudeContext.undefined with Double = js.native
  }
  
  @JSGlobal("H.geo.LineString")
  @js.native
  /**
    * Constructor
    * @param opt_latLngAlts {number[]=} - An optional array of latitude, longitude and altitude triples to initialize the LineString with.
    * @param opt_ctx {H.geo.AltitudeContext=} - An optional altitude context for all altitudes contained in this LineString.
    * @throws {H.lang.InvalidArgumentError} - in case of invalid lat, lng, alt values
    */
  class LineString ()
    extends typingsSlinky.heremaps.H.geo.LineString {
    def this(opt_latLngAlts: js.Array[Double]) = this()
    def this(opt_latLngAlts: js.UndefOr[scala.Nothing], opt_ctx: AltitudeContext) = this()
    def this(opt_latLngAlts: js.Array[Double], opt_ctx: AltitudeContext) = this()
  }
  object LineString {
    
    /**
      * This method initializes a new LineString with an array of lat, lng values. Arrays are expected to have an even length with the format [lat, lng, lat, lng, ...].
      * @param latLngs {number[]} - the array of lat, lng value.
      * @return {H.geo.LineString} - The LineString containing the lat, lng values
      * @throws {H.lang.InvalidArgumentError} - throws an error in case the latLngs array has an odd length
      */
    /* static member */
    @JSGlobal("H.geo.LineString.fromLatLngArray")
    @js.native
    def fromLatLngArray(latLngs: js.Array[Double]): typingsSlinky.heremaps.H.geo.LineString = js.native
    
    /**
      * To obtain whether a leg (formed by the given two longitudes) crosses the International Date Line.
      * @param lng1 {H.geo.Longitude} - The start longitude of the leg
      * @param lng2 {H.geo.Longitude} - The end longitude of the leg
      * @return {boolean}
      */
    /* static member */
    @JSGlobal("H.geo.LineString.isDBC")
    @js.native
    def isDBC(lng1: Longitude, lng2: Longitude): Boolean = js.native
  }
  
  @JSGlobal("H.geo.MultiGeometry")
  @js.native
  class MultiGeometry[T] protected ()
    extends typingsSlinky.heremaps.H.geo.MultiGeometry[T] {
    /**
      * The base class for a geometry that is a container for multiple geometries of a generic type. The type of the contained geometries is specified by the generic type parameter T
      * @param geometries {T[]} - The list of geometries which are initially aggregated.
      * @throws {H.lang.InvalidArgumentError} - if geometries parameter is not valid
      */
    def this(geometries: js.Array[T]) = this()
  }
  
  @JSGlobal("H.geo.MultiLineString")
  @js.native
  class MultiLineString protected ()
    extends typingsSlinky.heremaps.H.geo.MultiLineString {
    /**
      * A MultiLineString is a collection of line strings represented as a H.geo.MultiGeometry with a H.geo.LineString as generic type parameter T.
      * @param lineStrings {H.geo.LineString[]} - The list of line-strings which are initially represented by the MultiLineString.
      * @throws {H.lang.InvalidArgumentError} - if the lineStrings argument is not valid
      */
    def this(lineStrings: js.Array[typingsSlinky.heremaps.H.geo.LineString]) = this()
  }
  
  @JSGlobal("H.geo.MultiPoint")
  @js.native
  class MultiPoint ()
    extends typingsSlinky.heremaps.H.geo.MultiGeometry[typingsSlinky.heremaps.H.geo.Point]
  
  @JSGlobal("H.geo.MultiPolygon")
  @js.native
  class MultiPolygon ()
    extends typingsSlinky.heremaps.H.geo.MultiGeometry[typingsSlinky.heremaps.H.geo.Polygon]
  
  /**
    * PixelProjection transforms pixel world coordinates at a certain scale (zoom level) to geographical coordinates and vice versa.
    * By default, it uses the Mercator projection to transform geographic points into the 2d plane map points, which are adjusted to the current scale.
    * @property projection {H.geo.IProjection} - This property indicates the geographical projection that underlies the given PixelProjection.
    * @property x {number} - This property holds the x-offset in the projection relative to the top-left corner of the screen.
    * @property y {number} - This property holds the y-offset in the projection relative to the top-left corner of the screen.
    * @property w {number} - This property holds a value indicating the width of the world in pixels.
    * @property h {number} - This property holds a value indicating the height of the world in pixels.
    */
  @JSGlobal("H.geo.PixelProjection")
  @js.native
  /**
    * Constructor
    * @param opt_projection {H.geo.IProjection=} - An object representing the projection to use, the default is spherical Mercator H.geo.mercator
    * @param opt_sizeAtLevelZero {number=} A value indicating the size of a tile representation of the world in pixels at zoom level 0, the default is 256
    */
  class PixelProjection ()
    extends typingsSlinky.heremaps.H.geo.PixelProjection {
    def this(opt_projection: IProjection) = this()
    def this(opt_projection: js.UndefOr[scala.Nothing], opt_sizeAtLevelZero: Double) = this()
    def this(opt_projection: IProjection, opt_sizeAtLevelZero: Double) = this()
  }
  
  /**
    * Class represents a geographical point, which is defined by the latitude, longitude and optional altitude.
    * @property lat {H.geo.Latitude} - The latitude coordinate.
    * @property lng {H.geo.Longitude} - The longitude coordinate.
    * @property alt {H.geo.Altitude} - The altitude coordinate.
    * @property ctx {H.geo.AltitudeContext} - The altitude context.
    */
  @JSGlobal("H.geo.Point")
  @js.native
  class Point protected ()
    extends typingsSlinky.heremaps.H.geo.Point {
    /**
      * Constructor
      * @property lat {H.geo.Latitude} - The latitude coordinate.
      * @property lng {H.geo.Longitude} - The longitude coordinate.
      * @property opt_alt {H.geo.Altitude=} - The altitude coordinate.
      * @property opt_ctx {H.geo.AltitudeContext=} - The altitude context.
      */
    def this(lat: Latitude, lng: Longitude) = this()
    def this(lat: Latitude, lng: Longitude, opt_alt: Altitude) = this()
    def this(lat: Latitude, lng: Longitude, opt_alt: js.UndefOr[scala.Nothing], opt_ctx: AltitudeContext) = this()
    def this(lat: Latitude, lng: Longitude, opt_alt: Altitude, opt_ctx: AltitudeContext) = this()
  }
  object Point {
    
    /**
      * This method creates a Point instance from a given IPoint object.
      * @param iPoint {H.geo.IPoint} - The IPoint object to use
      * @returns {H.geo.Point} - the created Point instance
      */
    /* static member */
    @JSGlobal("H.geo.Point.fromIPoint")
    @js.native
    def fromIPoint(iPoint: IPoint): typingsSlinky.heremaps.H.geo.Point = js.native
    
    /**
      * This method validates the given IPoint. It checks, if lat, lng, alt and ctx have valid types. Additionally the value of the lat property is clamped into a range of -90 ... +90
      * and the value of the lng property is modulo into a range of -180 ... +180 plus validates the values of the alt and ctx properties
      * @param point {H.geo.IPoint} - The point to validate
      * @param opt_caller {Function=} - The caller to use for InvalidArgumentError. If omitted no error is thrown
      * @param opt_argNr {number=} - The argument number to use for InvalidArgumentError.
      * @returns {boolean} - if the given point could validate
      */
    /* static member */
    @JSGlobal("H.geo.Point.validate")
    @js.native
    def validate(point: IPoint): Boolean = js.native
    @JSGlobal("H.geo.Point.validate")
    @js.native
    def validate(point: IPoint, opt_caller: js.UndefOr[scala.Nothing], opt_argNr: Double): Boolean = js.native
    @JSGlobal("H.geo.Point.validate")
    @js.native
    def validate(point: IPoint, opt_caller: js.Function0[Unit]): Boolean = js.native
    @JSGlobal("H.geo.Point.validate")
    @js.native
    def validate(point: IPoint, opt_caller: js.Function0[Unit], opt_argNr: Double): Boolean = js.native
  }
  
  /**
    * @link https://developer.here.com/documentation/maps/api_reference/H.geo.Polygon.html
    */
  @JSGlobal("H.geo.Polygon")
  @js.native
  class Polygon protected ()
    extends typingsSlinky.heremaps.H.geo.Polygon {
    def this(exterior: typingsSlinky.heremaps.H.geo.LineString) = this()
    def this(
      exterior: typingsSlinky.heremaps.H.geo.LineString,
      opt_interiors: js.Array[typingsSlinky.heremaps.H.geo.LineString]
    ) = this()
  }
  
  /**
    * This class represents a rectangular geographic area. The area is defined by four geographical coordinates two (left, right) longitudes and two (top, bottom) latitudes.
    */
  @JSGlobal("H.geo.Rect")
  @js.native
  class Rect protected ()
    extends typingsSlinky.heremaps.H.geo.Rect {
    /**
      * Constructor
      * @param top {H.geo.Latitude} - the northern-most latitude
      * @param left {H.geo.Longitude} - the left-most longitude
      * @param bottom {H.geo.Latitude} - the southern-most latitude
      * @param right {H.geo.Longitude} - the right-most latitude
      */
    def this(top: Latitude, left: Longitude, bottom: Latitude, right: Longitude) = this()
  }
  object Rect {
    
    /**
      * This method creates the minimum rectangular area covering all of the coordinates in the argument array.
      * @param latLngAltArray {Array<number>} - the array of coordinates to cover
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {(H.geo.Rect | undefined)} - returns the minimum rectangular area covering the coordinates
      */
    /* static member */
    @JSGlobal("H.geo.Rect.coverLatLngAlts")
    @js.native
    def coverLatLngAlts(latLngAltArray: js.Array[Double]): typingsSlinky.heremaps.H.geo.Rect | Unit = js.native
    @JSGlobal("H.geo.Rect.coverLatLngAlts")
    @js.native
    def coverLatLngAlts(latLngAltArray: js.Array[Double], opt_skipValidation: Boolean): typingsSlinky.heremaps.H.geo.Rect | Unit = js.native
    
    /**
      * This method creates the minimum rectangular area covering all of the points in the argument array.
      * @param pointArray {Array<H.geo.IPoint>} - the array of points to cover
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {H.geo.Rect} - returns the minimum rectangular area covering the points or null if no point is covered
      */
    /* static member */
    @JSGlobal("H.geo.Rect.coverPoints")
    @js.native
    def coverPoints(pointArray: js.Array[IPoint]): typingsSlinky.heremaps.H.geo.Rect = js.native
    @JSGlobal("H.geo.Rect.coverPoints")
    @js.native
    def coverPoints(pointArray: js.Array[IPoint], opt_skipValidation: Boolean): typingsSlinky.heremaps.H.geo.Rect = js.native
    
    /**
      * This method creates the minimum rectangular area covering all of the rectangular areas in the argument array.
      * @param rectArray {Array<H.geo.Rect>} - the array of points to cover
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {(H.geo.Rect | undefined)} - returns the minimum rectangular area covering the rectangular areas
      */
    /* static member */
    @JSGlobal("H.geo.Rect.coverRects")
    @js.native
    def coverRects(rectArray: js.Array[typingsSlinky.heremaps.H.geo.Rect]): typingsSlinky.heremaps.H.geo.Rect | Unit = js.native
    @JSGlobal("H.geo.Rect.coverRects")
    @js.native
    def coverRects(rectArray: js.Array[typingsSlinky.heremaps.H.geo.Rect], opt_skipValidation: Boolean): typingsSlinky.heremaps.H.geo.Rect | Unit = js.native
    
    /**
      * This method creates a rectangular area from a top-left and bottom-right point pair.
      * @param topLeft {H.geo.IPoint} - the top-left corner of the area
      * @param bottomRight {H.geo.IPoint} - the bottom-right corner of the area
      * @param opt_skipValidation {boolean=} - a boolean flag indicating whether to check validity of the arguments
      * @returns {H.geo.Rect} - returns the rectangular area defined by the top-left and bottom-right corners
      */
    /* static member */
    @JSGlobal("H.geo.Rect.fromPoints")
    @js.native
    def fromPoints(topLeft: IPoint, bottomRight: IPoint): typingsSlinky.heremaps.H.geo.Rect = js.native
    @JSGlobal("H.geo.Rect.fromPoints")
    @js.native
    def fromPoints(topLeft: IPoint, bottomRight: IPoint, opt_skipValidation: Boolean): typingsSlinky.heremaps.H.geo.Rect = js.native
    
    /**
      * This method merges two rects by their values. The result of the merge is a bounding rect which covers all provided rect bounds.
      * @param topA {H.geo.Latitude} - the northern-most latitude
      * @param leftA {H.geo.Longitude} - the left-most longitude of operand A
      * @param bottomA {H.geo.Latitude} - the southern-most latitude of operand A
      * @param rightA {H.geo.Longitude} - the right-most latitude of operand A
      * @param topB {H.geo.Latitude} - the northern-most latitude of operand B
      * @param leftB {H.geo.Longitude} - the left-most longitude of operand B
      * @param bottomB {H.geo.Latitude} - the southern-most latitude of operand B
      * @param rightB {H.geo.Longitude} - the right-most latitude of operand B
      * @param opt_out {H.geo.Rect=} - an optional rect to store the results
      * @returns {H.geo.Rect} - either the opt_out rect or a new rect
      */
    /* static member */
    @JSGlobal("H.geo.Rect.merge")
    @js.native
    def merge(
      topA: Latitude,
      leftA: Longitude,
      bottomA: Latitude,
      rightA: Longitude,
      topB: Latitude,
      leftB: Longitude,
      bottomB: Latitude,
      rightB: Longitude
    ): typingsSlinky.heremaps.H.geo.Rect = js.native
    @JSGlobal("H.geo.Rect.merge")
    @js.native
    def merge(
      topA: Latitude,
      leftA: Longitude,
      bottomA: Latitude,
      rightA: Longitude,
      topB: Latitude,
      leftB: Longitude,
      bottomB: Latitude,
      rightB: Longitude,
      opt_out: typingsSlinky.heremaps.H.geo.Rect
    ): typingsSlinky.heremaps.H.geo.Rect = js.native
  }
}
