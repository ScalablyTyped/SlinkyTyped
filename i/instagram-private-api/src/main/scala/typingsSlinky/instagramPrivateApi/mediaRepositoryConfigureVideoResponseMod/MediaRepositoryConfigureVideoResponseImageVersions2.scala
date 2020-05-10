package typingsSlinky.instagramPrivateApi.mediaRepositoryConfigureVideoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaRepositoryConfigureVideoResponseImageVersions2 extends js.Object {
  var candidates: js.Array[MediaRepositoryConfigureVideoResponseCandidatesItem] = js.native
}

object MediaRepositoryConfigureVideoResponseImageVersions2 {
  @scala.inline
  def apply(candidates: js.Array[MediaRepositoryConfigureVideoResponseCandidatesItem]): MediaRepositoryConfigureVideoResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureVideoResponseImageVersions2]
  }
  @scala.inline
  implicit class MediaRepositoryConfigureVideoResponseImageVersions2Ops[Self <: MediaRepositoryConfigureVideoResponseImageVersions2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidates(value: js.Array[MediaRepositoryConfigureVideoResponseCandidatesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

