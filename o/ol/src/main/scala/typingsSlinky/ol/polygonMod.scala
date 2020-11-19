package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/Polygon", JSImport.Namespace)
@js.native
object polygonMod extends js.Object {
  
  def circular(center: Coordinate, radius: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: js.UndefOr[scala.Nothing], opt_sphereRadius: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double, opt_sphereRadius: Double): Polygon = js.native
  
  def fromCircle(circle: typingsSlinky.ol.circleMod.default): Polygon = js.native
  def fromCircle(
    circle: typingsSlinky.ol.circleMod.default,
    opt_sides: js.UndefOr[scala.Nothing],
    opt_angle: Double
  ): Polygon = js.native
  def fromCircle(circle: typingsSlinky.ol.circleMod.default, opt_sides: Double): Polygon = js.native
  def fromCircle(circle: typingsSlinky.ol.circleMod.default, opt_sides: Double, opt_angle: Double): Polygon = js.native
  
  def fromExtent(extent: Extent): Polygon = js.native
  
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double): Unit = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double, opt_angle: Double): Unit = js.native
  
  @js.native
  trait Polygon
    extends typingsSlinky.ol.simpleGeometryMod.default {
    
    def appendLinearRing(linearRing: typingsSlinky.ol.linearRingMod.default): Unit = js.native
    
    def getArea(): Double = js.native
    
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[Coordinate]] = js.native
    
    def getEnds(): js.Array[Double] = js.native
    
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    
    def getInteriorPoint(): typingsSlinky.ol.pointMod.default = js.native
    
    def getLinearRing(index: Double): typingsSlinky.ol.linearRingMod.default = js.native
    
    def getLinearRingCount(): Double = js.native
    
    def getLinearRings(): js.Array[typingsSlinky.ol.linearRingMod.default] = js.native
    
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
  }
  
  @js.native
  class default protected () extends Polygon {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
}
