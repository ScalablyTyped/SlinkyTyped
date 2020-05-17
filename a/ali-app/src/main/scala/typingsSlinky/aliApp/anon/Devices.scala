package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Devices extends js.Object {
  var devices: js.Array[BluetoothDevice] = js.native
}

object Devices {
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  @scala.inline
  implicit class DevicesOps[Self <: Devices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: js.Array[BluetoothDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

