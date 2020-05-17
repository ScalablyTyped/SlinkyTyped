package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.basicMod.BasicCardOptions
import typingsSlinky.actionsOnGoogle.incomingMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "BasicCard")
@js.native
class BasicCard protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.BasicCard
     with IncomingMessage {
  /** @public */
  def this(options: BasicCardOptions) = this()
}

