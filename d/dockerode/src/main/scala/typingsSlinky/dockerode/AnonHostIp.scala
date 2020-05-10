package typingsSlinky.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHostIp extends js.Object {
  var HostIp: String = js.native
  var HostPort: String = js.native
}

object AnonHostIp {
  @scala.inline
  def apply(HostIp: String, HostPort: String): AnonHostIp = {
    val __obj = js.Dynamic.literal(HostIp = HostIp.asInstanceOf[js.Any], HostPort = HostPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostIp]
  }
  @scala.inline
  implicit class AnonHostIpOps[Self <: AnonHostIp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostPort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

