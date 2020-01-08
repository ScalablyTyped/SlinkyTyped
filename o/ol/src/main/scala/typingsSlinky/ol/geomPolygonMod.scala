package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Polygon", JSImport.Namespace)
@js.native
object geomPolygonMod extends js.Object {
  @js.native
  trait Polygon
    extends typingsSlinky.ol.geomSimpleGeometryMod.default {
    def appendLinearRing(linearRing: typingsSlinky.ol.geomLinearRingMod.default): Unit = js.native
    def getArea(): Double = js.native
    def getEnds(): js.Array[Double] = js.native
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    def getInteriorPoint(): typingsSlinky.ol.geomPointMod.default = js.native
    def getLinearRing(index: Double): typingsSlinky.ol.geomLinearRingMod.default = js.native
    def getLinearRingCount(): Double = js.native
    def getLinearRings(): js.Array[typingsSlinky.ol.geomLinearRingMod.default] = js.native
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
  }
  
  @js.native
  class default protected () extends Polygon {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  def circular(center: Coordinate, radius: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double, opt_sphereRadius: Double): Polygon = js.native
  def fromCircle(circle: typingsSlinky.ol.geomCircleMod.default): Polygon = js.native
  def fromCircle(circle: typingsSlinky.ol.geomCircleMod.default, opt_sides: Double): Polygon = js.native
  def fromCircle(circle: typingsSlinky.ol.geomCircleMod.default, opt_sides: Double, opt_angle: Double): Polygon = js.native
  def fromExtent(extent: Extent): Polygon = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double): Unit = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double, opt_angle: Double): Unit = js.native
}

