package typingsSlinky.maxmind.responseMod

import typingsSlinky.maxmind.maxmindStrings.business
import typingsSlinky.maxmind.maxmindStrings.cafe
import typingsSlinky.maxmind.maxmindStrings.cellular
import typingsSlinky.maxmind.maxmindStrings.college
import typingsSlinky.maxmind.maxmindStrings.content_delivery_network
import typingsSlinky.maxmind.maxmindStrings.dialup
import typingsSlinky.maxmind.maxmindStrings.government
import typingsSlinky.maxmind.maxmindStrings.hosting
import typingsSlinky.maxmind.maxmindStrings.library
import typingsSlinky.maxmind.maxmindStrings.military
import typingsSlinky.maxmind.maxmindStrings.residential
import typingsSlinky.maxmind.maxmindStrings.router
import typingsSlinky.maxmind.maxmindStrings.school
import typingsSlinky.maxmind.maxmindStrings.search_engine_spider
import typingsSlinky.maxmind.maxmindStrings.traveler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraitsRecord extends js.Object {
  val autonomous_system_number: js.UndefOr[Double] = js.native
  val autonomous_system_organization: js.UndefOr[String] = js.native
  val domain: js.UndefOr[String] = js.native
  var ip_address: js.UndefOr[String] = js.native
  val is_anonymous: js.UndefOr[Boolean] = js.native
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.native
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.native
  val is_hosting_provider: js.UndefOr[Boolean] = js.native
  val is_legitimate_proxy: js.UndefOr[Boolean] = js.native
  val is_public_proxy: js.UndefOr[Boolean] = js.native
  val is_satellite_provider: js.UndefOr[Boolean] = js.native
  val is_tor_exit_node: js.UndefOr[Boolean] = js.native
  val isp: js.UndefOr[String] = js.native
  val organization: js.UndefOr[String] = js.native
  val user_type: js.UndefOr[
    business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
  ] = js.native
}

object TraitsRecord {
  @scala.inline
  def apply(): TraitsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraitsRecord]
  }
  @scala.inline
  implicit class TraitsRecordOps[Self <: TraitsRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutonomous_system_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autonomous_system_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutonomous_system_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autonomous_system_number")(js.undefined)
        ret
    }
    @scala.inline
    def withAutonomous_system_organization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autonomous_system_organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutonomous_system_organization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autonomous_system_organization")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
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
    def withIs_legitimate_proxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_legitimate_proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_legitimate_proxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_legitimate_proxy")(js.undefined)
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
    def withIs_satellite_provider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_satellite_provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_satellite_provider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_satellite_provider")(js.undefined)
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
    @scala.inline
    def withIsp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isp")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
        ret
    }
    @scala.inline
    def withUser_type(
      value: business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_type")(js.undefined)
        ret
    }
  }
  
}

