package typingsSlinky.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTexttospeech.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoicesResource extends js.Object {
  
  /** Returns a list of Voice supported for synthesis. */
  def list(): Request[ListVoicesResponse] = js.native
  def list(request: Callback): Request[ListVoicesResponse] = js.native
}
