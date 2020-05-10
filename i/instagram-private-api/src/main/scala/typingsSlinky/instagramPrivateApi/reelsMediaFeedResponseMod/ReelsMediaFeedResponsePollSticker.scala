package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponsePollSticker extends js.Object {
  var finished: Boolean = js.native
  var id: String = js.native
  var is_shared_result: Boolean = js.native
  var poll_id: Double = js.native
  var promotion_tallies: Null = js.native
  var question: String = js.native
  var tallies: js.Array[ReelsMediaFeedResponseTalliesItem] = js.native
  var viewer_can_vote: Boolean = js.native
  var viewer_vote: js.UndefOr[Double] = js.native
}

object ReelsMediaFeedResponsePollSticker {
  @scala.inline
  def apply(
    finished: Boolean,
    id: String,
    is_shared_result: Boolean,
    poll_id: Double,
    promotion_tallies: Null,
    question: String,
    tallies: js.Array[ReelsMediaFeedResponseTalliesItem],
    viewer_can_vote: Boolean
  ): ReelsMediaFeedResponsePollSticker = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_shared_result = is_shared_result.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], promotion_tallies = promotion_tallies.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponsePollSticker]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponsePollStickerOps[Self <: ReelsMediaFeedResponsePollSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFinished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finished")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_shared_result(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_shared_result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoll_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poll_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPromotion_tallies(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotion_tallies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTallies(value: js.Array[ReelsMediaFeedResponseTalliesItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tallies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_can_vote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_can_vote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_vote(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_vote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewer_vote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_vote")(js.undefined)
        ret
    }
  }
  
}

