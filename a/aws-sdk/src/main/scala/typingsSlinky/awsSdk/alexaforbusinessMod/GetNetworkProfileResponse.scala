package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkProfileResponse extends js.Object {
  /**
    * The network profile associated with a device.
    */
  var NetworkProfile: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.NetworkProfile] = js.native
}

object GetNetworkProfileResponse {
  @scala.inline
  def apply(NetworkProfile: NetworkProfile = null): GetNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (NetworkProfile != null) __obj.updateDynamic("NetworkProfile")(NetworkProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkProfileResponse]
  }
}

