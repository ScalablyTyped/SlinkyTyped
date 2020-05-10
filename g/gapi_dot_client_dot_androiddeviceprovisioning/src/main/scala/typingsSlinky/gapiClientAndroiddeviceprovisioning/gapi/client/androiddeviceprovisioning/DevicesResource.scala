package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroiddeviceprovisioning.AnonAccesstoken
import typingsSlinky.gapiClientAndroiddeviceprovisioning.AnonBearertoken
import typingsSlinky.gapiClientAndroiddeviceprovisioning.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: AnonBearertoken): Request_[ClaimDeviceResponse] = js.native
  /** Claim devices asynchronously. */
  def claimAsync(request: AnonBearertoken): Request_[Operation] = js.native
  /** Find devices by device identifier. */
  def findByIdentifier(request: AnonBearertoken): Request_[FindDevicesByDeviceIdentifierResponse] = js.native
  /** Find devices by ownership. */
  def findByOwner(request: AnonBearertoken): Request_[FindDevicesByOwnerResponse] = js.native
  /** Get a device. */
  def get(request: AnonAccesstoken): Request_[Device] = js.native
  /** Update the metadata. */
  def metadata(request: AnonCallback): Request_[DeviceMetadata] = js.native
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: AnonBearertoken): Request_[js.Object] = js.native
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: AnonBearertoken): Request_[Operation] = js.native
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: AnonBearertoken): Request_[Operation] = js.native
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: AnonBearertoken => Request_[ClaimDeviceResponse],
    claimAsync: AnonBearertoken => Request_[Operation],
    findByIdentifier: AnonBearertoken => Request_[FindDevicesByDeviceIdentifierResponse],
    findByOwner: AnonBearertoken => Request_[FindDevicesByOwnerResponse],
    get: AnonAccesstoken => Request_[Device],
    metadata: AnonCallback => Request_[DeviceMetadata],
    unclaim: AnonBearertoken => Request_[js.Object],
    unclaimAsync: AnonBearertoken => Request_[Operation],
    updateMetadataAsync: AnonBearertoken => Request_[Operation]
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
    def withClaim(value: AnonBearertoken => Request_[ClaimDeviceResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClaimAsync(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindByIdentifier(value: AnonBearertoken => Request_[FindDevicesByDeviceIdentifierResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findByIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindByOwner(value: AnonBearertoken => Request_[FindDevicesByOwnerResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findByOwner")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[Device]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMetadata(value: AnonCallback => Request_[DeviceMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnclaim(value: AnonBearertoken => Request_[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaim")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnclaimAsync(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaimAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateMetadataAsync(value: AnonBearertoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMetadataAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

