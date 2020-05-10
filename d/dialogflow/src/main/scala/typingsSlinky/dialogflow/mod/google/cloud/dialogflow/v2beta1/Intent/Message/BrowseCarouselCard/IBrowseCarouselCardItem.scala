package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.IOpenUrlAction
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a BrowseCarouselCardItem. */
@js.native
trait IBrowseCarouselCardItem extends js.Object {
  /** BrowseCarouselCardItem description */
  var description: js.UndefOr[String | Null] = js.native
  /** BrowseCarouselCardItem footer */
  var footer: js.UndefOr[String | Null] = js.native
  /** BrowseCarouselCardItem image */
  var image: js.UndefOr[IImage | Null] = js.native
  /** BrowseCarouselCardItem openUriAction */
  var openUriAction: js.UndefOr[IOpenUrlAction | Null] = js.native
  /** BrowseCarouselCardItem title */
  var title: js.UndefOr[String | Null] = js.native
}

object IBrowseCarouselCardItem {
  @scala.inline
  def apply(): IBrowseCarouselCardItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBrowseCarouselCardItem]
  }
  @scala.inline
  implicit class IBrowseCarouselCardItemOps[Self <: IBrowseCarouselCardItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(null)
        ret
    }
    @scala.inline
    def withFooter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(null)
        ret
    }
    @scala.inline
    def withImage(value: IImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withImageNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(null)
        ret
    }
    @scala.inline
    def withOpenUriAction(value: IOpenUrlAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUriAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenUriAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUriAction")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenUriActionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUriAction")(null)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

