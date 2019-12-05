package typingsSlinky.rsocketDashCore.rSocketLeaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rsocketDashCore.rsocketDashCoreStrings.Accept
  - typings.rsocketDashCore.rsocketDashCoreStrings.Reject
  - typings.rsocketDashCore.rsocketDashCoreStrings.Terminate
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Accept: typingsSlinky.rsocketDashCore.rsocketDashCoreStrings.Accept = this.cast("Accept")
  @scala.inline
  def Reject: typingsSlinky.rsocketDashCore.rsocketDashCoreStrings.Reject = this.cast("Reject")
  @scala.inline
  def Terminate: typingsSlinky.rsocketDashCore.rsocketDashCoreStrings.Terminate = this.cast("Terminate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

