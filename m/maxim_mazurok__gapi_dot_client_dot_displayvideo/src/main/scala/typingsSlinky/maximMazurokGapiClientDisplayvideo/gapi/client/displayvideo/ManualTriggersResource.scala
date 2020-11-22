package typingsSlinky.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AccesstokenAdvertiserIdAlt
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.Fields
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.QuotaUserTriggerId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.ResourceTriggerId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.TriggerId
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.TriggerIdUpdateMask
import typingsSlinky.maximMazurokGapiClientDisplayvideo.anon.UploadprotocolXgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualTriggersResource extends js.Object {
  
  def activate(request: QuotaUserTriggerId, body: ActivateManualTriggerRequest): Request[ManualTrigger] = js.native
  /** Activates a manual trigger. Each activation of the manual trigger must be at least 5 minutes apart, otherwise an error will be returned. */
  def activate(request: TriggerId): Request[ManualTrigger] = js.native
  
  def create(request: AdvertiserId, body: ManualTrigger): Request[ManualTrigger] = js.native
  /** Creates a new manual trigger. Returns the newly created manual trigger if successful. */
  def create(request: UploadprotocolXgafv): Request[ManualTrigger] = js.native
  
  def deactivate(request: QuotaUserTriggerId, body: DeactivateManualTriggerRequest): Request[ManualTrigger] = js.native
  /** Deactivates a manual trigger. */
  def deactivate(request: ResourceTriggerId): Request[ManualTrigger] = js.native
  
  /** Gets a manual trigger. */
  def get(): Request[ManualTrigger] = js.native
  def get(request: QuotaUserTriggerId): Request[ManualTrigger] = js.native
  
  /** Lists manual triggers that are accessible to the current user for a given advertiser ID. The order is defined by the order_by parameter. A single advertiser_id is required. */
  def list(): Request[ListManualTriggersResponse] = js.native
  def list(request: Fields): Request[ListManualTriggersResponse] = js.native
  
  def patch(request: AccesstokenAdvertiserIdAlt, body: ManualTrigger): Request[ManualTrigger] = js.native
  /** Updates a manual trigger. Returns the updated manual trigger if successful. */
  def patch(request: TriggerIdUpdateMask): Request[ManualTrigger] = js.native
}
