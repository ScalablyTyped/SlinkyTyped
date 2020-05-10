package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortBinding extends js.Object {
  var HostIp: js.UndefOr[String] = js.native
  var HostPort: js.UndefOr[String] = js.native
}

object PortBinding {
  @scala.inline
  def apply(): PortBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortBinding]
  }
  @scala.inline
  implicit class PortBindingOps[Self <: PortBinding] (val x: Self) extends AnyVal {
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
    def withoutHostIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostIp")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostPort")(js.undefined)
        ret
    }
  }
  
}

