package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseAdditionalCandidates extends js.Object {
  var igtv_first_frame: IgtvBrowseFeedResponseIgtvFirstFrame = js.native
}

object IgtvBrowseFeedResponseAdditionalCandidates {
  @scala.inline
  def apply(igtv_first_frame: IgtvBrowseFeedResponseIgtvFirstFrame): IgtvBrowseFeedResponseAdditionalCandidates = {
    val __obj = js.Dynamic.literal(igtv_first_frame = igtv_first_frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseAdditionalCandidates]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseAdditionalCandidatesOps[Self <: IgtvBrowseFeedResponseAdditionalCandidates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgtv_first_frame(value: IgtvBrowseFeedResponseIgtvFirstFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("igtv_first_frame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

