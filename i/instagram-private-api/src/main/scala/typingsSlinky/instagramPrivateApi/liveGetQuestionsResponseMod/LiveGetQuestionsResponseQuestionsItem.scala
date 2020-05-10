package typingsSlinky.instagramPrivateApi.liveGetQuestionsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveGetQuestionsResponseQuestionsItem extends js.Object {
  var qid: String = js.native
  var source: String = js.native
  var story_sticker_text: String = js.native
  var text: String = js.native
  var timestamp: Double = js.native
  var user: LiveGetQuestionsResponseUser = js.native
}

object LiveGetQuestionsResponseQuestionsItem {
  @scala.inline
  def apply(
    qid: String,
    source: String,
    story_sticker_text: String,
    text: String,
    timestamp: Double,
    user: LiveGetQuestionsResponseUser
  ): LiveGetQuestionsResponseQuestionsItem = {
    val __obj = js.Dynamic.literal(qid = qid.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], story_sticker_text = story_sticker_text.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveGetQuestionsResponseQuestionsItem]
  }
  @scala.inline
  implicit class LiveGetQuestionsResponseQuestionsItemOps[Self <: LiveGetQuestionsResponseQuestionsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStory_sticker_text(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("story_sticker_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: LiveGetQuestionsResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

