package typingsSlinky.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientPubsublite.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientPubsublite.anon.Alt
import typingsSlinky.maximMazurokGapiClientPubsublite.anon.Callback
import typingsSlinky.maximMazurokGapiClientPubsublite.anon.Fields
import typingsSlinky.maximMazurokGapiClientPubsublite.anon.Key
import typingsSlinky.maximMazurokGapiClientPubsublite.anon.Name
import typingsSlinky.maximMazurokGapiClientPubsublite.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionsResource extends StObject {
  
  /** Creates a new subscription. */
  def create(request: Accesstoken): Request[Subscription] = js.native
  def create(request: Alt, body: Subscription): Request[Subscription] = js.native
  
  var cursors: CursorsResource = js.native
  
  /** Deletes the specified subscription. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Returns the subscription configuration. */
  def get(): Request[Subscription] = js.native
  def get(request: Callback): Request[Subscription] = js.native
  
  /** Returns the list of subscriptions for the given project. */
  /** Lists the subscriptions attached to the specified topic. */
  def list(): Request[ListSubscriptionsResponse] = js.native
  def list(request: Fields): Request[ListSubscriptionsResponse] = js.native
  def list(request: Oauthtoken): Request[ListTopicSubscriptionsResponse] = js.native
  
  /** Updates properties of the specified subscription. */
  def patch(request: Key): Request[Subscription] = js.native
  def patch(request: Name, body: Subscription): Request[Subscription] = js.native
}
