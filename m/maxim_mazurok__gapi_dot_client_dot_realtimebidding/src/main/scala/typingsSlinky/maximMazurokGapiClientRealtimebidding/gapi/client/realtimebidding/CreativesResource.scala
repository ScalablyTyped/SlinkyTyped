package typingsSlinky.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Alt
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Callback
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Fields
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Key
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Name
import typingsSlinky.maximMazurokGapiClientRealtimebidding.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends js.Object {
  
  def create(request: Callback, body: Creative): Request[Creative] = js.native
  /** Creates a creative. */
  def create(request: Fields): Request[Creative] = js.native
  
  /** Gets a creative. */
  def get(): Request[Creative] = js.native
  def get(request: Key): Request[Creative] = js.native
  
  /** Lists creatives. */
  def list(): Request[ListCreativesResponse] = js.native
  def list(request: Accesstoken): Request[ListCreativesResponse] = js.native
  
  /** Updates a creative. */
  def patch(request: Name): Request[Creative] = js.native
  def patch(request: Oauthtoken, body: Creative): Request[Creative] = js.native
  
  /**
    * Watches all creatives pertaining to a bidder. It is sufficient to invoke this endpoint once per bidder. A Pub/Sub topic will be created and notifications will be pushed to the topic
    * when any of the bidder's creatives change status. All of the bidder's service accounts will have access to read from the topic. Subsequent invocations of this method will return the
    * existing Pub/Sub configuration.
    */
  def watch(request: Alt): Request[WatchCreativesResponse] = js.native
  def watch(request: Callback, body: WatchCreativesRequest): Request[WatchCreativesResponse] = js.native
}
