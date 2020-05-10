package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonymousIPResponse extends Response {
  var ip_address: js.UndefOr[String] = js.native
  val is_anonymous: js.UndefOr[Boolean] = js.native
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.native
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.native
  val is_hosting_provider: js.UndefOr[Boolean] = js.native
  val is_public_proxy: js.UndefOr[Boolean] = js.native
  val is_tor_exit_node: js.UndefOr[Boolean] = js.native
}

object AnonymousIPResponse {
  @scala.inline
  def apply(): AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonymousIPResponse]
  }
  @scala.inline
  implicit class AnonymousIPResponseOps[Self <: AnonymousIPResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_anonymous(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_anonymous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_anonymous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_anonymous")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_anonymous_proxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_anonymous_proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_anonymous_proxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_anonymous_proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_anonymous_vpn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_anonymous_vpn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_anonymous_vpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_anonymous_vpn")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_hosting_provider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_hosting_provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_hosting_provider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_hosting_provider")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_public_proxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_public_proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_public_proxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_public_proxy")(js.undefined)
        ret
    }
    @scala.inline
    def withIs_tor_exit_node(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_tor_exit_node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_tor_exit_node: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_tor_exit_node")(js.undefined)
        ret
    }
  }
  
}

