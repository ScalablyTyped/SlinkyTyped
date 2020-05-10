package typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsTrayFeedResponseQuestionSticker extends js.Object {
  var background_color: String = js.native
  var media_id: String = js.native
  var profile_pic_url: String = js.native
  var question: String = js.native
  var question_id: String = js.native
  var question_type: String = js.native
  var text_color: String = js.native
  var viewer_can_interact: Boolean = js.native
}

object ReelsTrayFeedResponseQuestionSticker {
  @scala.inline
  def apply(
    background_color: String,
    media_id: String,
    profile_pic_url: String,
    question: String,
    question_id: String,
    question_type: String,
    text_color: String,
    viewer_can_interact: Boolean
  ): ReelsTrayFeedResponseQuestionSticker = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_id = question_id.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = viewer_can_interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseQuestionSticker]
  }
  @scala.inline
  implicit class ReelsTrayFeedResponseQuestionStickerOps[Self <: ReelsTrayFeedResponseQuestionSticker] (val x: Self) extends AnyVal {
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
    def withMedia_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfile_pic_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile_pic_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewer_can_interact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_can_interact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

