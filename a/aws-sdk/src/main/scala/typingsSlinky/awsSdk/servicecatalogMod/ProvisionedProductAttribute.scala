package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedProductAttribute extends js.Object {
  /**
    * The ARN of the provisioned product.
    */
  var Arn: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the provisioned product.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken] = js.native
  /**
    * The record identifier of the last request performed on this provisioned product.
    */
  var LastRecordId: js.UndefOr[Id] = js.native
  /**
    * The user-friendly name of the provisioned product.
    */
  var Name: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  /**
    * The assigned identifier for the resource, such as an EC2 instance ID or an S3 bucket name.
    */
  var PhysicalId: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.PhysicalId] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The current status of the provisioned product.    AVAILABLE - Stable state, ready to perform any operation. The most recent operation succeeded and completed.    UNDER_CHANGE - Transitive state. Operations performed might not have valid results. Wait for an AVAILABLE status before performing operations.    TAINTED - Stable state, ready to perform any operation. The stack has completed the requested operation but is not exactly what was requested. For example, a request to update to a new version failed and the stack rolled back to the current version.    ERROR - An unexpected error occurred. The provisioned product exists but the stack is not running. For example, CloudFormation received a parameter value that was not valid and could not launch the stack.    PLAN_IN_PROGRESS - Transitive state. The plan operations were performed to provision a new product, but resources have not yet been created. After reviewing the list of resources to be created, execute the plan. Wait for an AVAILABLE status before performing operations.  
    */
  var Status: js.UndefOr[ProvisionedProductStatus] = js.native
  /**
    * The current status message of the provisioned product.
    */
  var StatusMessage: js.UndefOr[ProvisionedProductStatusMessage] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Tags] = js.native
  /**
    * The type of provisioned product. The supported values are CFN_STACK and CFN_STACKSET.
    */
  var Type: js.UndefOr[ProvisionedProductType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM user.
    */
  var UserArn: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.UserArn] = js.native
  /**
    * The ARN of the IAM user in the session. This ARN might contain a session ID.
    */
  var UserArnSession: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.UserArnSession] = js.native
}

object ProvisionedProductAttribute {
  @scala.inline
  def apply(): ProvisionedProductAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductAttribute]
  }
  @scala.inline
  implicit class ProvisionedProductAttributeOps[Self <: ProvisionedProductAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: ProvisionedProductNameOrArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdempotencyToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdempotencyToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRecordId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRecordId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRecordId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRecordId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ProvisionedProductNameOrArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalId(value: PhysicalId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioningArtifactId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioningArtifactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisioningArtifactId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ProvisionedProductStatus): Self = {
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
    @scala.inline
    def withStatusMessage(value: ProvisionedProductStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ProvisionedProductType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withUserArn(value: UserArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUserArnSession(value: UserArnSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArnSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserArnSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserArnSession")(js.undefined)
        ret
    }
  }
  
}

