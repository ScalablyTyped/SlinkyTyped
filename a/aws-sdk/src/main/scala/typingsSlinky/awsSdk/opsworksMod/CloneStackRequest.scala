package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneStackRequest extends js.Object {
  /**
    * The default AWS OpsWorks Stacks agent version. You have the following options:   Auto-update - Set this parameter to LATEST. AWS OpsWorks Stacks automatically installs new agent versions on the stack's instances as soon as they are available.   Fixed version - Set this parameter to your preferred agent version. To update the agent version, you must edit the stack configuration and specify a new version. AWS OpsWorks Stacks then automatically installs that version on the stack's instances.   The default setting is LATEST. To specify an agent version, you must use the complete version number, not the abbreviated number shown on the console. For a list of available agent version numbers, call DescribeAgentVersions. AgentVersion cannot be set to Chef 12.2.  You can also specify an agent version when you create or update an instance, which overrides the stack's default setting. 
    */
  var AgentVersion: js.UndefOr[String] = js.native
  /**
    * A list of stack attributes and values as key/value pairs to be added to the cloned stack.
    */
  var Attributes: js.UndefOr[StackAttributes] = js.native
  /**
    * A ChefConfiguration object that specifies whether to enable Berkshelf and the Berkshelf version on Chef 11.10 stacks. For more information, see Create a New Stack.
    */
  var ChefConfiguration: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.ChefConfiguration] = js.native
  /**
    * A list of source stack app IDs to be included in the cloned stack.
    */
  var CloneAppIds: js.UndefOr[Strings] = js.native
  /**
    * Whether to clone the source stack's permissions.
    */
  var ClonePermissions: js.UndefOr[Boolean] = js.native
  /**
    * The configuration manager. When you clone a stack we recommend that you use the configuration manager to specify the Chef version: 12, 11.10, or 11.4 for Linux stacks, or 12.2 for Windows stacks. The default value for Linux stacks is currently 12.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.native
  /**
    * Contains the information required to retrieve an app or cookbook from a repository. For more information, see Adding Apps or Cookbooks and Recipes.
    */
  var CustomCookbooksSource: js.UndefOr[Source] = js.native
  /**
    * A string that contains user-defined, custom JSON. It is used to override the corresponding default stack configuration JSON values. The string should be in the following format:  "{\"key1\": \"value1\", \"key2\": \"value2\",...}"  For more information about custom JSON, see Use Custom JSON to Modify the Stack Configuration Attributes 
    */
  var CustomJson: js.UndefOr[String] = js.native
  /**
    * The cloned stack's default Availability Zone, which must be in the specified region. For more information, see Regions and Endpoints. If you also specify a value for DefaultSubnetId, the subnet must be in the same zone. For more information, see the VpcId parameter description. 
    */
  var DefaultAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM profile that is the default profile for all of the stack's EC2 instances. For more information about IAM ARNs, see Using Identifiers.
    */
  var DefaultInstanceProfileArn: js.UndefOr[String] = js.native
  /**
    * The stack's operating system, which must be set to one of the following.   A supported Linux operating system: An Amazon Linux version, such as Amazon Linux 2018.03, Amazon Linux 2017.09, Amazon Linux 2017.03, Amazon Linux 2016.09, Amazon Linux 2016.03, Amazon Linux 2015.09, or Amazon Linux 2015.03.   A supported Ubuntu operating system, such as Ubuntu 16.04 LTS, Ubuntu 14.04 LTS, or Ubuntu 12.04 LTS.    CentOS Linux 7     Red Hat Enterprise Linux 7     Microsoft Windows Server 2012 R2 Base, Microsoft Windows Server 2012 R2 with SQL Server Express, Microsoft Windows Server 2012 R2 with SQL Server Standard, or Microsoft Windows Server 2012 R2 with SQL Server Web.   A custom AMI: Custom. You specify the custom AMI you want to use when you create instances. For more information about how to use custom AMIs with OpsWorks, see Using Custom AMIs.   The default option is the parent stack's operating system. For more information about supported operating systems, see AWS OpsWorks Stacks Operating Systems.  You can specify a different Linux operating system for the cloned stack, but you cannot change from Linux to Windows or Windows to Linux. 
    */
  var DefaultOs: js.UndefOr[String] = js.native
  /**
    * The default root device type. This value is used by default for all instances in the cloned stack, but you can override it when you create an instance. For more information, see Storage for the Root Device.
    */
  var DefaultRootDeviceType: js.UndefOr[RootDeviceType] = js.native
  /**
    * A default Amazon EC2 key pair name. The default value is none. If you specify a key pair name, AWS OpsWorks installs the public key on the instance and you can use the private key with an SSH client to log in to the instance. For more information, see  Using SSH to Communicate with an Instance and  Managing SSH Access. You can override this setting by specifying a different key pair, or no key pair, when you  create an instance. 
    */
  var DefaultSshKeyName: js.UndefOr[String] = js.native
  /**
    * The stack's default VPC subnet ID. This parameter is required if you specify a value for the VpcId parameter. All instances are launched into this subnet unless you specify otherwise when you create the instance. If you also specify a value for DefaultAvailabilityZone, the subnet must be in that zone. For information on default values and when this parameter is required, see the VpcId parameter description. 
    */
  var DefaultSubnetId: js.UndefOr[String] = js.native
  /**
    * The stack's host name theme, with spaces are replaced by underscores. The theme is used to generate host names for the stack's instances. By default, HostnameTheme is set to Layer_Dependent, which creates host names by appending integers to the layer's short name. The other themes are:    Baked_Goods     Clouds     Europe_Cities     Fruits     Greek_Deities_and_Titans     Legendary_creatures_from_Japan     Planets_and_Moons     Roman_Deities     Scottish_Islands     US_Cities     Wild_Cats    To obtain a generated host name, call GetHostNameSuggestion, which returns a host name based on the current theme.
    */
  var HostnameTheme: js.UndefOr[String] = js.native
  /**
    * The cloned stack name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The cloned stack AWS region, such as "ap-northeast-2". For more information about AWS regions, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The stack AWS Identity and Access Management (IAM) role, which allows AWS OpsWorks Stacks to work with AWS resources on your behalf. You must set this parameter to the Amazon Resource Name (ARN) for an existing IAM role. If you create a stack by using the AWS OpsWorks Stacks console, it creates the role for you. You can obtain an existing stack's IAM ARN programmatically by calling DescribePermissions. For more information about IAM ARNs, see Using Identifiers.  You must set this parameter to a valid service role ARN or the action will fail; there is no default value. You can specify the source stack's service role ARN, if you prefer, but you must do so explicitly. 
    */
  var ServiceRoleArn: String = js.native
  /**
    * The source stack ID.
    */
  var SourceStackId: String = js.native
  /**
    * Whether to use custom cookbooks.
    */
  var UseCustomCookbooks: js.UndefOr[Boolean] = js.native
  /**
    * Whether to associate the AWS OpsWorks Stacks built-in security groups with the stack's layers. AWS OpsWorks Stacks provides a standard set of built-in security groups, one for each layer, which are associated with layers by default. With UseOpsworksSecurityGroups you can instead provide your own custom security groups. UseOpsworksSecurityGroups has the following settings:    True - AWS OpsWorks Stacks automatically associates the appropriate built-in security group with each layer (default setting). You can associate additional security groups with a layer after you create it but you cannot delete the built-in security group.   False - AWS OpsWorks Stacks does not associate built-in security groups with layers. You must create appropriate Amazon Elastic Compute Cloud (Amazon EC2) security groups and associate a security group with each layer that you create. However, you can still manually associate a built-in security group with a layer on creation; custom security groups are required only for those layers that need custom settings.   For more information, see Create a New Stack.
    */
  var UseOpsworksSecurityGroups: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the VPC that the cloned stack is to be launched into. It must be in the specified region. All instances are launched into this VPC, and you cannot change the ID later.   If your account supports EC2 Classic, the default value is no VPC.   If your account does not support EC2 Classic, the default value is the default VPC for the specified region.   If the VPC ID corresponds to a default VPC and you have specified either the DefaultAvailabilityZone or the DefaultSubnetId parameter only, AWS OpsWorks Stacks infers the value of the other parameter. If you specify neither parameter, AWS OpsWorks Stacks sets these parameters to the first valid Availability Zone for the specified region and the corresponding default VPC subnet ID, respectively.  If you specify a nondefault VPC ID, note the following:   It must belong to a VPC in your account that is in the specified region.   You must specify a value for DefaultSubnetId.   For more information about how to use AWS OpsWorks Stacks with a VPC, see Running a Stack in a VPC. For more information about default VPC and EC2 Classic, see Supported Platforms. 
    */
  var VpcId: js.UndefOr[String] = js.native
}

object CloneStackRequest {
  @scala.inline
  def apply(ServiceRoleArn: String, SourceStackId: String): CloneStackRequest = {
    val __obj = js.Dynamic.literal(ServiceRoleArn = ServiceRoleArn.asInstanceOf[js.Any], SourceStackId = SourceStackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneStackRequest]
  }
  @scala.inline
  implicit class CloneStackRequestOps[Self <: CloneStackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceStackId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCloneAppIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneAppIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneAppIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneAppIds")(js.undefined)
        ret
    }
    @scala.inline
    def withClonePermissions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClonePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClonePermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClonePermissions")(js.undefined)
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

