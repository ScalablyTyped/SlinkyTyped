package typingsSlinky.estraverse.estraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisitorOption extends js.Object

@JSImport("estraverse", "VisitorOption")
@js.native
object VisitorOption extends js.Object {
  @js.native
  sealed trait Break extends VisitorOption
  
  @js.native
  sealed trait Remove extends VisitorOption
  
  @js.native
  sealed trait Skip extends VisitorOption
  
  /* 1 */ val Break: typingsSlinky.estraverse.estraverseMod.VisitorOption.Break with Double = js.native
  /* 2 */ val Remove: typingsSlinky.estraverse.estraverseMod.VisitorOption.Remove with Double = js.native
  /* 0 */ val Skip: typingsSlinky.estraverse.estraverseMod.VisitorOption.Skip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisitorOption with Double] = js.native
}

