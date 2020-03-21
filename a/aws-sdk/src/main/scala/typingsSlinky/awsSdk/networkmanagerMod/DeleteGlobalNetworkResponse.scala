package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalNetworkResponse extends js.Object {
  /**
    * Information about the global network.
    */
  var GlobalNetwork: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.GlobalNetwork] = js.native
}

object DeleteGlobalNetworkResponse {
  @scala.inline
  def apply(GlobalNetwork: GlobalNetwork = null): DeleteGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    if (GlobalNetwork != null) __obj.updateDynamic("GlobalNetwork")(GlobalNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalNetworkResponse]
  }
}

