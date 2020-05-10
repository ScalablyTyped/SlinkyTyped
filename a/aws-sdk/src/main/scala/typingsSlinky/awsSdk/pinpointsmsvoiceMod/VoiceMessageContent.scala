package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceMessageContent extends js.Object {
  var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.native
  var PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.native
  var SSMLMessage: js.UndefOr[SSMLMessageType] = js.native
}

object VoiceMessageContent {
  @scala.inline
  def apply(): VoiceMessageContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceMessageContent]
  }
  @scala.inline
  implicit class VoiceMessageContentOps[Self <: VoiceMessageContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallInstructionsMessage(value: CallInstructionsMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallInstructionsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallInstructionsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallInstructionsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withPlainTextMessage(value: PlainTextMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlainTextMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlainTextMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlainTextMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withSSMLMessage(value: SSMLMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSMLMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSMLMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSMLMessage")(js.undefined)
        ret
    }
  }
  
}

