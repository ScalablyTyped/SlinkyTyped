package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalizeDeviceClaimResponse extends js.Object {
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.native
}

object FinalizeDeviceClaimResponse {
  @scala.inline
  def apply(): FinalizeDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinalizeDeviceClaimResponse]
  }
  @scala.inline
  implicit class FinalizeDeviceClaimResponseOps[Self <: FinalizeDeviceClaimResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

