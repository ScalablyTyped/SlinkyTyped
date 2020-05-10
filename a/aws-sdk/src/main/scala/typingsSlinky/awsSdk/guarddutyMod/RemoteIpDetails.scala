package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteIpDetails extends js.Object {
  /**
    * City information of the remote IP address.
    */
  var City: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.City] = js.native
  /**
    * Country code of the remote IP address.
    */
  var Country: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Country] = js.native
  /**
    * Location information of the remote IP address.
    */
  var GeoLocation: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.GeoLocation] = js.native
  /**
    * IPV4 remote address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
  /**
    * ISP Organization information of the remote IP address.
    */
  var Organization: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.Organization] = js.native
}

object RemoteIpDetails {
  @scala.inline
  def apply(): RemoteIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteIpDetails]
  }
  @scala.inline
  implicit class RemoteIpDetailsOps[Self <: RemoteIpDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCity(value: City): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("City")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: Country): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoLocation(value: GeoLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddressV4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressV4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressV4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressV4")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: Organization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Organization")(js.undefined)
        ret
    }
  }
  
}

