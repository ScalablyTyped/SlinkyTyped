package typingsSlinky.instagramPrivateApi.reelsMediaFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsMediaFeedResponseCountdownSticker extends js.Object {
  var attribution: Null = js.native
  var countdown_id: Double = js.native
  var digit_card_color: String = js.native
  var digit_color: String = js.native
  var end_background_color: String = js.native
  var end_ts: Double = js.native
  var following_enabled: Boolean = js.native
  var is_owner: Boolean = js.native
  var start_background_color: String = js.native
  var text: String = js.native
  var text_color: String = js.native
  var viewer_is_following: Boolean = js.native
}

object ReelsMediaFeedResponseCountdownSticker {
  @scala.inline
  def apply(
    attribution: Null,
    countdown_id: Double,
    digit_card_color: String,
    digit_color: String,
    end_background_color: String,
    end_ts: Double,
    following_enabled: Boolean,
    is_owner: Boolean,
    start_background_color: String,
    text: String,
    text_color: String,
    viewer_is_following: Boolean
  ): ReelsMediaFeedResponseCountdownSticker = {
    val __obj = js.Dynamic.literal(attribution = attribution.asInstanceOf[js.Any], countdown_id = countdown_id.asInstanceOf[js.Any], digit_card_color = digit_card_color.asInstanceOf[js.Any], digit_color = digit_color.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], end_ts = end_ts.asInstanceOf[js.Any], following_enabled = following_enabled.asInstanceOf[js.Any], is_owner = is_owner.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_is_following = viewer_is_following.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseCountdownSticker]
  }
  @scala.inline
  implicit class ReelsMediaFeedResponseCountdownStickerOps[Self <: ReelsMediaFeedResponseCountdownSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribution(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountdown_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countdown_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigit_card_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digit_card_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDigit_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digit_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_ts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_owner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_is_following(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_is_following")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

