package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Port extends js.Object {
  var IP: String = js.native
  var PrivatePort: Double = js.native
  var PublicPort: Double = js.native
  var Type: String = js.native
}

object Port {
  @scala.inline
  def apply(IP: String, PrivatePort: Double, PublicPort: Double, Type: String): Port = {
    val __obj = js.Dynamic.literal(IP = IP.asInstanceOf[js.Any], PrivatePort = PrivatePort.asInstanceOf[js.Any], PublicPort = PublicPort.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  @scala.inline
  implicit class PortOps[Self <: Port] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivatePort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivatePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

