package typingsSlinky.messenger

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messenger extends js.Object {
  /**
    * Hides all messages.
    */
  def hideAll(): Unit = js.native
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message = js.native
}

@JSGlobal("Messenger")
@js.native
object Messenger extends TopLevel[IMessenger]

