package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Line2D")
@js.native
class Line2D protected ()
  extends typingsSlinky.openjscad.CSG.Line2D {
  def this(normal: typingsSlinky.openjscad.CSG.Vector2D, w: Double) = this()
}

/* static members */
@JSGlobal("CSG.Line2D")
@js.native
object Line2D extends js.Object {
  def fromPoints(p1: typingsSlinky.openjscad.CSG.Vector2D, p2: typingsSlinky.openjscad.CSG.Vector2D): typingsSlinky.openjscad.CSG.Line2D = js.native
}

