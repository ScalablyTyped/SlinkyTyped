package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedProxyLocation extends js.Object {
  /** The proxy IP address host. */
  var Host: js.UndefOr[ManagedDOMString] = js.native
  /** The port to use for the proxy */
  var Port: js.UndefOr[ManagedLong] = js.native
}

object ManagedProxyLocation {
  @scala.inline
  def apply(): ManagedProxyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedProxyLocation]
  }
  @scala.inline
  implicit class ManagedProxyLocationOps[Self <: ManagedProxyLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: ManagedDOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: ManagedLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
  }
  
}

