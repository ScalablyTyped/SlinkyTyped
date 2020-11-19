package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object drawMod {
  
  type GeometryFunction = js.Function3[
    /* p0 */ typingsSlinky.ol.drawMod.SketchCoordType, 
    /* p1 */ js.UndefOr[typingsSlinky.ol.simpleGeometryMod.default], 
    /* p2 */ js.UndefOr[typingsSlinky.ol.projectionMod.default], 
    typingsSlinky.ol.simpleGeometryMod.default
  ]
  
  type LineCoordType = js.Array[typingsSlinky.ol.coordinateMod.Coordinate]
  
  type PointCoordType = typingsSlinky.ol.coordinateMod.Coordinate
  
  type PolyCoordType = js.Array[js.Array[typingsSlinky.ol.coordinateMod.Coordinate]]
  
  type SketchCoordType = typingsSlinky.ol.drawMod.PointCoordType | typingsSlinky.ol.drawMod.LineCoordType | typingsSlinky.ol.drawMod.PolyCoordType
}
