package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryQuestion extends StorySticker {
  var background_color: String = js.native
  var is_sticker: `true` = js.native
  var profile_pic_url: String = js.native
  var question: String = js.native
  var question_type: text_ = js.native
  var text_color: String = js.native
  var viewer_can_interact: `true` = js.native
}

object StoryQuestion {
  @scala.inline
  def apply(
    background_color: String,
    height: Double,
    is_sticker: `true`,
    profile_pic_url: String,
    question: String,
    question_type: text_,
    rotation: Double,
    text_color: String,
    viewer_can_interact: `true`,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuestion = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = viewer_can_interact.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestion]
  }
  @scala.inline
  implicit class StoryQuestionOps[Self <: StoryQuestion] (val x: Self) extends AnyVal {
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
    def withIs_sticker(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_sticker")(value.asInstanceOf[js.Any])
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
    def withQuestion_type(value: text_): Self = {
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
    def withViewer_can_interact(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewer_can_interact")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

