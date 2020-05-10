package typingsSlinky.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvChannelFeedResponseImageVersions2 extends js.Object {
  var additional_candidates: IgtvChannelFeedResponseAdditionalCandidates = js.native
  var candidates: js.Array[IgtvChannelFeedResponseCandidatesItem] = js.native
}

object IgtvChannelFeedResponseImageVersions2 {
  @scala.inline
  def apply(
    additional_candidates: IgtvChannelFeedResponseAdditionalCandidates,
    candidates: js.Array[IgtvChannelFeedResponseCandidatesItem]
  ): IgtvChannelFeedResponseImageVersions2 = {
    val __obj = js.Dynamic.literal(additional_candidates = additional_candidates.asInstanceOf[js.Any], candidates = candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseImageVersions2]
  }
  @scala.inline
  implicit class IgtvChannelFeedResponseImageVersions2Ops[Self <: IgtvChannelFeedResponseImageVersions2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditional_candidates(value: IgtvChannelFeedResponseAdditionalCandidates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_candidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCandidates(value: js.Array[IgtvChannelFeedResponseCandidatesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

