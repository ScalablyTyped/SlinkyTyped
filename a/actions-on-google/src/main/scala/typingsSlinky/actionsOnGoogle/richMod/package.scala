package typingsSlinky.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object richMod {
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
  type RichResponseItem = typingsSlinky.actionsOnGoogle.richMod._RichResponseItem | typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponse[typingsSlinky.actionsOnGoogle.commonMod.JsonObject] | java.lang.String
}
