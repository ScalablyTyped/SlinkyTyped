package typingsSlinky.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientTrafficdirector.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientTrafficdirector.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveryResource extends js.Object {
  
  def client_status(request: Accesstoken): Request[ClientStatusResponse] = js.native
  def client_status(request: Alt, body: ClientStatusRequest): Request[ClientStatusResponse] = js.native
}
