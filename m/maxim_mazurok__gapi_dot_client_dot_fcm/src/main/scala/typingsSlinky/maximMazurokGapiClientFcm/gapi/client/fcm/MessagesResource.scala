package typingsSlinky.maximMazurokGapiClientFcm.gapi.client.fcm

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientFcm.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientFcm.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends js.Object {
  
  /** Send a message to specified target (a registration token, topic or condition). */
  def send(request: Accesstoken): Request[Message] = js.native
  def send(request: Alt, body: SendMessageRequest): Request[Message] = js.native
}
