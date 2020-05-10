package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmStandaloneCard. */
@js.native
trait IRbmStandaloneCard extends js.Object {
  /** RbmStandaloneCard cardContent */
  var cardContent: js.UndefOr[IRbmCardContent | Null] = js.native
  /** RbmStandaloneCard cardOrientation */
  var cardOrientation: js.UndefOr[CardOrientation | Null] = js.native
  /** RbmStandaloneCard thumbnailImageAlignment */
  var thumbnailImageAlignment: js.UndefOr[ThumbnailImageAlignment | Null] = js.native
}

object IRbmStandaloneCard {
  @scala.inline
  def apply(): IRbmStandaloneCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmStandaloneCard]
  }
  @scala.inline
  implicit class IRbmStandaloneCardOps[Self <: IRbmStandaloneCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardContent(value: IRbmCardContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContent")(js.undefined)
        ret
    }
    @scala.inline
    def withCardContentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContent")(null)
        ret
    }
    @scala.inline
    def withCardOrientation(value: CardOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withCardOrientationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardOrientation")(null)
        ret
    }
    @scala.inline
    def withThumbnailImageAlignment(value: ThumbnailImageAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailImageAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnailImageAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailImageAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnailImageAlignmentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnailImageAlignment")(null)
        ret
    }
  }
  
}

