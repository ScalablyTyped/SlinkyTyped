package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a StreamingRecognitionResult. */
@js.native
trait IStreamingRecognitionResult extends js.Object {
  /** StreamingRecognitionResult confidence */
  var confidence: js.UndefOr[Double | Null] = js.native
  /** StreamingRecognitionResult isFinal */
  var isFinal: js.UndefOr[Boolean | Null] = js.native
  /** StreamingRecognitionResult messageType */
  var messageType: js.UndefOr[MessageType | Null] = js.native
  /** StreamingRecognitionResult transcript */
  var transcript: js.UndefOr[String | Null] = js.native
}

object IStreamingRecognitionResult {
  @scala.inline
  def apply(): IStreamingRecognitionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreamingRecognitionResult]
  }
  @scala.inline
  implicit class IStreamingRecognitionResultOps[Self <: IStreamingRecognitionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(null)
        ret
    }
    @scala.inline
    def withIsFinal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFinalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFinal")(null)
        ret
    }
    @scala.inline
    def withMessageType(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(null)
        ret
    }
    @scala.inline
    def withTranscript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscriptNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcript")(null)
        ret
    }
  }
  
}

