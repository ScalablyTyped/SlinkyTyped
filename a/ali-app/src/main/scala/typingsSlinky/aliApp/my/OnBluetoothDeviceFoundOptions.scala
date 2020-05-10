package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.AnonDevices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBluetoothDeviceFoundOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OnBluetoothDeviceFoundOptions: js.UndefOr[js.Function1[/* res */ AnonDevices, Unit]] = js.native
}

object OnBluetoothDeviceFoundOptions {
  @scala.inline
  def apply(): OnBluetoothDeviceFoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBluetoothDeviceFoundOptions]
  }
  @scala.inline
  implicit class OnBluetoothDeviceFoundOptionsOps[Self <: OnBluetoothDeviceFoundOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ AnonDevices => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

