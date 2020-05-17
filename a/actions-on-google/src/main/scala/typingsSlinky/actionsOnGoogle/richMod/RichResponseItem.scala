package typingsSlinky.actionsOnGoogle.richMod

import typingsSlinky.actionsOnGoogle.browseMod.BrowseCarousel
import typingsSlinky.actionsOnGoogle.cardMod.BasicCard
import typingsSlinky.actionsOnGoogle.cardMod.Table
import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.conversationConversationMod.Response
import typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponse
import typingsSlinky.actionsOnGoogle.linkoutMod.LinkOutSuggestion
import typingsSlinky.actionsOnGoogle.orderMod.OrderUpdate
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaResponse
import typingsSlinky.actionsOnGoogle.simpleMod.SimpleResponse
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.actionsOnGoogle.simpleMod.SimpleResponse
  - typingsSlinky.actionsOnGoogle.cardMod.BasicCard
  - typingsSlinky.actionsOnGoogle.cardMod.Table
  - typingsSlinky.actionsOnGoogle.browseMod.BrowseCarousel
  - typingsSlinky.actionsOnGoogle.responseMediaMod.MediaResponse
  - typingsSlinky.actionsOnGoogle.orderMod.OrderUpdate
  - typingsSlinky.actionsOnGoogle.linkoutMod.LinkOutSuggestion
  - typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponse[typingsSlinky.actionsOnGoogle.commonMod.JsonObject]
  - typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2RichResponseItem
*/
trait RichResponseItem extends Response

object RichResponseItem {
  @scala.inline
  implicit def apply(value: BasicCard): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: BrowseCarousel): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: GoogleActionsV2RichResponseItem): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: HtmlResponse[JsonObject]): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: LinkOutSuggestion): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: MediaResponse): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: OrderUpdate): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: SimpleResponse): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: String): RichResponseItem = value.asInstanceOf[RichResponseItem]
  @scala.inline
  implicit def apply(value: Table): RichResponseItem = value.asInstanceOf[RichResponseItem]
}

