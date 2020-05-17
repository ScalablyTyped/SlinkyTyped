package typingsSlinky.k6.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.k6.wsMod.PongEventHandler
  - typingsSlinky.k6.wsMod.PingEventHandler
  - typingsSlinky.k6.wsMod.OpenEventHandler
  - typingsSlinky.k6.wsMod.MessageEventHandler
  - typingsSlinky.k6.wsMod.ErrorEventHandler
  - typingsSlinky.k6.wsMod.CloseEventHandler
*/
trait EventHandler[ET /* <: EventType */] extends js.Object

object EventHandler {
  @scala.inline
  implicit def apply[ET](
    value: CloseEventHandler | ErrorEventHandler | MessageEventHandler | OpenEventHandler | PingEventHandler | PongEventHandler
  ): EventHandler[ET] = value.asInstanceOf[EventHandler[ET]]
}

