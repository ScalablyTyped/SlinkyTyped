package typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryConfigureSidecarResponseFbUserTags extends js.Object {
  var in: js.Array[_] = js.native
}

object MediaRepositoryConfigureSidecarResponseFbUserTags {
  @scala.inline
  def apply(in: js.Array[_]): MediaRepositoryConfigureSidecarResponseFbUserTags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseFbUserTags]
  }
  @scala.inline
  implicit class MediaRepositoryConfigureSidecarResponseFbUserTagsOps[Self <: MediaRepositoryConfigureSidecarResponseFbUserTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

