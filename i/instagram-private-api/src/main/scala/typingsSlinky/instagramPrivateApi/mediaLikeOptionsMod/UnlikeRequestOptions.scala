package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d ? :0} */
@js.native
trait UnlikeRequestOptions extends js.Object {
  var d: js.UndefOr[`0`] = js.native
  var mediaId: String = js.native
  var moduleInfo: LikeModuleInfoOption = js.native
}

object UnlikeRequestOptions {
  @scala.inline
  def apply(mediaId: String, moduleInfo: LikeModuleInfoOption): UnlikeRequestOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlikeRequestOptions]
  }
  @scala.inline
  implicit class UnlikeRequestOptionsOps[Self <: UnlikeRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleInfo(value: LikeModuleInfoOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withD(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
  }
  
}

