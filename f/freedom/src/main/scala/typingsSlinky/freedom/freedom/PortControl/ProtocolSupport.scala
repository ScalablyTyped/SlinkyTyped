package typingsSlinky.freedom.freedom.PortControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// An object returned by probeProtocolSupport()
@js.native
trait ProtocolSupport extends js.Object {
  var natPmp: Boolean = js.native
  var pcp: Boolean = js.native
  var upnp: Boolean = js.native
}

object ProtocolSupport {
  @scala.inline
  def apply(natPmp: Boolean, pcp: Boolean, upnp: Boolean): ProtocolSupport = {
    val __obj = js.Dynamic.literal(natPmp = natPmp.asInstanceOf[js.Any], pcp = pcp.asInstanceOf[js.Any], upnp = upnp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolSupport]
  }
  @scala.inline
  implicit class ProtocolSupportOps[Self <: ProtocolSupport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNatPmp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natPmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPcp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pcp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpnp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upnp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

