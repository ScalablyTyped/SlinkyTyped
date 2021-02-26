package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiPointMod {
  
  @JSImport("ol/geom/MultiPoint", JSImport.Default)
  @js.native
  class default protected () extends MultiPoint {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  trait MultiPoint
    extends typingsSlinky.ol.simpleGeometryMod.default {
    
    /**
      * Append the passed point to this multipoint.
      */
    def appendPoint(point: typingsSlinky.ol.pointMod.default): Unit = js.native
    
    /**
      * Return the point at the specified index.
      */
    def getPoint(index: Double): typingsSlinky.ol.pointMod.default = js.native
    
    /**
      * Return the points of this multipoint.
      */
    def getPoints(): js.Array[typingsSlinky.ol.pointMod.default] = js.native
  }
}
