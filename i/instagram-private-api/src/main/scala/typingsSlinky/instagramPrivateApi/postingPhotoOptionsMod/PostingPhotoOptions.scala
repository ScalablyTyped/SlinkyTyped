package typingsSlinky.instagramPrivateApi.postingPhotoOptionsMod

import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingLocation
import typingsSlinky.instagramPrivateApi.postingOptionsMod.PostingUsertags
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostingPhotoOptions extends js.Object {
  var caption: js.UndefOr[String] = js.native
  var file: Buffer = js.native
  var location: js.UndefOr[PostingLocation] = js.native
  var usertags: js.UndefOr[PostingUsertags] = js.native
}

object PostingPhotoOptions {
  @scala.inline
  def apply(file: Buffer): PostingPhotoOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostingPhotoOptions]
  }
  @scala.inline
  implicit class PostingPhotoOptionsOps[Self <: PostingPhotoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
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

