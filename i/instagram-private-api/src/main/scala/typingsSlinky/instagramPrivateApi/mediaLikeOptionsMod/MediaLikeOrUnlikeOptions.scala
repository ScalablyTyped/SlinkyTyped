package typingsSlinky.instagramPrivateApi.mediaLikeOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiNumbers.`1`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.like
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.unlike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  action  :'like' | 'unlike',   d ? :1 | 0} */
@js.native
trait MediaLikeOrUnlikeOptions extends js.Object {
  var action: like | unlike = js.native
  var d: js.UndefOr[`1` | `0`] = js.native
  var mediaId: String = js.native
  var moduleInfo: LikeModuleInfoOption = js.native
}

object MediaLikeOrUnlikeOptions {
  @scala.inline
  def apply(action: like | unlike, mediaId: String, moduleInfo: LikeModuleInfoOption): MediaLikeOrUnlikeOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaLikeOrUnlikeOptions]
  }
  @scala.inline
  implicit class MediaLikeOrUnlikeOptionsOps[Self <: MediaLikeOrUnlikeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: like | unlike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withD(value: `1` | `0`): Self = {
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

