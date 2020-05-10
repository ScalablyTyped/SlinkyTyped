package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBluetoothAdapterStateOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetBluetoothAdapterStateOptions(res: BluetoothAdapterStateData): Unit = js.native
}

object GetBluetoothAdapterStateOptions {
  @scala.inline
  def apply(success: BluetoothAdapterStateData => Unit): GetBluetoothAdapterStateOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBluetoothAdapterStateOptions]
  }
  @scala.inline
  implicit class GetBluetoothAdapterStateOptionsOps[Self <: GetBluetoothAdapterStateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: BluetoothAdapterStateData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

