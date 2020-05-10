package typingsSlinky.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageSimpleResponse extends js.Object {
  var displayText: js.UndefOr[String] = js.native
  var ssml: js.UndefOr[String] = js.native
  var textToSpeech: js.UndefOr[String] = js.native
}

object GoogleCloudDialogflowV2IntentMessageSimpleResponse {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponse]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSimpleResponseOps[Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayText")(js.undefined)
        ret
    }
    @scala.inline
    def withSsml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssml")(js.undefined)
        ret
    }
    @scala.inline
    def withTextToSpeech(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextToSpeech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeech")(js.undefined)
        ret
    }
  }
  
}

