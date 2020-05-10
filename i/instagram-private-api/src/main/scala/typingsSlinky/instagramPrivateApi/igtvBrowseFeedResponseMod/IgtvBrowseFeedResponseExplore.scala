package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseExplore extends js.Object {
  var explanation: String = js.native
}

object IgtvBrowseFeedResponseExplore {
  @scala.inline
  def apply(explanation: String): IgtvBrowseFeedResponseExplore = {
    val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseExplore]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseExploreOps[Self <: IgtvBrowseFeedResponseExplore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplanation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explanation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

