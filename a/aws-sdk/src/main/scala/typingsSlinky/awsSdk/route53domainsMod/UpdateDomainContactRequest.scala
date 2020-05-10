package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainContactRequest extends js.Object {
  /**
    * Provides detailed contact information.
    */
  var AdminContact: js.UndefOr[ContactDetail] = js.native
  /**
    * The name of the domain that you want to update contact information for.
    */
  var DomainName: typingsSlinky.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * Provides detailed contact information.
    */
  var RegistrantContact: js.UndefOr[ContactDetail] = js.native
  /**
    * Provides detailed contact information.
    */
  var TechContact: js.UndefOr[ContactDetail] = js.native
}

object UpdateDomainContactRequest {
  @scala.inline
  def apply(DomainName: DomainName): UpdateDomainContactRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainContactRequest]
  }
  @scala.inline
  implicit class UpdateDomainContactRequestOps[Self <: UpdateDomainContactRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdminContact(value: ContactDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdminContact")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrantContact(value: ContactDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrantContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrantContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrantContact")(js.undefined)
        ret
    }
    @scala.inline
    def withTechContact(value: ContactDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TechContact")(js.undefined)
        ret
    }
  }
  
}

