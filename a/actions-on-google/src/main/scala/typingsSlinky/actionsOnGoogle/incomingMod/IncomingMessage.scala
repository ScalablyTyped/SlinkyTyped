package typingsSlinky.actionsOnGoogle.incomingMod

import typingsSlinky.actionsOnGoogle.actionssdkMod.BasicCard
import typingsSlinky.actionsOnGoogle.actionssdkMod.Carousel
import typingsSlinky.actionsOnGoogle.actionssdkMod.Image
import typingsSlinky.actionsOnGoogle.actionssdkMod.LinkOutSuggestion
import typingsSlinky.actionsOnGoogle.actionssdkMod.List
import typingsSlinky.actionsOnGoogle.actionssdkMod.SimpleResponse
import typingsSlinky.actionsOnGoogle.actionssdkMod.Suggestions
import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.actionsOnGoogle.actionssdkMod.Image
  - typingsSlinky.actionsOnGoogle.actionssdkMod.Suggestions
  - typingsSlinky.actionsOnGoogle.actionssdkMod.BasicCard
  - typingsSlinky.actionsOnGoogle.actionssdkMod.SimpleResponse
  - typingsSlinky.actionsOnGoogle.actionssdkMod.LinkOutSuggestion
  - typingsSlinky.actionsOnGoogle.actionssdkMod.List
  - typingsSlinky.actionsOnGoogle.actionssdkMod.Carousel
  - typingsSlinky.actionsOnGoogle.commonMod.JsonObject
*/
trait IncomingMessage extends js.Object

object IncomingMessage {
  @scala.inline
  implicit def apply(value: BasicCard): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: Carousel): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: Image): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: JsonObject): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: LinkOutSuggestion): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: List): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: SimpleResponse): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: String): IncomingMessage = value.asInstanceOf[IncomingMessage]
  @scala.inline
  implicit def apply(value: Suggestions): IncomingMessage = value.asInstanceOf[IncomingMessage]
}

