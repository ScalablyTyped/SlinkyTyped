package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexchangebuyer2.anon.CreativeId
import typingsSlinky.gapiClientAdexchangebuyer2.anon.CreativeStatusId
import typingsSlinky.gapiClientAdexchangebuyer2.anon.DuplicateIdMode
import typingsSlinky.gapiClientAdexchangebuyer2.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends js.Object {
  
  /** Creates a creative. */
  def create(request: DuplicateIdMode): Request[Creative] = js.native
  
  var dealAssociations: DealAssociationsResource = js.native
  
  /** Gets a creative. */
  def get(request: CreativeId): Request[Creative] = js.native
  
  /**
    * List all creatives associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each creative.
    */
  def list(request: CreativeStatusId): Request[ListCreativeStatusBreakdownByCreativeResponse] = js.native
  /** Lists creatives. */
  def list(request: Oauthtoken): Request[ListCreativesResponse] = js.native
  
  /**
    * Stops watching a creative. Will stop push notifications being sent to the
    * topics when the creative changes status.
    */
  def stopWatching(request: CreativeId): Request[js.Object] = js.native
  
  /** Updates a creative. */
  def update(request: CreativeId): Request[Creative] = js.native
  
  /**
    * Watches a creative. Will result in push notifications being sent to the
    * topic when the creative changes status.
    */
  def watch(request: CreativeId): Request[js.Object] = js.native
}
