package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVTLDeviceTypeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the medium changer you have selected.
    */
  var VTLDeviceARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.VTLDeviceARN] = js.native
}

object UpdateVTLDeviceTypeOutput {
  @scala.inline
  def apply(): UpdateVTLDeviceTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVTLDeviceTypeOutput]
  }
  @scala.inline
  implicit class UpdateVTLDeviceTypeOutputOps[Self <: UpdateVTLDeviceTypeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVTLDeviceARN(value: VTLDeviceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVTLDeviceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VTLDeviceARN")(js.undefined)
        ret
    }
  }
  
}

