package typingsSlinky.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorySlider extends StorySticker {
  var background_color: String = js.native
  var emoji: String = js.native
  var is_sticker: `true` = js.native
  var question: String = js.native
  var text_color: String = js.native
}

object StorySlider {
  @scala.inline
  def apply(
    background_color: String,
    emoji: String,
    height: Double,
    is_sticker: `true`,
    question: String,
    rotation: Double,
    text_color: String,
    width: Double,
    x: Double,
    y: Double
  ): StorySlider = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySlider]
  }
  @scala.inline
  implicit class StorySliderOps[Self <: StorySlider] (val x: Self) extends AnyVal {
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
    def withIs_sticker(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_sticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text_color")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

