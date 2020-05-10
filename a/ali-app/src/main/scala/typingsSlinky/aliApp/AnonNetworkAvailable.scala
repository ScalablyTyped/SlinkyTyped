package typingsSlinky.aliApp

import typingsSlinky.aliApp.my.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNetworkAvailable extends js.Object {
  /** 网络是否可用 */
  var networkAvailable: Boolean = js.native
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType = js.native
}

object AnonNetworkAvailable {
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: NetworkType): AnonNetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNetworkAvailable]
  }
  @scala.inline
  implicit class AnonNetworkAvailableOps[Self <: AnonNetworkAvailable] (val x: Self) extends AnyVal {
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

