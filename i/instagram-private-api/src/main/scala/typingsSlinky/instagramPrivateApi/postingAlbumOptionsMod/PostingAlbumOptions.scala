package typingsSlinky.instagramPrivateApi.postingAlbumOptionsMod

import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingAlbumOptions extends js.Object {
  var caption: js.UndefOr[String] = js.native
  var items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem] = js.native
  var location: js.UndefOr[PostingLocation] = js.native
}

object PostingAlbumOptions {
  @scala.inline
  def apply(items: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): PostingAlbumOptions = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingAlbumOptions]
  }
  @scala.inline
  implicit class PostingAlbumOptionsOps[Self <: PostingAlbumOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[PostingAlbumPhotoItem | PostingAlbumVideoItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: PostingLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

