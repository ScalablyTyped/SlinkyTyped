package typingsSlinky.jsDashClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JoinType extends js.Object

@JSGlobal("ClipperLib.JoinType")
@js.native
object JoinType extends js.Object {
  @js.native
  sealed trait jtMiter extends JoinType
  
  @js.native
  sealed trait jtRound extends JoinType
  
  @js.native
  sealed trait jtSquare extends JoinType
  
  /* 2 */ val jtMiter: typingsSlinky.jsDashClipper.ClipperLib.JoinType.jtMiter with Double = js.native
  /* 1 */ val jtRound: typingsSlinky.jsDashClipper.ClipperLib.JoinType.jtRound with Double = js.native
  /* 0 */ val jtSquare: typingsSlinky.jsDashClipper.ClipperLib.JoinType.jtSquare with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JoinType with Double] = js.native
}

