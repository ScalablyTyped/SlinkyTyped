package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.incomingMod._IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk", "Suggestions")
@js.native
class Suggestions protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.Suggestions
     with _IncomingMessage {
  /**
    * @param suggestions Texts of the suggestions.
    * @public
    */
  def this(suggestions: (js.Array[String] | String)*) = this()
}
