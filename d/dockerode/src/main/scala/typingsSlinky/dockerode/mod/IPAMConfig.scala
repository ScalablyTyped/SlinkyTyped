package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* tslint:disable:interface-name */
@js.native
trait IPAMConfig extends js.Object {
  var IPv4Address: js.UndefOr[String] = js.native
  var IPv6Address: js.UndefOr[String] = js.native
  var LinkLocalIPs: js.UndefOr[js.Array[String]] = js.native
}

object IPAMConfig {
  @scala.inline
  def apply(): IPAMConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPAMConfig]
  }
  @scala.inline
  implicit class IPAMConfigOps[Self <: IPAMConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPv4Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv4Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPv4Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv4Address")(js.undefined)
        ret
    }
    @scala.inline
    def withIPv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPv6Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6Address")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkLocalIPs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkLocalIPs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkLocalIPs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LinkLocalIPs")(js.undefined)
        ret
    }
  }
  
}

