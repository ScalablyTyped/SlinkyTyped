package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMembership extends js.Object {
  /**
    * The identifier of the Active Directory Domain.
    */
  var Domain: js.UndefOr[String] = js.native
  /**
    * The fully qualified domain name of the Active Directory Domain.
    */
  var FQDN: js.UndefOr[String] = js.native
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  var IAMRoleName: js.UndefOr[String] = js.native
  /**
    * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
    */
  var Status: js.UndefOr[String] = js.native
}

object DomainMembership {
  @scala.inline
  def apply(): DomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMembership]
  }
  @scala.inline
  implicit class DomainMembershipOps[Self <: DomainMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
        ret
    }
    @scala.inline
    def withFQDN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FQDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFQDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FQDN")(js.undefined)
        ret
    }
    @scala.inline
    def withIAMRoleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMRoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIAMRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMRoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

