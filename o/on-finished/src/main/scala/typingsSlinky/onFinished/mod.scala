package typingsSlinky.onFinished

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.OutgoingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("on-finished", JSImport.Namespace)
  @js.native
  def apply(
    msg: IncomingMessage,
    listener: js.Function2[/* err */ js.Error | Null, /* msg */ IncomingMessage, Unit]
  ): IncomingMessage = js.native
  @JSImport("on-finished", JSImport.Namespace)
  @js.native
  def apply(
    msg: OutgoingMessage,
    listener: js.Function2[/* err */ js.Error | Null, /* msg */ OutgoingMessage, Unit]
  ): OutgoingMessage = js.native
  
  @JSImport("on-finished", "isFinished")
  @js.native
  def isFinished(msg: IncomingMessage): Boolean = js.native
  @JSImport("on-finished", "isFinished")
  @js.native
  def isFinished(msg: OutgoingMessage): Boolean = js.native
}
