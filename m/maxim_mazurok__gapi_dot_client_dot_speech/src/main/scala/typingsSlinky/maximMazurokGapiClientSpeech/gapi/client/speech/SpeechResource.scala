package typingsSlinky.maximMazurokGapiClientSpeech.gapi.client.speech

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSpeech.anon.Fields
import typingsSlinky.maximMazurokGapiClientSpeech.anon.Key
import typingsSlinky.maximMazurokGapiClientSpeech.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechResource extends js.Object {
  
  /**
    * Performs asynchronous speech recognition: receive results via the google.longrunning.Operations interface. Returns either an `Operation.error` or an `Operation.response` which
    * contains a `LongRunningRecognizeResponse` message. For more information on asynchronous speech recognition, see the
    * [how-to](https://cloud.google.com/speech-to-text/docs/async-recognize).
    */
  def longrunningrecognize(request: Fields): Request[Operation] = js.native
  def longrunningrecognize(request: Key, body: LongRunningRecognizeRequest): Request[Operation] = js.native
  
  def recognize(request: Key, body: RecognizeRequest): Request[RecognizeResponse] = js.native
  /** Performs synchronous speech recognition: receive results after all audio has been sent and processed. */
  def recognize(request: Oauthtoken): Request[RecognizeResponse] = js.native
}
