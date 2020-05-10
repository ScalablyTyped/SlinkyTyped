package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBluetoothAdapterStateSuccessCallbackResult extends js.Object {
  /** 蓝牙适配器是否可用 */
  var available: Boolean = js.native
  /** 是否正在搜索设备 */
  var discovering: Boolean = js.native
}

object GetBluetoothAdapterStateSuccessCallbackResult {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): GetBluetoothAdapterStateSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetBluetoothAdapterStateSuccessCallbackResultOps[Self <: GetBluetoothAdapterStateSuccessCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("available")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscovering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discovering")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

