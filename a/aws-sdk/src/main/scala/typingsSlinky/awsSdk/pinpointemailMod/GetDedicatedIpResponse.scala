package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDedicatedIpResponse extends js.Object {
  /**
    * An object that contains information about a dedicated IP address.
    */
  var DedicatedIp: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.DedicatedIp] = js.native
}

object GetDedicatedIpResponse {
  @scala.inline
  def apply(): GetDedicatedIpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDedicatedIpResponse]
  }
  @scala.inline
  implicit class GetDedicatedIpResponseOps[Self <: GetDedicatedIpResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDedicatedIp(value: DedicatedIp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDedicatedIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DedicatedIp")(js.undefined)
        ret
    }
  }
  
}

