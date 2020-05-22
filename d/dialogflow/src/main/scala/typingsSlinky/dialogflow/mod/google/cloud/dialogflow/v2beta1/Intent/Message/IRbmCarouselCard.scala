package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmCarouselCard. */
trait IRbmCarouselCard extends js.Object {
  /** RbmCarouselCard cardContents */
  var cardContents: js.UndefOr[js.Array[IRbmCardContent] | Null] = js.undefined
  /** RbmCarouselCard cardWidth */
  var cardWidth: js.UndefOr[CardWidth | Null] = js.undefined
}

object IRbmCarouselCard {
  @scala.inline
  def apply(
    cardContents: js.UndefOr[Null | js.Array[IRbmCardContent]] = js.undefined,
    cardWidth: js.UndefOr[Null | CardWidth] = js.undefined
  ): IRbmCarouselCard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cardContents)) __obj.updateDynamic("cardContents")(cardContents.asInstanceOf[js.Any])
    if (!js.isUndefined(cardWidth)) __obj.updateDynamic("cardWidth")(cardWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmCarouselCard]
  }
}

