package typingsSlinky.openfin.proxyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxySystemInfo extends js.Object {
  var autoConfigUrl: String = js.native
  var bypass: String = js.native
  var enabled: Boolean = js.native
  var proxy: String = js.native
}

object ProxySystemInfo {
  @scala.inline
  def apply(autoConfigUrl: String, bypass: String, enabled: Boolean, proxy: String): ProxySystemInfo = {
    val __obj = js.Dynamic.literal(autoConfigUrl = autoConfigUrl.asInstanceOf[js.Any], bypass = bypass.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxySystemInfo]
  }
  @scala.inline
  implicit class ProxySystemInfoOps[Self <: ProxySystemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoConfigUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConfigUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBypass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

