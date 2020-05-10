package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d  :1 | 0} */
@js.native
trait LikeRequestOptions extends js.Object {
  var d: `1` | `0` = js.native
  var mediaId: String = js.native
  var moduleInfo: LikeModuleInfoOption = js.native
}

object LikeRequestOptions {
  @scala.inline
  def apply(d: `1` | `0`, mediaId: String, moduleInfo: LikeModuleInfoOption): LikeRequestOptions = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikeRequestOptions]
  }
  @scala.inline
  implicit class LikeRequestOptionsOps[Self <: LikeRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: `1` | `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

