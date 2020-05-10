package typingsSlinky.instagramPrivateApi.spamResponseMod

import typingsSlinky.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.fail
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.feedback_required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpamResponse extends js.Object {
  var error_type: js.UndefOr[String] = js.native
  var feedback_action: String = js.native
  var feedback_appeal_label: String = js.native
  var feedback_ignore_label: String = js.native
  var feedback_message: String = js.native
  var feedback_title: String = js.native
  var feedback_url: String = js.native
  var message: feedback_required = js.native
  var spam: `true` = js.native
  var status: fail = js.native
}

object SpamResponse {
  @scala.inline
  def apply(
    feedback_action: String,
    feedback_appeal_label: String,
    feedback_ignore_label: String,
    feedback_message: String,
    feedback_title: String,
    feedback_url: String,
    message: feedback_required,
    spam: `true`,
    status: fail
  ): SpamResponse = {
    val __obj = js.Dynamic.literal(feedback_action = feedback_action.asInstanceOf[js.Any], feedback_appeal_label = feedback_appeal_label.asInstanceOf[js.Any], feedback_ignore_label = feedback_ignore_label.asInstanceOf[js.Any], feedback_message = feedback_message.asInstanceOf[js.Any], feedback_title = feedback_title.asInstanceOf[js.Any], feedback_url = feedback_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamResponse]
  }
  @scala.inline
  implicit class SpamResponseOps[Self <: SpamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedback_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedback_appeal_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_appeal_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedback_ignore_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_ignore_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedback_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedback_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedback_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedback_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: feedback_required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpam(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: fail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(js.undefined)
        ret
    }
  }
  
}

