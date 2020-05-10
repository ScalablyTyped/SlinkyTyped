package typingsSlinky.instagramPrivateApi.savedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavedFeedResponseMainImage extends js.Object {
  var image_versions2: SavedFeedResponseImageVersions2 = js.native
  var preview: Null = js.native
}

object SavedFeedResponseMainImage {
  @scala.inline
  def apply(image_versions2: SavedFeedResponseImageVersions2, preview: Null): SavedFeedResponseMainImage = {
    val __obj = js.Dynamic.literal(image_versions2 = image_versions2.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseMainImage]
  }
  @scala.inline
  implicit class SavedFeedResponseMainImageOps[Self <: SavedFeedResponseMainImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage_versions2(value: SavedFeedResponseImageVersions2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image_versions2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreview(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

