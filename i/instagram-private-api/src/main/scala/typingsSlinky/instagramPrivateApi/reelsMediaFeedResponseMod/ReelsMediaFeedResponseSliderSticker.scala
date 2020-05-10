package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponseSliderSticker extends js.Object {
  var background_color: String = js.native
  var emoji: String = js.native
  var question: String = js.native
  var slider_id: Double = js.native
  var slider_vote_average: Null = js.native
  var slider_vote_count: Double = js.native
  var text_color: String = js.native
  var viewer_can_vote: Boolean = js.native
  var viewer_vote: js.UndefOr[Double] = js.native
}

object ReelsMediaFeedResponseSliderSticker {
  @scala.inline
  def apply(
    background_color: String,
    emoji: String,
    question: String,
    slider_id: Double,
    slider_vote_average: Null,
    slider_vote_count: Double,
    text_color: String,
    viewer_can_vote: Boolean
  ): ReelsMediaFeedResponseSliderSticker = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], slider_id = slider_id.asInstanceOf[js.Any], slider_vote_average = slider_vote_average.asInstanceOf[js.Any], slider_vote_count = slider_vote_count.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseSliderSticker]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseSliderStickerOps[Self <: ReelsMediaFeedResponseSliderSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmoji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlider_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlider_vote_average(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider_vote_average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlider_vote_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slider_vote_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
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

