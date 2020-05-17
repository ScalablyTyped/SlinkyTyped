package typingsSlinky.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceData extends js.Object {
  var deviceData: js.UndefOr[String] = js.native
}

object DeviceData {
  @scala.inline
  def apply(): DeviceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceData]
  }
  @scala.inline
  implicit class DeviceDataOps[Self <: DeviceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceData")(js.undefined)
        ret
    }
  }
  
}

