package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.IPolygonOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPolylineOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPrimitive
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits
import typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This module provides a bunch of useful spatial math calculations.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
@JSGlobal("Microsoft.Maps.SpatialMath")
@js.native
object SpatialMath extends js.Object {
  def convertArea(area: Double, fromUnits: AreaUnits, toUnits: AreaUnits): Double = js.native
  def convertDistance(distance: Double, fromUnits: DistanceUnits, toUnits: DistanceUnits): Double = js.native
  def getCardinalSpline(locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location]): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    tension: js.UndefOr[scala.Nothing],
    nodeSize: js.UndefOr[scala.Nothing],
    close: Boolean
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    tension: js.UndefOr[scala.Nothing],
    nodeSize: Double
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    tension: js.UndefOr[scala.Nothing],
    nodeSize: Double,
    close: Boolean
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getCardinalSpline(locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location], tension: Double): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    tension: Double,
    nodeSize: js.UndefOr[scala.Nothing],
    close: Boolean
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    tension: Double,
    nodeSize: Double
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getCardinalSpline(
    locations: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    tension: Double,
    nodeSize: Double,
    close: Boolean
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getDestination(origin: typingsSlinky.bingmaps.Microsoft.Maps.Location, bearing: Double, distance: Double): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def getDestination(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    bearing: Double,
    distance: Double,
    units: DistanceUnits
  ): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def getDistanceTo(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    destination: typingsSlinky.bingmaps.Microsoft.Maps.Location
  ): Double = js.native
  def getDistanceTo(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    destination: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    units: js.UndefOr[scala.Nothing],
    highAccuracy: Boolean
  ): Double = js.native
  def getDistanceTo(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    destination: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    units: DistanceUnits
  ): Double = js.native
  def getDistanceTo(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    destination: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = js.native
  def getEarthRadius(): Double = js.native
  def getEarthRadius(units: DistanceUnits): Double = js.native
  def getGeodesicPath(path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location]): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getGeodesicPath(path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location], nodeSize: Double): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getHeading(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    destination: typingsSlinky.bingmaps.Microsoft.Maps.Location
  ): Double = js.native
  def getLengthOfPath(path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location]): Double = js.native
  def getLengthOfPath(
    path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    units: js.UndefOr[scala.Nothing],
    highAccuracy: Boolean
  ): Double = js.native
  def getLengthOfPath(path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location], units: DistanceUnits): Double = js.native
  def getLengthOfPath(
    path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    units: DistanceUnits,
    highAccuracy: Boolean
  ): Double = js.native
  def getLocationAlongPath(path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location], distance: Double): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def getLocationAlongPath(
    path: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
    distance: Double,
    units: DistanceUnits
  ): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def getLocationAlongPath(path: typingsSlinky.bingmaps.Microsoft.Maps.Polyline, distance: Double): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def getLocationAlongPath(path: typingsSlinky.bingmaps.Microsoft.Maps.Polyline, distance: Double, units: DistanceUnits): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def getRegularPolygon(origin: typingsSlinky.bingmaps.Microsoft.Maps.Location, radius: Double, numberOfPoints: Double): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getRegularPolygon(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    radius: Double,
    numberOfPoints: Double,
    units: js.UndefOr[scala.Nothing],
    offset: Double
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getRegularPolygon(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    radius: Double,
    numberOfPoints: Double,
    units: DistanceUnits
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getRegularPolygon(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    radius: Double,
    numberOfPoints: Double,
    units: DistanceUnits,
    offset: Double
  ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def interpolate(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    destination: typingsSlinky.bingmaps.Microsoft.Maps.Location
  ): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def interpolate(
    origin: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    destination: typingsSlinky.bingmaps.Microsoft.Maps.Location,
    fraction: Double
  ): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  def locationRectToPolygon(bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect): typingsSlinky.bingmaps.Microsoft.Maps.Polygon = js.native
  def toDegMinSec(loc: typingsSlinky.bingmaps.Microsoft.Maps.Location): String = js.native
  def tryParseDegMinSec(input: String): Double | typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
  @js.native
  object AreaUnits extends js.Object {
    /* 5 */ val Acres: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Acres with Double = js.native
    /* 6 */ val Hectares: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.Hectares with Double = js.native
    /* 3 */ val SquareFeet: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareFeet with Double = js.native
    /* 1 */ val SquareKilometers: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareKilometers with Double = js.native
    /* 0 */ val SquareMeters: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMeters with Double = js.native
    /* 2 */ val SquareMiles: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareMiles with Double = js.native
    /* 4 */ val SquareYards: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits.SquareYards with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.AreaUnits with Double] = js.native
  }
  
  @js.native
  object DistanceUnits extends js.Object {
    /* 3 */ val Feet: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Feet with Double = js.native
    /* 1 */ val Kilometers: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Kilometers with Double = js.native
    /* 0 */ val Meters: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Meters with Double = js.native
    /* 2 */ val Miles: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Miles with Double = js.native
    /* 5 */ val NauticalMiles: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.NauticalMiles with Double = js.native
    /* 4 */ val Yards: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits.Yards with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits with Double] = js.native
  }
  
  //////////////////////////////////////////////
  /// Geometry Calculations
  //////////////////////////////////////////////
  /**
  * A colleciton of geometry calculations that can be performed against Bing Maps shapes.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
  @js.native
  object Geometry extends js.Object {
    def area(shape: js.Array[IPrimitive]): Double = js.native
    def area(shape: js.Array[IPrimitive], areaUnits: AreaUnits): Double = js.native
    def area(shape: IPrimitive): Double = js.native
    def area(shape: IPrimitive, areaUnits: AreaUnits): Double = js.native
    def bounds(shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): typingsSlinky.bingmaps.Microsoft.Maps.LocationRect = js.native
    def bounds(shapes: IPrimitive): typingsSlinky.bingmaps.Microsoft.Maps.LocationRect = js.native
    def bounds(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location): typingsSlinky.bingmaps.Microsoft.Maps.LocationRect = js.native
    def buffer(shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive], distance: Double): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits,
      endCapType: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(shape: IPrimitive, distance: Double): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: IPrimitive,
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(shape: IPrimitive, distance: Double, units: js.UndefOr[scala.Nothing], endCapType: BufferEndCap): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: IPrimitive,
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(shape: IPrimitive, distance: Double, units: DistanceUnits): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: IPrimitive,
      distance: Double,
      units: DistanceUnits,
      endCapType: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(shape: IPrimitive, distance: Double, units: DistanceUnits, endCapType: BufferEndCap): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: IPrimitive,
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(shape: typingsSlinky.bingmaps.Microsoft.Maps.Location, distance: Double): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: js.UndefOr[scala.Nothing],
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(shape: typingsSlinky.bingmaps.Microsoft.Maps.Location, distance: Double, units: DistanceUnits): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: DistanceUnits,
      endCapType: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def buffer(
      shape: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      distance: Double,
      units: DistanceUnits,
      endCapType: BufferEndCap,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def calculateLength(shape: js.Array[IPrimitive]): Double = js.native
    def calculateLength(shape: js.Array[IPrimitive], units: js.UndefOr[scala.Nothing], highAccuracy: Boolean): Double = js.native
    def calculateLength(shape: js.Array[IPrimitive], units: DistanceUnits): Double = js.native
    def calculateLength(shape: js.Array[IPrimitive], units: DistanceUnits, highAccuracy: Boolean): Double = js.native
    def calculateLength(shape: IPrimitive): Double = js.native
    def calculateLength(shape: IPrimitive, units: js.UndefOr[scala.Nothing], highAccuracy: Boolean): Double = js.native
    def calculateLength(shape: IPrimitive, units: DistanceUnits): Double = js.native
    def calculateLength(shape: IPrimitive, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
    def centroid(shape: js.Array[IPrimitive]): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
    def centroid(shape: IPrimitive): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
    def concaveHull(shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: Boolean
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean,
      allowHoles: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean,
      allowHoles: Boolean
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      allowMultiPolygons: Boolean,
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(shapes: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: IPrimitive,
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(shapes: IPrimitive, allowMultiPolygons: js.UndefOr[scala.Nothing], allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: IPrimitive,
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: IPrimitive,
      allowMultiPolygons: Boolean,
      allowHoles: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean, allowHoles: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(shapes: IPrimitive, allowMultiPolygons: Boolean, allowHoles: Boolean, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: Boolean
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: js.UndefOr[scala.Nothing],
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location, allowMultiPolygons: Boolean): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: Boolean,
      allowHoles: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: Boolean,
      allowHoles: Boolean
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def concaveHull(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      allowMultiPolygons: Boolean,
      allowHoles: Boolean,
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def contains(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = js.native
    def contains(shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): Boolean = js.native
    def contains(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): Boolean = js.native
    def contains(shapeA: IPrimitive, shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): Boolean = js.native
    def contains(shapeA: IPrimitive, shapeB: IPrimitive): Boolean = js.native
    def contains(shapeA: IPrimitive, shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location): Boolean = js.native
    def contains(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = js.native
    def contains(shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): Boolean = js.native
    def contains(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): Boolean = js.native
    def convexHull(shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def convexHull(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolygonOptions
    ): IPrimitive | js.Array[IPrimitive] = js.native
    def convexHull(shapes: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def convexHull(shapes: IPrimitive, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
    def convexHull(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location): IPrimitive | js.Array[IPrimitive] = js.native
    def convexHull(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location, options: IPolygonOptions): IPrimitive | js.Array[IPrimitive] = js.native
    def delaunayTriangles(shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def delaunayTriangles(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def delaunayTriangles(shapes: IPrimitive): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def delaunayTriangles(shapes: IPrimitive, options: IPolygonOptions): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def delaunayTriangles(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def delaunayTriangles(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location, options: IPolygonOptions): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def difference(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def difference(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def difference(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def difference(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def distance(shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      units: DistanceUnits
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits
    ): Double = js.native
    def distance(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def distance(shapeA: IPrimitive, shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): Double = js.native
    def distance(
      shapeA: IPrimitive,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: IPrimitive,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits
    ): Double = js.native
    def distance(
      shapeA: IPrimitive,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def distance(shapeA: IPrimitive, shapeB: IPrimitive): Double = js.native
    def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: js.UndefOr[scala.Nothing], highAccuracy: Boolean): Double = js.native
    def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: DistanceUnits): Double = js.native
    def distance(shapeA: IPrimitive, shapeB: IPrimitive, units: DistanceUnits, highAccuracy: Boolean): Double = js.native
    def distance(shapeA: IPrimitive, shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location): Double = js.native
    def distance(
      shapeA: IPrimitive,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(shapeA: IPrimitive, shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location, units: DistanceUnits): Double = js.native
    def distance(
      shapeA: IPrimitive,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def distance(shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: IPrimitive,
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive, units: DistanceUnits): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: IPrimitive,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: js.UndefOr[scala.Nothing],
      highAccuracy: Boolean
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits
    ): Double = js.native
    def distance(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      units: DistanceUnits,
      highAccuracy: Boolean
    ): Double = js.native
    def intersection(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def intersection(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def intersection(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def intersection(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def intersects(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = js.native
    def intersects(shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): Boolean = js.native
    def intersects(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): Boolean = js.native
    def intersects(shapeA: IPrimitive, shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): Boolean = js.native
    def intersects(shapeA: IPrimitive, shapeB: IPrimitive): Boolean = js.native
    def intersects(shapeA: IPrimitive, shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location): Boolean = js.native
    def intersects(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): Boolean = js.native
    def intersects(shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): Boolean = js.native
    def intersects(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): Boolean = js.native
    def isValid(shape: js.Array[IPrimitive]): Boolean = js.native
    def isValid(shape: IPrimitive): Boolean = js.native
    def makeValid(shape: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def makeValid(shape: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def nearestLocations(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(shapeA: IPrimitive, shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(shapeA: IPrimitive, shapeB: IPrimitive): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(shapeA: IPrimitive, shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def nearestLocations(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def reduce(shape: js.Array[IPrimitive], tolerance: Double): IPrimitive | js.Array[IPrimitive] = js.native
    def reduce(shape: IPrimitive, tolerance: Double): IPrimitive | js.Array[IPrimitive] = js.native
    def rotate(shape: js.Array[IPrimitive], angle: Double): Unit = js.native
    def rotate(shape: js.Array[IPrimitive], angle: Double, origin: typingsSlinky.bingmaps.Microsoft.Maps.Location): Unit = js.native
    def rotate(shape: IPrimitive, angle: Double): Unit = js.native
    def rotate(shape: IPrimitive, angle: Double, origin: typingsSlinky.bingmaps.Microsoft.Maps.Location): Unit = js.native
    def shortestLineTo(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive], shapeB: IPrimitive): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: IPrimitive,
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(shapeA: IPrimitive, shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: IPrimitive,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(shapeA: IPrimitive, shapeB: IPrimitive): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(shapeA: IPrimitive, shapeB: IPrimitive, options: IPolylineOptions): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(shapeA: IPrimitive, shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: IPrimitive,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location, shapeB: IPrimitive): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: IPrimitive,
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def shortestLineTo(
      shapeA: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shapeB: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      options: IPolylineOptions
    ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline = js.native
    def snapLocationsToShape(locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location], shape: js.Array[IPrimitive]): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
      shape: js.Array[IPrimitive],
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
      shape: js.Array[IPrimitive],
      tolerance: Double
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location], shape: IPrimitive): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
      shape: IPrimitive,
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
      shape: IPrimitive,
      tolerance: Double
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location],
      shape: IPrimitive,
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(locs: typingsSlinky.bingmaps.Microsoft.Maps.Location, shape: js.Array[IPrimitive]): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shape: js.Array[IPrimitive],
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shape: js.Array[IPrimitive],
      tolerance: Double
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(locs: typingsSlinky.bingmaps.Microsoft.Maps.Location, shape: IPrimitive): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shape: IPrimitive,
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(locs: typingsSlinky.bingmaps.Microsoft.Maps.Location, shape: IPrimitive, tolerance: Double): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapLocationsToShape(
      locs: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      shape: IPrimitive,
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
    def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: js.Array[IPrimitive]): Unit = js.native
    def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: js.Array[IPrimitive],
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): Unit = js.native
    def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: js.Array[IPrimitive], tolerance: Double): Unit = js.native
    def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): Unit = js.native
    def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: IPrimitive): Unit = js.native
    def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: IPrimitive,
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): Unit = js.native
    def snapShapeToShape(shapeToSnap: js.Array[IPrimitive], shape: IPrimitive, tolerance: Double): Unit = js.native
    def snapShapeToShape(
      shapeToSnap: js.Array[IPrimitive],
      shape: IPrimitive,
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): Unit = js.native
    def snapShapeToShape(shapeToSnap: IPrimitive, shape: js.Array[IPrimitive]): Unit = js.native
    def snapShapeToShape(
      shapeToSnap: IPrimitive,
      shape: js.Array[IPrimitive],
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): Unit = js.native
    def snapShapeToShape(shapeToSnap: IPrimitive, shape: js.Array[IPrimitive], tolerance: Double): Unit = js.native
    def snapShapeToShape(
      shapeToSnap: IPrimitive,
      shape: js.Array[IPrimitive],
      tolerance: Double,
      toleranceUnits: DistanceUnits
    ): Unit = js.native
    def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive): Unit = js.native
    def snapShapeToShape(
      shapeToSnap: IPrimitive,
      shape: IPrimitive,
      tolerance: js.UndefOr[scala.Nothing],
      toleranceUnits: DistanceUnits
    ): Unit = js.native
    def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive, tolerance: Double): Unit = js.native
    def snapShapeToShape(shapeToSnap: IPrimitive, shape: IPrimitive, tolerance: Double, toleranceUnits: DistanceUnits): Unit = js.native
    def symDifference(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def symDifference(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def symDifference(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def symDifference(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def union(shapeA: js.Array[IPrimitive], shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def union(shapeA: js.Array[IPrimitive], shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def union(shapeA: IPrimitive, shapeB: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def union(shapeA: IPrimitive, shapeB: IPrimitive): IPrimitive | js.Array[IPrimitive] = js.native
    def unionAggregate(shapes: js.Array[IPrimitive]): IPrimitive | js.Array[IPrimitive] = js.native
    def voronoiDiagram(shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive]): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect,
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.Polygon
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location | IPrimitive],
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.Polygon,
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(shapes: IPrimitive): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(shapes: IPrimitive, clipRegion: js.UndefOr[scala.Nothing], options: IPolygonOptions): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(shapes: IPrimitive, clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: IPrimitive,
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect,
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(shapes: IPrimitive, clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.Polygon): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: IPrimitive,
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.Polygon,
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      clipRegion: js.UndefOr[scala.Nothing],
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect,
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.Polygon
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    def voronoiDiagram(
      shapes: typingsSlinky.bingmaps.Microsoft.Maps.Location,
      clipRegion: typingsSlinky.bingmaps.Microsoft.Maps.Polygon,
      options: IPolygonOptions
    ): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
    @js.native
    object BufferEndCap extends js.Object {
      /* 1 */ val Flat: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap.Flat with Double = js.native
      /* 0 */ val Round: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap.Round with Double = js.native
      /* 2 */ val Square: typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap.Square with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.Geometry.BufferEndCap with Double
          ] = js.native
    }
    
  }
  
  //////////////////////////////////////////////
  /// Tile Calculations
  //////////////////////////////////////////////
  /**
  * A colleciton of mathematical algorithms based on the tile pyramid used by Bign Maps.
  * @requires The Microsoft.Maps.SpatialMath module.
  */
  @js.native
  object Tiles extends js.Object {
    def getTilesInBounds(bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect, zoom: Double): js.Array[typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId] = js.native
    def globalPixelToLocation(point: typingsSlinky.bingmaps.Microsoft.Maps.Point, zoom: Double): typingsSlinky.bingmaps.Microsoft.Maps.Location = js.native
    def globalPixelToTile(pixel: typingsSlinky.bingmaps.Microsoft.Maps.Point, zoom: Double): typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId = js.native
    def groundResolution(latitude: Double, zoom: Double): Double = js.native
    def groundResolution(latitude: Double, zoom: Double, units: DistanceUnits): Double = js.native
    def locationToGlobalPixel(loc: typingsSlinky.bingmaps.Microsoft.Maps.Location, zoom: Double): typingsSlinky.bingmaps.Microsoft.Maps.Point = js.native
    def locationToTile(loc: typingsSlinky.bingmaps.Microsoft.Maps.Location, zoom: Double): typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId = js.native
    def mapSize(zoom: Double): Double = js.native
    def tileToGlobalPixel(tile: typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId): typingsSlinky.bingmaps.Microsoft.Maps.Point = js.native
    def tileToLocationRect(tile: typingsSlinky.bingmaps.Microsoft.Maps.PyramidTileId): typingsSlinky.bingmaps.Microsoft.Maps.LocationRect = js.native
  }
  
}

