package typingsSlinky.bonjour.mod

import typingsSlinky.bonjour.bonjourStrings.udp4
import typingsSlinky.bonjour.bonjourStrings.udp6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BonjourOptions extends js.Object {
  var interface: js.UndefOr[String] = js.native
  var ip: js.UndefOr[String] = js.native
  var loopback: js.UndefOr[Boolean] = js.native
  var multicast: js.UndefOr[Boolean] = js.native
  var port: js.UndefOr[Double] = js.native
  var reuseAddr: js.UndefOr[Boolean] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[udp4 | udp6] = js.native
}

object BonjourOptions {
  @scala.inline
  def apply(): BonjourOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BonjourOptions]
  }
  @scala.inline
  implicit class BonjourOptionsOps[Self <: BonjourOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopback")(js.undefined)
        ret
    }
    @scala.inline
    def withMulticast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicast")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withReuseAddr(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseAddr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReuseAddr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reuseAddr")(js.undefined)
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: udp4 | udp6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

