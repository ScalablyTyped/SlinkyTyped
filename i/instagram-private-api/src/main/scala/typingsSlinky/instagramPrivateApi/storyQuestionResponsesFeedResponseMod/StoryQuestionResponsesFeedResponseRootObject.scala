package typingsSlinky.instagramPrivateApi.storyQuestionResponsesFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryQuestionResponsesFeedResponseRootObject extends js.Object {
  var responder_info: StoryQuestionResponsesFeedResponseResponderInfo = js.native
  var status: String = js.native
}

object StoryQuestionResponsesFeedResponseRootObject {
  @scala.inline
  def apply(responder_info: StoryQuestionResponsesFeedResponseResponderInfo, status: String): StoryQuestionResponsesFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(responder_info = responder_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryQuestionResponsesFeedResponseRootObject]
  }
  @scala.inline
  implicit class StoryQuestionResponsesFeedResponseRootObjectOps[Self <: StoryQuestionResponsesFeedResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponder_info(value: StoryQuestionResponsesFeedResponseResponderInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responder_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

