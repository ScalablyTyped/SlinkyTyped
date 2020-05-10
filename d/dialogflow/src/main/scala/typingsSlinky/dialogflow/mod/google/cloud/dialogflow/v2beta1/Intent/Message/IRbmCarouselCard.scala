package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmCarouselCard. */
@js.native
trait IRbmCarouselCard extends js.Object {
  /** RbmCarouselCard cardContents */
  var cardContents: js.UndefOr[js.Array[IRbmCardContent] | Null] = js.native
  /** RbmCarouselCard cardWidth */
  var cardWidth: js.UndefOr[CardWidth | Null] = js.native
}

object IRbmCarouselCard {
  @scala.inline
  def apply(): IRbmCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmCarouselCard]
  }
  @scala.inline
  implicit class IRbmCarouselCardOps[Self <: IRbmCarouselCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardContents(value: js.Array[IRbmCardContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContents")(js.undefined)
        ret
    }
    @scala.inline
    def withCardContentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardContents")(null)
        ret
    }
    @scala.inline
    def withCardWidth(value: CardWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCardWidthNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardWidth")(null)
        ret
    }
  }
  
}

