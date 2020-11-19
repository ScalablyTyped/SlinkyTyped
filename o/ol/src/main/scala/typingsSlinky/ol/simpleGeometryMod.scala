package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.geometryLayoutMod.GeometryLayout
import typingsSlinky.ol.olMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/geom/SimpleGeometry", JSImport.Namespace)
@js.native
object simpleGeometryMod extends js.Object {
  
  def getStrideForLayout(layout: GeometryLayout): Double = js.native
  
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform): js.Array[Double] = js.native
  def transformGeom2D(simpleGeometry: SimpleGeometry, transform: Transform, opt_dest: js.Array[Double]): js.Array[Double] = js.native
  
  @js.native
  trait SimpleGeometry
    extends typingsSlinky.ol.geometryMod.default {
    
    var flatCoordinates: js.Array[Double] = js.native
    
    def getCoordinates(): js.Array[_] = js.native
    
    def getFirstCoordinate(): Coordinate = js.native
    
    def getFlatCoordinates(): js.Array[Double] = js.native
    
    def getLastCoordinate(): Coordinate = js.native
    
    def getLayout(): GeometryLayout = js.native
    
    /* protected */ def getSimplifiedGeometryInternal(squaredTolerance: Double): SimpleGeometry = js.native
    
    def getStride(): Double = js.native
    
    var layout: GeometryLayout = js.native
    
    def setCoordinates(coordinates: js.Array[_]): Unit = js.native
    def setCoordinates(coordinates: js.Array[_], opt_layout: GeometryLayout): Unit = js.native
    
    def setFlatCoordinates(layout: GeometryLayout, flatCoordinates: js.Array[Double]): Unit = js.native
    
    /* protected */ def setLayout(layout: js.UndefOr[scala.Nothing], coordinates: js.Array[_], nesting: Double): Unit = js.native
    /* protected */ def setLayout(layout: GeometryLayout, coordinates: js.Array[_], nesting: Double): Unit = js.native
    
    var stride: Double = js.native
  }
  
  @js.native
  abstract class default () extends SimpleGeometry
}
