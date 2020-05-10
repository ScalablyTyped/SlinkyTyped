package typingsSlinky.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The simple response message containing speech or text.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse extends js.Object {
  /**
    * Optional. The text to display.
    */
  var displayText: js.UndefOr[String] = js.native
  /**
    * One of text_to_speech or ssml must be provided. Structured spoken
    * response to the user in the SSML format. Mutually exclusive with
    * text_to_speech.
    */
  var ssml: js.UndefOr[String] = js.native
  /**
    * One of text_to_speech or ssml must be provided. The plain text of the
    * speech output. Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse] (val x: Self) extends AnyVal {
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

