package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSMLMessageType extends js.Object {
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var LanguageCode: js.UndefOr[String] = js.native
  /**
    * The SSML-formatted text to deliver to the recipient.
    */
  var Text: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the voice that you want to use to deliver the message. For a complete list of supported voices, see the Amazon Polly Developer Guide.
    */
  var VoiceId: js.UndefOr[String] = js.native
}

object SSMLMessageType {
  @scala.inline
  def apply(): SSMLMessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSMLMessageType]
  }
  @scala.inline
  implicit class SSMLMessageTypeOps[Self <: SSMLMessageType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceId")(js.undefined)
        ret
    }
  }
  
}

