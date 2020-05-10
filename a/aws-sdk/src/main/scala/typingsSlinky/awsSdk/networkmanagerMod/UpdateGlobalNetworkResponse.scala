package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalNetworkResponse extends js.Object {
  /**
    * Information about the global network object.
    */
  var GlobalNetwork: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.GlobalNetwork] = js.native
}

object UpdateGlobalNetworkResponse {
  @scala.inline
  def apply(): UpdateGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalNetworkResponse]
  }
  @scala.inline
  implicit class UpdateGlobalNetworkResponseOps[Self <: UpdateGlobalNetworkResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalNetwork(value: GlobalNetwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetwork")(js.undefined)
        ret
    }
  }
  
}

