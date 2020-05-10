package typingsSlinky.gapiClientSpeech.gapi.client.speech

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientSpeech.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechResource extends js.Object {
  /**
    * Performs asynchronous speech recognition: receive results via the
    * google.longrunning.Operations interface. Returns either an
    * `Operation.error` or an `Operation.response` which contains
    * a `LongRunningRecognizeResponse` message.
    */
  def longrunningrecognize(request: AnonBearertoken): Request_[Operation] = js.native
  /**
    * Performs synchronous speech recognition: receive results after all audio
    * has been sent and processed.
    */
  def recognize(request: AnonBearertoken): Request_[RecognizeResponse] = js.native
}

object SpeechResource {
  @scala.inline
  def apply(
    longrunningrecognize: AnonBearertoken => Request_[Operation],
    recognize: AnonBearertoken => Request_[RecognizeResponse]
  ): SpeechResource = {
    val __obj = js.Dynamic.literal(longrunningrecognize = js.Any.fromFunction1(longrunningrecognize), recognize = js.Any.fromFunction1(recognize))
    __obj.asInstanceOf[SpeechResource]
  }
  @scala.inline
  implicit class SpeechResourceOps[Self <: SpeechResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLongrunningrecognize(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longrunningrecognize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecognize(value: AnonBearertoken => Request_[RecognizeResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recognize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

