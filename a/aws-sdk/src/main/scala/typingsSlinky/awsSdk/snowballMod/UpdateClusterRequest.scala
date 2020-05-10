package typingsSlinky.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterRequest extends js.Object {
  /**
    * The ID of the updated Address object.
    */
  var AddressId: js.UndefOr[typingsSlinky.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The cluster ID of the cluster that you want to update, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: typingsSlinky.awsSdk.snowballMod.ClusterId = js.native
  /**
    * The updated description of this cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The new or updated Notification object.
    */
  var Notification: js.UndefOr[typingsSlinky.awsSdk.snowballMod.Notification] = js.native
  /**
    * The updated arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typingsSlinky.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The updated shipping option value of this cluster's ShippingDetails object.
    */
  var ShippingOption: js.UndefOr[typingsSlinky.awsSdk.snowballMod.ShippingOption] = js.native
}

object UpdateClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
  @scala.inline
  implicit class UpdateClusterRequestOps[Self <: UpdateClusterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddressId(value: AddressId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    @scala.inline
    def withForwardingAddressId(value: AddressId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddressId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardingAddressId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForwardingAddressId")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: Notification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notification")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: JobResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resources")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleARN(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOption(value: ShippingOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShippingOption")(js.undefined)
        ret
    }
  }
  
}

