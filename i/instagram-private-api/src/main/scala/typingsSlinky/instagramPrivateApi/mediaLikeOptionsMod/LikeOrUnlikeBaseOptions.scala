package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LikeOrUnlikeBaseOptions extends js.Object {
  var mediaId: String = js.native
  var moduleInfo: LikeModuleInfoOption = js.native
}

object LikeOrUnlikeBaseOptions {
  @scala.inline
  def apply(mediaId: String, moduleInfo: LikeModuleInfoOption): LikeOrUnlikeBaseOptions = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikeOrUnlikeBaseOptions]
  }
  @scala.inline
  implicit class LikeOrUnlikeBaseOptionsOps[Self <: LikeOrUnlikeBaseOptions] (val x: Self) extends AnyVal {
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
  }
  
}

