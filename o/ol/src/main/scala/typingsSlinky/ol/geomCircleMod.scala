package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.geomGeometryLayoutMod.GeometryLayout
import typingsSlinky.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Circle", JSImport.Namespace)
@js.native
object geomCircleMod extends js.Object {
  @js.native
  trait Circle
    extends typingsSlinky.ol.geomSimpleGeometryMod.default {
    def getCenter(): Coordinate = js.native
    def getRadius(): Double = js.native
    def setCenter(center: Coordinate): Unit = js.native
    def setCenterAndRadius(center: Coordinate, radius: Double): Unit = js.native
    def setCenterAndRadius(center: Coordinate, radius: Double, opt_layout: GeometryLayout): Unit = js.native
    def setRadius(radius: Double): Unit = js.native
    @JSName("transform")
    def transform_default(source: ProjectionLike, destination: ProjectionLike): typingsSlinky.ol.geomGeometryMod.default = js.native
  }
  
  @js.native
  class default protected () extends Circle {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
  }
  
}

