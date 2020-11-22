package typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.AccesstokenAlt
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Alt
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.AltCallback
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Callback
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.DeviceId
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.MetadataOwnerId
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.PageSize
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Parent
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.PartnerId
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.PrettyPrint
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Resource
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.UploadType
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Uploadprotocol
import typingsSlinky.maximMazurokGapiClientAndroiddeviceprovisioning.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicesResource extends js.Object {
  
  def applyConfiguration(request: Alt, body: CustomerApplyConfigurationRequest): Request[js.Object] = js.native
  /**
    * Applies a Configuration to the device to register the device for zero-touch enrollment. After applying a configuration to a device, the device automatically provisions itself on
    * first boot, or next factory reset.
    */
  def applyConfiguration(request: Oauthtoken): Request[js.Object] = js.native
  
  /** Claims a device for a customer and adds it to zero-touch enrollment. If the device is already claimed by another customer, the call returns an error. */
  def claim(request: PartnerId): Request[ClaimDeviceResponse] = js.native
  def claim(request: QuotaUser, body: ClaimDeviceRequest): Request[ClaimDeviceResponse] = js.native
  
  def claimAsync(request: QuotaUser, body: ClaimDevicesRequest): Request[Operation] = js.native
  /**
    * Claims a batch of devices for a customer asynchronously. Adds the devices to zero-touch enrollment. To learn more, read [Long‑running batch
    * operations](/zero-touch/guides/how-it-works#operations).
    */
  def claimAsync(request: Resource): Request[Operation] = js.native
  
  def findByIdentifier(request: QuotaUser, body: FindDevicesByDeviceIdentifierRequest): Request[FindDevicesByDeviceIdentifierResponse] = js.native
  /** Finds devices by hardware identifiers, such as IMEI. */
  def findByIdentifier(request: UploadType): Request[FindDevicesByDeviceIdentifierResponse] = js.native
  
  def findByOwner(request: QuotaUser, body: FindDevicesByOwnerRequest): Request[FindDevicesByOwnerResponse] = js.native
  /**
    * Finds devices claimed for customers. The results only contain devices registered to the reseller that's identified by the `partnerId` argument. The customer's devices purchased from
    * other resellers don't appear in the results.
    */
  def findByOwner(request: Uploadprotocol): Request[FindDevicesByOwnerResponse] = js.native
  
  /** Gets the details of a device. */
  def get(): Request[Device] = js.native
  def get(request: Callback): Request[Device] = js.native
  
  /** Lists a customer's devices. */
  def list(): Request[CustomerListDevicesResponse] = js.native
  def list(request: PageSize): Request[CustomerListDevicesResponse] = js.native
  
  /** Updates reseller metadata associated with the device. */
  def metadata(request: DeviceId): Request[DeviceMetadata] = js.native
  def metadata(request: MetadataOwnerId, body: UpdateDeviceMetadataRequest): Request[DeviceMetadata] = js.native
  
  def removeConfiguration(request: Alt, body: CustomerRemoveConfigurationRequest): Request[js.Object] = js.native
  /** Removes a configuration from device. */
  def removeConfiguration(request: Parent): Request[js.Object] = js.native
  
  def unclaim(request: Alt, body: CustomerUnclaimDeviceRequest): Request[js.Object] = js.native
  /**
    * Unclaims a device from a customer and removes it from zero-touch enrollment. After removing a device, a customer must contact their reseller to register the device into zero-touch
    * enrollment again.
    */
  def unclaim(request: PrettyPrint): Request[js.Object] = js.native
  def unclaim(request: QuotaUser, body: UnclaimDeviceRequest): Request[js.Object] = js.native
  /** Unclaims a device from a customer and removes it from zero-touch enrollment. */
  def unclaim(request: Xgafv): Request[js.Object] = js.native
  
  /**
    * Unclaims a batch of devices for a customer asynchronously. Removes the devices from zero-touch enrollment. To learn more, read [Long‑running batch
    * operations](/zero-touch/guides/how-it-works#operations).
    */
  def unclaimAsync(request: AccesstokenAlt): Request[Operation] = js.native
  def unclaimAsync(request: QuotaUser, body: UnclaimDevicesRequest): Request[Operation] = js.native
  
  /**
    * Updates the reseller metadata attached to a batch of devices. This method updates devices asynchronously and returns an `Operation` that can be used to track progress. Read
    * [Long‑running batch operations](/zero-touch/guides/how-it-works#operations).
    */
  def updateMetadataAsync(request: AltCallback): Request[Operation] = js.native
  def updateMetadataAsync(request: QuotaUser, body: UpdateDeviceMetadataInBatchRequest): Request[Operation] = js.native
}
