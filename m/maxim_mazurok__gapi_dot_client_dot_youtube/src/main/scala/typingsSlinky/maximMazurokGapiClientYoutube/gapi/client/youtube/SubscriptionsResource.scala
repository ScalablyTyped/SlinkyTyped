package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Alt
import typingsSlinky.maximMazurokGapiClientYoutube.anon.ForChannelId
import typingsSlinky.maximMazurokGapiClientYoutube.anon.QuotaUserResource
import typingsSlinky.maximMazurokGapiClientYoutube.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends js.Object {
  
  /** Deletes a resource. */
  def delete(): Request[Unit] = js.native
  def delete(request: Uploadprotocol): Request[Unit] = js.native
  
  def insert(request: Alt, body: Subscription): Request[Subscription] = js.native
  /** Inserts a new resource into this collection. */
  def insert(request: QuotaUserResource): Request[Subscription] = js.native
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[SubscriptionListResponse] = js.native
  def list(request: ForChannelId): Request[SubscriptionListResponse] = js.native
}
