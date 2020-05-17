package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.incomingMod.IncomingMessage
import typingsSlinky.actionsOnGoogle.linkoutMod.LinkOutSuggestionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "LinkOutSuggestion")
@js.native
class LinkOutSuggestion protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.LinkOutSuggestion
     with IncomingMessage {
  /**
    * @param options LinkOutSuggestion options
    * @public
    */
  def this(options: LinkOutSuggestionOptions) = this()
}

