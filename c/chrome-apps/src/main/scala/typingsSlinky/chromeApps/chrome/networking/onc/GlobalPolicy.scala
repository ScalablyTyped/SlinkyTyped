package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalPolicy extends js.Object {
  /**
    * If true, only policy networks may auto connect.
    * @default false
    */
  var AllowOnlyPolicyNetworksToAutoconnect: js.UndefOr[Boolean] = js.native
  /**
    * If true, only policy networks may be connected to
    * and no new networks may be added or configured.
    * @default false
    */
  var AllowOnlyPolicyNetworksToConnect: js.UndefOr[Boolean] = js.native
  /**
    * List of blacklisted networks.
    * Connections to blacklisted networks are prohibited.
    * Networks can be whitelisted again by specifying an explicit network configuration.
    * @default []
    */
  var BlacklistedHexSSIDs: js.UndefOr[js.Array[String]] = js.native
}

object GlobalPolicy {
  @scala.inline
  def apply(): GlobalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPolicy]
  }
  @scala.inline
  implicit class GlobalPolicyOps[Self <: GlobalPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowOnlyPolicyNetworksToAutoconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowOnlyPolicyNetworksToAutoconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOnlyPolicyNetworksToAutoconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowOnlyPolicyNetworksToAutoconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowOnlyPolicyNetworksToConnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowOnlyPolicyNetworksToConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowOnlyPolicyNetworksToConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowOnlyPolicyNetworksToConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withBlacklistedHexSSIDs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlacklistedHexSSIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklistedHexSSIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlacklistedHexSSIDs")(js.undefined)
        ret
    }
  }
  
}

