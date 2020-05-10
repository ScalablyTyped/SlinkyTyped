package typingsSlinky.instagramPrivateApi.postingAlbumOptionsMod

import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingAlbumItem extends js.Object {
  var uploadId: js.UndefOr[String] = js.native
  var usertags: js.UndefOr[PostingUsertags] = js.native
}

object PostingAlbumItem {
  @scala.inline
  def apply(): PostingAlbumItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostingAlbumItem]
  }
  @scala.inline
  implicit class PostingAlbumItemOps[Self <: PostingAlbumItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUploadId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsertags(value: PostingUsertags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsertags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usertags")(js.undefined)
        ret
    }
  }
  
}

