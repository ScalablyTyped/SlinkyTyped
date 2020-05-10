package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stack extends js.Object {
  /**
    * The agent version. This parameter is set to LATEST for auto-update. or a version number for a fixed agent version.
    */
  var AgentVersion: js.UndefOr[String] = js.native
  /**
    * The stack's ARN.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The stack's attributes.
    */
  var Attributes: js.UndefOr[StackAttributes] = js.native
  /**
    * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version. For more information, see Create a New Stack.
    */
  var ChefConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ChefConfiguration] = js.native
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.native
  /**
    * The date when the stack was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see Adding Apps or Cookbooks and Recipes.
    */
  var CustomCookbooksSource: js.UndefOr[Source] = js.native
  /**
    * A JSON object that contains user-defined attributes to be added to the stack configuration and deployment attributes. You can use custom JSON to override the corresponding default stack configuration attribute values or to pass data to recipes. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information on custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes.
    */
  var CustomJson: js.UndefOr[String] = js.native
  /**
    * The stack's default Availability Zone. For more information, see Regions and Endpoints.
    */
  var DefaultAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The ARN of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var DefaultInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * The stack's default operating system.
    */
  var DefaultOs: js.UndefOr[String] = js.native
  /**
    * The default root device type. This value is used by default for all instances in the stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
    */
  var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.native
  /**
    * A default Amazon EC2 key pair for the stack's instances. You can override this value when you create or update an instance.
    */
  var DefaultSshKeyName: js.UndefOr[String] = js.native
  /**
    * The default subnet ID; applicable only if the stack is running in a VPC.
    */
  var DefaultSubnetId: js.UndefOr[String] = js.native
  /**
    * The stack host name theme, with spaces replaced by underscores.
    */
  var HostnameTheme: js.UndefOr[String] = js.native
  /**
    * The stack name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The stack AWS Identity and Access Management (IAM) role.
    */
  var ServiceRoleArn: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * Whether the stack uses custom cookbooks.
    */
  var UseCustomCookbooks: js.UndefOr[Boolean] = js.native
  /**
    * Whether the stack automatically associates the AWS OpsWorks Stacks built-in security groups with the stack's layers.
    */
  var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.native
  /**
    * The VPC ID; applicable only if the stack is running in a VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Stack {
  @scala.inline
  def apply(): Stack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stack]
  }
  @scala.inline
  implicit class StackOps[Self <: Stack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: String): Self = {
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
    def withAttributes(value: StackAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withChefConfiguration(value: ChefConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChefConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChefConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChefConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationManager(value: StackConfigurationManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationManager")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomCookbooksSource(value: Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomCookbooksSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomCookbooksSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomCookbooksSource")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomJson(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomJson")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultInstanceProfileArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInstanceProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInstanceProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultInstanceProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultOs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultOs")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootDeviceType(value: RootDeviceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRootDeviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootDeviceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRootDeviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSshKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSshKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSshKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSshKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSubnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSubnetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultSubnetId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostnameTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostnameTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostnameTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostnameTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCustomCookbooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseCustomCookbooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomCookbooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseCustomCookbooks")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOpsworksSecurityGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseOpsworksSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOpsworksSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseOpsworksSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

