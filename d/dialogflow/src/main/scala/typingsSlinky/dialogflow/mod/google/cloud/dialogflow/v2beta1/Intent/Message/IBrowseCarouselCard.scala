package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BrowseCarouselCard. */
trait IBrowseCarouselCard extends js.Object {
  /** BrowseCarouselCard imageDisplayOptions */
  var imageDisplayOptions: js.UndefOr[ImageDisplayOptions | Null] = js.undefined
  /** BrowseCarouselCard items */
  var items: js.UndefOr[js.Array[IBrowseCarouselCardItem] | Null] = js.undefined
}

object IBrowseCarouselCard {
  @scala.inline
  def apply(
    imageDisplayOptions: js.UndefOr[Null | ImageDisplayOptions] = js.undefined,
    items: js.UndefOr[Null | js.Array[IBrowseCarouselCardItem]] = js.undefined
  ): IBrowseCarouselCard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imageDisplayOptions)) __obj.updateDynamic("imageDisplayOptions")(imageDisplayOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBrowseCarouselCard]
  }
}

