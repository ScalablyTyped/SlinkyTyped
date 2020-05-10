package typingsSlinky.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightsRepositoryEditReelResponseParticipantsItem extends js.Object {
  var answer: Double = js.native
  var ts: Double = js.native
  var user: HighlightsRepositoryEditReelResponseUser = js.native
}

object HighlightsRepositoryEditReelResponseParticipantsItem {
  @scala.inline
  def apply(answer: Double, ts: Double, user: HighlightsRepositoryEditReelResponseUser): HighlightsRepositoryEditReelResponseParticipantsItem = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseParticipantsItem]
  }
  @scala.inline
  implicit class HighlightsRepositoryEditReelResponseParticipantsItemOps[Self <: HighlightsRepositoryEditReelResponseParticipantsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: HighlightsRepositoryEditReelResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

