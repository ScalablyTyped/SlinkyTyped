package typingsSlinky.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReelsTrayFeedResponseStoryQuestionsItem extends js.Object {
  var height: Double = js.native
  var is_hidden: Double = js.native
  var is_pinned: Double = js.native
  var is_sticker: Double = js.native
  var question_sticker: ReelsTrayFeedResponseQuestionSticker = js.native
  var rotation: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
}

object ReelsTrayFeedResponseStoryQuestionsItem {
  @scala.inline
  def apply(
    height: Double,
    is_hidden: Double,
    is_pinned: Double,
    is_sticker: Double,
    question_sticker: ReelsTrayFeedResponseQuestionSticker,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double,
    z: Double
  ): ReelsTrayFeedResponseStoryQuestionsItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], is_hidden = is_hidden.asInstanceOf[js.Any], is_pinned = is_pinned.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], question_sticker = question_sticker.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseStoryQuestionsItem]
  }
  @scala.inline
  implicit class ReelsTrayFeedResponseStoryQuestionsItemOps[Self <: ReelsTrayFeedResponseStoryQuestionsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_hidden(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_pinned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_sticker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_sticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuestion_sticker(value: ReelsTrayFeedResponseQuestionSticker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("question_sticker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

