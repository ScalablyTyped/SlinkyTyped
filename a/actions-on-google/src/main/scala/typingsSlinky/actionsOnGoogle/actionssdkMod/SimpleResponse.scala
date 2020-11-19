package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.incomingMod._IncomingMessage
import typingsSlinky.actionsOnGoogle.simpleMod.SimpleResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk", "SimpleResponse")
@js.native
class SimpleResponse protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.SimpleResponse
     with _IncomingMessage {
  def this(options: String) = this()
  /**
    * @param options SimpleResponse options
    * @public
    */
  def this(options: SimpleResponseOptions) = this()
}
