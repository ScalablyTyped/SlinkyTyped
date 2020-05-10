package typingsSlinky.awsSdk.iot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeviceResponse extends js.Object {
  /**
    * Device details.
    */
  var DeviceDescription: js.UndefOr[typingsSlinky.awsSdk.iot1clickdevicesserviceMod.DeviceDescription] = js.native
}

object DescribeDeviceResponse {
  @scala.inline
  def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  @scala.inline
  implicit class DescribeDeviceResponseOps[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceDescription(value: DeviceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeviceDescription")(js.undefined)
        ret
    }
  }
  
}

