package typingsSlinky.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.LineSegment")
@js.native
class LineSegment protected ()
  extends typingsSlinky.jsts.jsts.geom.LineSegment {
  def this(p0: typingsSlinky.jsts.jsts.geom.Coordinate, p1: typingsSlinky.jsts.jsts.geom.Coordinate) = this()
}

/* static members */
@JSImport("jsts", "geom.LineSegment")
@js.native
object LineSegment extends js.Object {
  /**
    * Computes the midpoint of a segment
    *
    * @param {jsts.geom.Coordinate} p0
    * @param {jsts.geom.Coordinate} p1
    * @return {jsts.geom.Coordinate} the midpoint of the segment
    */
  def midPoint(p0: typingsSlinky.jsts.jsts.geom.Coordinate, p1: typingsSlinky.jsts.jsts.geom.Coordinate): typingsSlinky.jsts.jsts.geom.Coordinate = js.native
}

