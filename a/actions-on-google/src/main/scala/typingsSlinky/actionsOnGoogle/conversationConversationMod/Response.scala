package typingsSlinky.actionsOnGoogle.conversationConversationMod

import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.helperMod.Helper
import typingsSlinky.actionsOnGoogle.responseMod.Image
import typingsSlinky.actionsOnGoogle.responseMod.MediaObject
import typingsSlinky.actionsOnGoogle.responseMod.RichResponse
import typingsSlinky.actionsOnGoogle.responseMod.Suggestions
import typingsSlinky.actionsOnGoogle.richMod.RichResponseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Response extends js.Object

object Response {
  @scala.inline
  implicit def apply(value: Helper[Intent, JsonObject]): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: Image): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: MediaObject): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: RichResponse): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: RichResponseItem): Response = value.asInstanceOf[Response]
  @scala.inline
  implicit def apply(value: Suggestions): Response = value.asInstanceOf[Response]
}

