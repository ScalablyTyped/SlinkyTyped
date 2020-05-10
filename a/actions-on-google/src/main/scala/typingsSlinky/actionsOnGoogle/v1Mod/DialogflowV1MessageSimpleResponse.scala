package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.google
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.simple_response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageSimpleResponse
  extends DialogflowV1BaseGoogleMessage[simple_response]
     with DialogflowV1Message {
  var displayText: js.UndefOr[String] = js.native
  var textToSpeech: js.UndefOr[String] = js.native
}

object DialogflowV1MessageSimpleResponse {
  @scala.inline
  def apply(platform: google): DialogflowV1MessageSimpleResponse = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSimpleResponse]
  }
  @scala.inline
  implicit class DialogflowV1MessageSimpleResponseOps[Self <: DialogflowV1MessageSimpleResponse] (val x: Self) extends AnyVal {
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

