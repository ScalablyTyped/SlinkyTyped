package typingsSlinky.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg-protocol/dist/messages", "NotificationResponseMessage")
@js.native
class NotificationResponseMessage protected () extends js.Object {
  def this(length: Double, processId: Double, channel: String, payload: String) = this()
  
  val channel: String = js.native
  
  val length: Double = js.native
  
  val name: MessageName = js.native
  
  val payload: String = js.native
  
  val processId: Double = js.native
}
