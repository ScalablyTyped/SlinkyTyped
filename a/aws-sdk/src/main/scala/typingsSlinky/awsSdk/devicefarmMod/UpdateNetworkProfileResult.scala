package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNetworkProfileResult extends js.Object {
  /**
    * A list of the available network profiles.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.native
}

object UpdateNetworkProfileResult {
  @scala.inline
  def apply(): UpdateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNetworkProfileResult]
  }
  @scala.inline
  implicit class UpdateNetworkProfileResultOps[Self <: UpdateNetworkProfileResult] (val x: Self) extends AnyVal {
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

