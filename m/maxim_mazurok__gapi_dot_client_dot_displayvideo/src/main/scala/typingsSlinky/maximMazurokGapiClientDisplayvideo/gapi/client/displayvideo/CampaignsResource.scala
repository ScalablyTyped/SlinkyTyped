package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Alt
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Callback
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.CampaignId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Fields
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignsResource extends StObject {
  
  def create(request: AdvertiserId, body: Campaign): Request[Campaign] = js.native
  /** Creates a new campaign. Returns the newly created campaign if successful. */
  def create(request: Alt): Request[Campaign] = js.native
  
  /**
    * Permanently deletes a campaign. A deleted campaign cannot be recovered. The campaign should be archived first, i.e. set entity_status to `ENTITY_STATUS_ARCHIVED`, to be able to
    * delete it.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a campaign. */
  def get(): Request[Campaign] = js.native
  def get(request: Callback): Request[Campaign] = js.native
  
  /**
    * Lists campaigns in an advertiser. The order is defined by the order_by parameter. If a filter by entity_status is not specified, campaigns with `ENTITY_STATUS_ARCHIVED` will not be
    * included in the results.
    */
  def list(): Request[ListCampaignsResponse] = js.native
  def list(request: Fields): Request[ListCampaignsResponse] = js.native
  
  /** Updates an existing campaign. Returns the updated campaign if successful. */
  def patch(request: CampaignId): Request[Campaign] = js.native
  def patch(request: Key, body: Campaign): Request[Campaign] = js.native
}
