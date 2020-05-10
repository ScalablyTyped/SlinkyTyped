package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceAccessPoliciesRequest extends js.Object {
  /**
    * The access rules you want to configure. These rules replace any existing rules. 
    */
  var AccessPolicies: PolicyDocument = js.native
  var DomainName: typingsSlinky.awsSdk.cloudsearchMod.DomainName = js.native
}

object UpdateServiceAccessPoliciesRequest {
  @scala.inline
  def apply(AccessPolicies: PolicyDocument, DomainName: DomainName): UpdateServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceAccessPoliciesRequest]
  }
  @scala.inline
  implicit class UpdateServiceAccessPoliciesRequestOps[Self <: UpdateServiceAccessPoliciesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessPolicies(value: PolicyDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessPolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

