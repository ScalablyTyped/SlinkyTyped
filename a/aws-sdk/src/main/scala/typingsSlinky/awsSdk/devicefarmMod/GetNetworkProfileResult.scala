package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkProfileResult extends js.Object {
  /**
    * The network profile.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
}

object GetNetworkProfileResult {
  @scala.inline
  def apply(): GetNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkProfileResult]
  }
  @scala.inline
  implicit class GetNetworkProfileResultOps[Self <: GetNetworkProfileResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkProfile(value: NetworkProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfile")(js.undefined)
        ret
    }
  }
  
}

