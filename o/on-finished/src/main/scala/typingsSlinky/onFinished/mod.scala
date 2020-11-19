package typingsSlinky.onFinished

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.OutgoingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("on-finished", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(
    msg: IncomingMessage,
    listener: js.Function2[/* err */ js.Error | Null, /* msg */ IncomingMessage, Unit]
  ): IncomingMessage = js.native
  def apply(
    msg: OutgoingMessage,
    listener: js.Function2[/* err */ js.Error | Null, /* msg */ OutgoingMessage, Unit]
  ): OutgoingMessage = js.native
  
  def isFinished(msg: IncomingMessage): Boolean = js.native
  def isFinished(msg: OutgoingMessage): Boolean = js.native
}
