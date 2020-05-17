package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAvailable extends js.Object {
  /** 网络是否可用 */
  var networkAvailable: Boolean = js.native
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType = js.native
}

object NetworkAvailable {
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: NetworkType): NetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAvailable]
  }
  @scala.inline
  implicit class NetworkAvailableOps[Self <: NetworkAvailable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkType(value: NetworkType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

