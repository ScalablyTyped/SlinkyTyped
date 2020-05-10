package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BrowseCarouselCard. */
@js.native
trait IBrowseCarouselCard extends js.Object {
  /** BrowseCarouselCard imageDisplayOptions */
  var imageDisplayOptions: js.UndefOr[ImageDisplayOptions | Null] = js.native
  /** BrowseCarouselCard items */
  var items: js.UndefOr[js.Array[IBrowseCarouselCardItem] | Null] = js.native
}

object IBrowseCarouselCard {
  @scala.inline
  def apply(): IBrowseCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowseCarouselCard]
  }
  @scala.inline
  implicit class IBrowseCarouselCardOps[Self <: IBrowseCarouselCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageDisplayOptions(value: ImageDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDisplayOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayOptions")(null)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[IBrowseCarouselCardItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(null)
        ret
    }
  }
  
}

