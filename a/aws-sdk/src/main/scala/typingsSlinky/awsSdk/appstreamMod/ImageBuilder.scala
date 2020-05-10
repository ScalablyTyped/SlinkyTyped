package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBuilder extends js.Object {
  /**
    * The list of virtual private cloud (VPC) interface endpoint objects. Administrators can connect to the image builder only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The version of the AppStream 2.0 agent that is currently being used by the image builder. 
    */
  var AppstreamAgentVersion: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.AppstreamAgentVersion] = js.native
  /**
    * The ARN for the image builder.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Arn] = js.native
  /**
    * The time stamp when the image builder was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[String] = js.native
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DomainJoinInfo] = js.native
  /**
    * Enables or disables default internet access for the image builder.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * The ARN of the IAM role that is applied to the image builder. To assume a role, the image builder calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the AppStream_Machine_Role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the image from which this builder was created.
    */
  var ImageArn: js.UndefOr[Arn] = js.native
  /**
    * The image builder errors.
    */
  var ImageBuilderErrors: js.UndefOr[ResourceErrors] = js.native
  /**
    * The instance type for the image builder. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The name of the image builder.
    */
  var Name: String = js.native
  var NetworkAccessConfiguration: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.NetworkAccessConfiguration] = js.native
  /**
    * The operating system platform of the image builder.
    */
  var Platform: js.UndefOr[PlatformType] = js.native
  /**
    * The state of the image builder.
    */
  var State: js.UndefOr[ImageBuilderState] = js.native
  /**
    * The reason why the last state change occurred.
    */
  var StateChangeReason: js.UndefOr[ImageBuilderStateChangeReason] = js.native
  /**
    * The VPC configuration of the image builder.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.VpcConfig] = js.native
}

object ImageBuilder {
  @scala.inline
  def apply(Name: String): ImageBuilder = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBuilder]
  }
  @scala.inline
  implicit class ImageBuilderOps[Self <: ImageBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessEndpoints(value: AccessEndpointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withAppstreamAgentVersion(value: AppstreamAgentVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppstreamAgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppstreamAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppstreamAgentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Arn): Self = {
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
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainJoinInfo(value: DomainJoinInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainJoinInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainJoinInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainJoinInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDefaultInternetAccess(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDefaultInternetAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDefaultInternetAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableDefaultInternetAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoleArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withImageArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageArn")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBuilderErrors(value: ResourceErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilderErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBuilderErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageBuilderErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkAccessConfiguration(value: NetworkAccessConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAccessConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkAccessConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkAccessConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Platform")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ImageBuilderState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withStateChangeReason(value: ImageBuilderStateChangeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateChangeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StateChangeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: VpcConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(js.undefined)
        ret
    }
  }
  
}

