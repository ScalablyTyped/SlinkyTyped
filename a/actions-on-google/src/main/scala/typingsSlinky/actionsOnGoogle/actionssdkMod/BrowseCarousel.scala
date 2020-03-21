package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.browseMod.BrowseCarouselOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "BrowseCarousel")
@js.native
class BrowseCarousel protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.BrowseCarousel {
  /**
    * @param items BrowseCarousel items
    * @public
    */
  def this(items: GoogleActionsV2UiElementsCarouselBrowseItem*) = this()
  /**
    * @param items BrowseCarousel items
    * @public
    */
  def this(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]) = this()
  /**
    * @param options BrowseCarousel options
    * @public
    */
  def this(options: BrowseCarouselOptions) = this()
}

