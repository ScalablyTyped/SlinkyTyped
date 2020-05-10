package typingsSlinky.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryCreateReelResponseImageVersions2 extends js.Object {
  var candidates: js.Array[HighlightsRepositoryCreateReelResponseCandidatesItem] = js.native
}

object HighlightsRepositoryCreateReelResponseImageVersions2 {
  @scala.inline
  def apply(candidates: js.Array[HighlightsRepositoryCreateReelResponseCandidatesItem]): HighlightsRepositoryCreateReelResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryCreateReelResponseImageVersions2]
  }
  @scala.inline
  implicit class HighlightsRepositoryCreateReelResponseImageVersions2Ops[Self <: HighlightsRepositoryCreateReelResponseImageVersions2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidates(value: js.Array[HighlightsRepositoryCreateReelResponseCandidatesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

