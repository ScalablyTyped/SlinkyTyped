package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  /**
    * Autonomous system number of the internet provider of the remote IP address.
    */
  var Asn: js.UndefOr[String] = js.native
  /**
    * Organization that registered this ASN.
    */
  var AsnOrg: js.UndefOr[String] = js.native
  /**
    * ISP information for the internet provider.
    */
  var Isp: js.UndefOr[String] = js.native
  /**
    * Name of the internet provider.
    */
  var Org: js.UndefOr[String] = js.native
}

object Organization {
  @scala.inline
  def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  @scala.inline
  implicit class OrganizationOps[Self <: Organization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Asn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Asn")(js.undefined)
        ret
    }
    @scala.inline
    def withAsnOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsnOrg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsnOrg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AsnOrg")(js.undefined)
        ret
    }
    @scala.inline
    def withIsp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Isp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Isp")(js.undefined)
        ret
    }
    @scala.inline
    def withOrg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Org")(js.undefined)
        ret
    }
  }
  
}

