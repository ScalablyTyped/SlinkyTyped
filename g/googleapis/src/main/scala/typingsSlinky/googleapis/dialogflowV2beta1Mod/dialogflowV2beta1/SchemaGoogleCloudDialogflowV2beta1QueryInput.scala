package typingsSlinky.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the query input. It can contain either:  1.  An audio config
  * which     instructs the speech recognizer how to process the speech audio.
  * 2.  A conversational query in the form of text,.  3.  An event that
  * specifies which intent to trigger.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1QueryInput extends js.Object {
  /**
    * Instructs the speech recognizer how to process the speech audio.
    */
  var audioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1InputAudioConfig] = js.native
  /**
    * The event to be processed.
    */
  var event: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1EventInput] = js.native
  /**
    * The natural language text to be processed.
    */
  var text: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1TextInput] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1QueryInput {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1QueryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1QueryInput]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1QueryInputOps[Self <: SchemaGoogleCloudDialogflowV2beta1QueryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1InputAudioConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: SchemaGoogleCloudDialogflowV2beta1EventInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: SchemaGoogleCloudDialogflowV2beta1TextInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

