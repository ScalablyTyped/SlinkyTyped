package typingsSlinky.maximMazurokGapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDns.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientDns.anon.Alt
import typingsSlinky.maximMazurokGapiClientDns.anon.Callback
import typingsSlinky.maximMazurokGapiClientDns.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesResource extends js.Object {
  
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: Accesstoken): Request[Change] = js.native
  def create(request: Alt, body: Change): Request[Change] = js.native
  
  /** Fetch the representation of an existing Change. */
  def get(): Request[Change] = js.native
  def get(request: Callback): Request[Change] = js.native
  
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(): Request[ChangesListResponse] = js.native
  def list(request: Fields): Request[ChangesListResponse] = js.native
}
