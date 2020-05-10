package typingsSlinky.instagramPrivateApi.igtvChannelFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvChannelFeedResponseAdditionalCandidates extends js.Object {
  var igtv_first_frame: IgtvChannelFeedResponseIgtvFirstFrame = js.native
}

object IgtvChannelFeedResponseAdditionalCandidates {
  @scala.inline
  def apply(igtv_first_frame: IgtvChannelFeedResponseIgtvFirstFrame): IgtvChannelFeedResponseAdditionalCandidates = {
    val __obj = js.Dynamic.literal(igtv_first_frame = igtv_first_frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseAdditionalCandidates]
  }
  @scala.inline
  implicit class IgtvChannelFeedResponseAdditionalCandidatesOps[Self <: IgtvChannelFeedResponseAdditionalCandidates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgtv_first_frame(value: IgtvChannelFeedResponseIgtvFirstFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("igtv_first_frame")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

