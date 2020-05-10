package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePrivateDnsNamespaceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreatePrivateDnsNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * The name that you want to assign to this namespace. When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon Route 53 private hosted zone that has the same name as the namespace.
    */
  var Name: NamespaceName = js.native
  /**
    * The ID of the Amazon VPC that you want to associate the namespace with.
    */
  var Vpc: ResourceId = js.native
}

object CreatePrivateDnsNamespaceRequest {
  @scala.inline
  def apply(Name: NamespaceName, Vpc: ResourceId): CreatePrivateDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Vpc = Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateDnsNamespaceRequest]
  }
  @scala.inline
  implicit class CreatePrivateDnsNamespaceRequestOps[Self <: CreatePrivateDnsNamespaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpc(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ResourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

