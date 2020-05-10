package typingsSlinky.googleapis.speechV1Mod.speechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The top-level message sent by the client for the `LongRunningRecognize`
  * method.
  */
@js.native
trait SchemaLongRunningRecognizeRequest extends js.Object {
  /**
    * *Required* The audio data to be recognized.
    */
  var audio: js.UndefOr[SchemaRecognitionAudio] = js.native
  /**
    * *Required* Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[SchemaRecognitionConfig] = js.native
}

object SchemaLongRunningRecognizeRequest {
  @scala.inline
  def apply(): SchemaLongRunningRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeRequest]
  }
  @scala.inline
  implicit class SchemaLongRunningRecognizeRequestOps[Self <: SchemaLongRunningRecognizeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: SchemaRecognitionAudio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(js.undefined)
        ret
    }
    @scala.inline
    def withConfig(value: SchemaRecognitionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
  }
  
}

