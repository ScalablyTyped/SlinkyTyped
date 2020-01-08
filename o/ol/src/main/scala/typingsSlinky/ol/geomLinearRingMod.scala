package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/LinearRing", JSImport.Namespace)
@js.native
object geomLinearRingMod extends js.Object {
  @js.native
  trait LinearRing
    extends typingsSlinky.ol.geomSimpleGeometryMod.default {
    def getArea(): Double = js.native
  }
  
  @js.native
  class default protected () extends LinearRing {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
}

