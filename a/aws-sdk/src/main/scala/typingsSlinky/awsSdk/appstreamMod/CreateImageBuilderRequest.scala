package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageBuilderRequest extends js.Object {
  /**
    * The list of interface VPC endpoint (interface endpoint) objects. Administrators can connect to the image builder only through the specified endpoints.
    */
  var AccessEndpoints: js.UndefOr[AccessEndpointList] = js.native
  /**
    * The version of the AppStream 2.0 agent to use for this image builder. To use the latest version of the AppStream 2.0 agent, specify [LATEST]. 
    */
  var AppstreamAgentVersion: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.AppstreamAgentVersion] = js.native
  /**
    * The description to display.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Description] = js.native
  /**
    * The image builder name to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DisplayName] = js.native
  /**
    * The name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. 
    */
  var DomainJoinInfo: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.DomainJoinInfo] = js.native
  /**
    * Enables or disables default internet access for the image builder.
    */
  var EnableDefaultInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to apply to the image builder. To assume a role, the image builder calls the AWS Security Token Service (STS) AssumeRole API operation and passes the ARN of the role to use. The operation creates a new session with temporary credentials. AppStream 2.0 retrieves the temporary credentials and creates the AppStream_Machine_Role credential profile on the instance. For more information, see Using an IAM Role to Grant Permissions to Applications and Scripts Running on AppStream 2.0 Streaming Instances in the Amazon AppStream 2.0 Administration Guide.
    */
  var IamRoleArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the public, private, or shared image to use.
    */
  var ImageArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the image used to create the image builder.
    */
  var ImageName: js.UndefOr[String] = js.native
  /**
    * The instance type to use when launching the image builder. The following instance types are available:   stream.standard.medium   stream.standard.large   stream.compute.large   stream.compute.xlarge   stream.compute.2xlarge   stream.compute.4xlarge   stream.compute.8xlarge   stream.memory.large   stream.memory.xlarge   stream.memory.2xlarge   stream.memory.4xlarge   stream.memory.8xlarge   stream.graphics-design.large   stream.graphics-design.xlarge   stream.graphics-design.2xlarge   stream.graphics-design.4xlarge   stream.graphics-desktop.2xlarge   stream.graphics-pro.4xlarge   stream.graphics-pro.8xlarge   stream.graphics-pro.16xlarge  
    */
  var InstanceType: String = js.native
  /**
    * A unique name for the image builder.
    */
  var Name: typingsSlinky.awsSdk.appstreamMod.Name = js.native
  /**
    * The tags to associate with the image builder. A tag is a key-value pair, and the value is optional. For example, Environment=Test. If you do not specify a value, Environment=.  Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special characters:  _ . : / = + \ - @ If you do not specify a value, the value is set to an empty string. For more information about tags, see Tagging Your Resources in the Amazon AppStream 2.0 Administration Guide.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.Tags] = js.native
  /**
    * The VPC configuration for the image builder. You can specify only one subnet.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.VpcConfig] = js.native
}

object CreateImageBuilderRequest {
  @scala.inline
  def apply(InstanceType: String, Name: Name): CreateImageBuilderRequest = {
    val __obj = js.Dynamic.literal(InstanceType = InstanceType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageBuilderRequest]
  }
  @scala.inline
  implicit class CreateImageBuilderRequestOps[Self <: CreateImageBuilderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
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
    def withDescription(value: Description): Self = {
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
    def withDisplayName(value: DisplayName): Self = {
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
    def withImageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageName")(js.undefined)
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

