package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroiddeviceprovisioning.anon.Accesstoken
import typingsSlinky.gapiClientAndroiddeviceprovisioning.anon.Bearertoken
import typingsSlinky.gapiClientAndroiddeviceprovisioning.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: Bearertoken): Request[ClaimDeviceResponse] = js.native
  /** Claim devices asynchronously. */
  def claimAsync(request: Bearertoken): Request[Operation] = js.native
  /** Find devices by device identifier. */
  def findByIdentifier(request: Bearertoken): Request[FindDevicesByDeviceIdentifierResponse] = js.native
  /** Find devices by ownership. */
  def findByOwner(request: Bearertoken): Request[FindDevicesByOwnerResponse] = js.native
  /** Get a device. */
  def get(request: Accesstoken): Request[Device] = js.native
  /** Update the metadata. */
  def metadata(request: Callback): Request[DeviceMetadata] = js.native
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: Bearertoken): Request[js.Object] = js.native
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: Bearertoken): Request[Operation] = js.native
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: Bearertoken): Request[Operation] = js.native
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: Bearertoken => Request[ClaimDeviceResponse],
    claimAsync: Bearertoken => Request[Operation],
    findByIdentifier: Bearertoken => Request[FindDevicesByDeviceIdentifierResponse],
    findByOwner: Bearertoken => Request[FindDevicesByOwnerResponse],
    get: Accesstoken => Request[Device],
    metadata: Callback => Request[DeviceMetadata],
    unclaim: Bearertoken => Request[js.Object],
    unclaimAsync: Bearertoken => Request[Operation],
    updateMetadataAsync: Bearertoken => Request[Operation]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(claim = js.Any.fromFunction1(claim), claimAsync = js.Any.fromFunction1(claimAsync), findByIdentifier = js.Any.fromFunction1(findByIdentifier), findByOwner = js.Any.fromFunction1(findByOwner), get = js.Any.fromFunction1(get), metadata = js.Any.fromFunction1(metadata), unclaim = js.Any.fromFunction1(unclaim), unclaimAsync = js.Any.fromFunction1(unclaimAsync), updateMetadataAsync = js.Any.fromFunction1(updateMetadataAsync))
    __obj.asInstanceOf[DevicesResource]
  }
  @scala.inline
  implicit class DevicesResourceOps[Self <: DevicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaim(value: Bearertoken => Request[ClaimDeviceResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClaimAsync(value: Bearertoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindByIdentifier(value: Bearertoken => Request[FindDevicesByDeviceIdentifierResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findByIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindByOwner(value: Bearertoken => Request[FindDevicesByOwnerResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findByOwner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMetadata(value: Callback => Request[DeviceMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnclaim(value: Bearertoken => Request[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaim")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnclaimAsync(value: Bearertoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaimAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMetadataAsync(value: Bearertoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMetadataAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

