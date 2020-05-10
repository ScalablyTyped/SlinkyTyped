package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesGrantingServiceAccessEntry extends js.Object {
  /**
    * The PoliciesGrantingServiceAccess object that contains details about the policy.
    */
  var Policies: js.UndefOr[policyGrantingServiceAccessListType] = js.native
  /**
    * The namespace of the service that was accessed. To learn the service namespace of a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespace: js.UndefOr[serviceNamespaceType] = js.native
}

object ListPoliciesGrantingServiceAccessEntry {
  @scala.inline
  def apply(): ListPoliciesGrantingServiceAccessEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessEntry]
  }
  @scala.inline
  implicit class ListPoliciesGrantingServiceAccessEntryOps[Self <: ListPoliciesGrantingServiceAccessEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPolicies(value: policyGrantingServiceAccessListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceNamespace(value: serviceNamespaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNamespace")(js.undefined)
        ret
    }
  }
  
}

