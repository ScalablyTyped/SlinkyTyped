package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.incomingMod.IncomingMessage
import typingsSlinky.actionsOnGoogle.listMod.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "List")
@js.native
class List protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.List
     with IncomingMessage {
  /**
    * @param options List options
    * @public
    */
  def this(options: ListOptions) = this()
}

