package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseImageVersions2 extends js.Object {
  var additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates = js.native
  var candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem] = js.native
}

object IgtvBrowseFeedResponseImageVersions2 {
  @scala.inline
  def apply(
    additional_candidates: IgtvBrowseFeedResponseAdditionalCandidates,
    candidates: js.Array[IgtvBrowseFeedResponseCandidatesItem]
  ): IgtvBrowseFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseImageVersions2]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseImageVersions2Ops[Self <: IgtvBrowseFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_candidates(value: IgtvBrowseFeedResponseAdditionalCandidates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_candidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidates(value: js.Array[IgtvBrowseFeedResponseCandidatesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

