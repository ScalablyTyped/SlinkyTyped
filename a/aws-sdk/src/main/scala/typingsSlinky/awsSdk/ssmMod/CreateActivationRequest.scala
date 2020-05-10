package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateActivationRequest extends js.Object {
  /**
    * The name of the registered, managed instance as it will appear in the Systems Manager console or when you use the AWS command line tools to list Systems Manager resources.  Do not enter personally identifiable information in this field. 
    */
  var DefaultInstanceName: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DefaultInstanceName] = js.native
  /**
    * A user-defined description of the resource that you want to register with Systems Manager.   Do not enter personally identifiable information in this field. 
    */
  var Description: js.UndefOr[ActivationDescription] = js.native
  /**
    * The date by which this activation request should expire. The default value is 24 hours.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance. This IAM role must provide AssumeRole permissions for the Systems Manager service principal ssm.amazonaws.com. For more information, see Create an IAM Service Role for a Hybrid Environment in the AWS Systems Manager User Guide.
    */
  var IamRole: typingsSlinky.awsSdk.ssmMod.IamRole = js.native
  /**
    * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
    */
  var RegistrationLimit: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RegistrationLimit] = js.native
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an activation to identify which servers or virtual machines (VMs) in your on-premises environment you intend to activate. In this case, you could specify the following key name/value pairs:    Key=OS,Value=Windows     Key=Environment,Value=Production     When you install SSM Agent on your on-premises servers and VMs, you specify an activation ID and code. When you specify the activation ID and code, tags assigned to the activation are automatically applied to the on-premises servers or VMs.  You can't add tags to or delete tags from an existing activation. You can tag your on-premises servers and VMs after they connect to Systems Manager for the first time and are assigned a managed instance ID. This means they are listed in the AWS Systems Manager console with an ID that is prefixed with "mi-". For information about how to add tags to your managed instances, see AddTagsToResource. For information about how to remove tags from your managed instances, see RemoveTagsFromResource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateActivationRequest {
  @scala.inline
  def apply(IamRole: IamRole): CreateActivationRequest = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActivationRequest]
  }
  @scala.inline
  implicit class CreateActivationRequestOps[Self <: CreateActivationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamRole(value: IamRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultInstanceName(value: DefaultInstanceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ActivationDescription): Self = {
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
    def withExpirationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationLimit(value: RegistrationLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegistrationLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
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
  }
  
}

