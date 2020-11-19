package typingsSlinky.paper.global.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Curve object represents the parts of a path that are connected by
  * two following {@link Segment} objects. The curves of a path can be accessed
  * through its {@link Path#curves} array.
  * 
  * While a segment describe the anchor point and its incoming and outgoing
  * handles, a Curve object describes the curve passing between two such
  * segments. Curves and segments represent two different ways of looking at the
  * same thing, but focusing on different aspects. Curves for example offer many
  * convenient ways to work with parts of the path, finding lengths, positions or
  * tangents at given offsets.
  */
@JSGlobal("paper.Curve")
@js.native
class Curve protected ()
  extends typingsSlinky.paper.paper.Curve {
  /** 
    * Creates a new curve object.
    */
  def this(segment1: typingsSlinky.paper.paper.Segment, segment2: typingsSlinky.paper.paper.Segment) = this()
  /** 
    * Creates a new curve object.
    */
  def this(
    point1: typingsSlinky.paper.paper.Point,
    handle1: typingsSlinky.paper.paper.Point,
    handle2: typingsSlinky.paper.paper.Point,
    point2: typingsSlinky.paper.paper.Point
  ) = this()
}
