package typingsSlinky.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBluetoothAdapterStateChangeCallbackResult extends js.Object {
  /** 蓝牙适配器是否可用 */
  var available: Boolean = js.native
  /** 蓝牙适配器是否处于搜索状态 */
  var discovering: Boolean = js.native
}

object OnBluetoothAdapterStateChangeCallbackResult {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): OnBluetoothAdapterStateChangeCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBluetoothAdapterStateChangeCallbackResult]
  }
  @scala.inline
  implicit class OnBluetoothAdapterStateChangeCallbackResultOps[Self <: OnBluetoothAdapterStateChangeCallbackResult] (val x: Self) extends AnyVal {
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

