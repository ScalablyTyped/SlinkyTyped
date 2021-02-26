package typingsSlinky.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Key
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.OrderBy
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Resource
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.UploadType
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends StObject {
  
  def cancelWipe(request: Key, body: GoogleAppsCloudidentityDevicesV1CancelWipeDeviceRequest): Request[Operation] = js.native
  /**
    * Cancels an unfinished device wipe. This operation can be used to cancel device wipe in the gap between the wipe operation returning success and the device being wiped. This
    * operation is possible when the device is in a "pending wipe" state. The device enters the "pending wipe" state when a wipe device command is issued, but has not yet been sent to the
    * device. The cancel wipe will fail if the wipe command has already been issued to the device.
    */
  def cancelWipe(request: QuotaUser): Request[Operation] = js.native
  
  /** Creates a device. Only company-owned device may be created. */
  def create(request: Resource): Request[Operation] = js.native
  def create(request: UploadType, body: GoogleAppsCloudidentityDevicesV1Device): Request[Operation] = js.native
  
  /** Deletes the specified device. */
  def delete(): Request[Operation] = js.native
  def delete(request: Accesstoken): Request[Operation] = js.native
  
  var deviceUsers: DeviceUsersResource = js.native
  
  /** Retrieves the specified device. */
  def get(): Request[GoogleAppsCloudidentityDevicesV1Device] = js.native
  def get(request: Accesstoken): Request[GoogleAppsCloudidentityDevicesV1Device] = js.native
  
  /** Lists/Searches devices. */
  def list(): Request[GoogleAppsCloudidentityDevicesV1ListDevicesResponse] = js.native
  def list(request: OrderBy): Request[GoogleAppsCloudidentityDevicesV1ListDevicesResponse] = js.native
  
  def wipe(request: Key, body: GoogleAppsCloudidentityDevicesV1WipeDeviceRequest): Request[Operation] = js.native
  /** Wipes all data on the specified device. */
  def wipe(request: Uploadprotocol): Request[Operation] = js.native
}
