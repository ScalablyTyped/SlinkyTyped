package typingsSlinky.ot.mod.Client

import typingsSlinky.ot.mod.TextOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In the 'AwaitingConfirm' state, there's one operation the client has sent
  * to the server and is still waiting for an acknowledgement.
  */
@js.native
trait AwaitingConfirm extends Sync[AwaitingWithBuffer, AwaitingConfirm, Synchronized] {
  
  var outstanding: TextOperation = js.native
  
  def resend(client: typingsSlinky.ot.mod.Client): Unit = js.native
}
@JSImport("ot", "Client.AwaitingConfirm")
@js.native
object AwaitingConfirm extends js.Object {
  
  def apply(outstanding: TextOperation): AwaitingConfirm = js.native
}
