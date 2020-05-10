package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseImageVersions2 extends js.Object {
  var candidates: js.Array[ListReelMediaViewerFeedResponseCandidatesItem] = js.native
}

object ListReelMediaViewerFeedResponseImageVersions2 {
  @scala.inline
  def apply(candidates: js.Array[ListReelMediaViewerFeedResponseCandidatesItem]): ListReelMediaViewerFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseImageVersions2]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseImageVersions2Ops[Self <: ListReelMediaViewerFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidates(value: js.Array[ListReelMediaViewerFeedResponseCandidatesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

