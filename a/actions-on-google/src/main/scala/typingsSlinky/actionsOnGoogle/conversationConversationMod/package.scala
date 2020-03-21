package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object conversationConversationMod {
  type ExceptionHandler[TUserStorage, TConversation /* <: typingsSlinky.actionsOnGoogle.conversationConversationMod.Conversation[TUserStorage] */] = js.Function2[/* conv */ TConversation, /* error */ js.Error, js.Promise[js.Any] | js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.actionsOnGoogle.responseMod.RichResponse
    - typingsSlinky.actionsOnGoogle.richMod.RichResponseItem
    - typingsSlinky.actionsOnGoogle.responseMod.Image
    - typingsSlinky.actionsOnGoogle.responseMod.Suggestions
    - typingsSlinky.actionsOnGoogle.responseMod.MediaObject
    - typingsSlinky.actionsOnGoogle.helperMod.Helper[
  typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent, 
  typingsSlinky.actionsOnGoogle.commonMod.JsonObject]
  */
  type Response = typingsSlinky.actionsOnGoogle.conversationConversationMod._Response | (typingsSlinky.actionsOnGoogle.helperMod.Helper[
    typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent, 
    typingsSlinky.actionsOnGoogle.commonMod.JsonObject
  ]) | typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponse[typingsSlinky.actionsOnGoogle.commonMod.JsonObject] | java.lang.String
  type Traversed = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
