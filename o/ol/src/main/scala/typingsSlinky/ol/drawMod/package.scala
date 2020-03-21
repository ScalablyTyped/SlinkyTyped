package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object drawMod {
  type GeometryFunction = js.Function2[
    /* p0 */ typingsSlinky.ol.drawMod.SketchCoordType, 
    /* p1 */ js.UndefOr[typingsSlinky.ol.simpleGeometryMod.default], 
    typingsSlinky.ol.simpleGeometryMod.default
  ]
  type LineCoordType = js.Array[typingsSlinky.ol.coordinateMod.Coordinate]
  type PointCoordType = typingsSlinky.ol.coordinateMod.Coordinate
  type PolyCoordType = js.Array[js.Array[typingsSlinky.ol.coordinateMod.Coordinate]]
  type SketchCoordType = typingsSlinky.ol.drawMod.PointCoordType | typingsSlinky.ol.drawMod.LineCoordType | typingsSlinky.ol.drawMod.PolyCoordType
}
