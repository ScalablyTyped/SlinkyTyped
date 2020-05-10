package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGetWifiListCallbackResult extends js.Object {
  /** Wi-Fi 列表数据 */
  var wifiList: Array[WifiInfo] = js.native
}

object OnGetWifiListCallbackResult {
  @scala.inline
  def apply(wifiList: Array[WifiInfo]): OnGetWifiListCallbackResult = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetWifiListCallbackResult]
  }
  @scala.inline
  implicit class OnGetWifiListCallbackResultOps[Self <: OnGetWifiListCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWifiList(value: Array[WifiInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wifiList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

