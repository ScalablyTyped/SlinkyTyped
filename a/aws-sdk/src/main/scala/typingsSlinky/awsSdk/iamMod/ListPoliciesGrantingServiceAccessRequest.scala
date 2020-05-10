package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPoliciesGrantingServiceAccessRequest extends js.Object {
  /**
    * The ARN of the IAM identity (user, group, or role) whose policies you want to list.
    */
  var Arn: arnType = js.native
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.native
  /**
    * The service namespace for the AWS services whose policies you want to list. To learn the service namespace for a service, go to Actions, Resources, and Condition Keys for AWS Services in the IAM User Guide. Choose the name of the service to view details for that service. In the first paragraph, find the service prefix. For example, (service prefix: a4b). For more information about service namespaces, see AWS Service Namespaces in the AWS General Reference.
    */
  var ServiceNamespaces: serviceNamespaceListType = js.native
}

object ListPoliciesGrantingServiceAccessRequest {
  @scala.inline
  def apply(Arn: arnType, ServiceNamespaces: serviceNamespaceListType): ListPoliciesGrantingServiceAccessRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ServiceNamespaces = ServiceNamespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPoliciesGrantingServiceAccessRequest]
  }
  @scala.inline
  implicit class ListPoliciesGrantingServiceAccessRequestOps[Self <: ListPoliciesGrantingServiceAccessRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: arnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceNamespaces(value: serviceNamespaceListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceNamespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarker(value: markerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

