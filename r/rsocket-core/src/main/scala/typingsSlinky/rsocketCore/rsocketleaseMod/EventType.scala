package typingsSlinky.rsocketCore.rsocketleaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rsocketCore.rsocketCoreStrings.Accept
  - typingsSlinky.rsocketCore.rsocketCoreStrings.Reject
  - typingsSlinky.rsocketCore.rsocketCoreStrings.Terminate
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def Accept: typingsSlinky.rsocketCore.rsocketCoreStrings.Accept = this.cast("Accept")
  @scala.inline
  def Reject: typingsSlinky.rsocketCore.rsocketCoreStrings.Reject = this.cast("Reject")
  @scala.inline
  def Terminate: typingsSlinky.rsocketCore.rsocketCoreStrings.Terminate = this.cast("Terminate")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

