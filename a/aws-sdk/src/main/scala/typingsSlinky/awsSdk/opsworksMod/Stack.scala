package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentVersion(value: String): Self = this.set("AgentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentVersion: Self = this.set("AgentVersion", js.undefined)
    
    @scala.inline
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAttributes(value: StackAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    
    @scala.inline
    def setChefConfiguration(value: ChefConfiguration): Self = this.set("ChefConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChefConfiguration: Self = this.set("ChefConfiguration", js.undefined)
    
    @scala.inline
    def setConfigurationManager(value: StackConfigurationManager): Self = this.set("ConfigurationManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationManager: Self = this.set("ConfigurationManager", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setCustomCookbooksSource(value: Source): Self = this.set("CustomCookbooksSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCookbooksSource: Self = this.set("CustomCookbooksSource", js.undefined)
    
    @scala.inline
    def setCustomJson(value: String): Self = this.set("CustomJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomJson: Self = this.set("CustomJson", js.undefined)
    
    @scala.inline
    def setDefaultAvailabilityZone(value: String): Self = this.set("DefaultAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAvailabilityZone: Self = this.set("DefaultAvailabilityZone", js.undefined)
    
    @scala.inline
    def setDefaultInstanceProfileArn(value: String): Self = this.set("DefaultInstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultInstanceProfileArn: Self = this.set("DefaultInstanceProfileArn", js.undefined)
    
    @scala.inline
    def setDefaultOs(value: String): Self = this.set("DefaultOs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOs: Self = this.set("DefaultOs", js.undefined)
    
    @scala.inline
    def setDefaultRootDeviceType(value: RootDeviceType): Self = this.set("DefaultRootDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootDeviceType: Self = this.set("DefaultRootDeviceType", js.undefined)
    
    @scala.inline
    def setDefaultSshKeyName(value: String): Self = this.set("DefaultSshKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSshKeyName: Self = this.set("DefaultSshKeyName", js.undefined)
    
    @scala.inline
    def setDefaultSubnetId(value: String): Self = this.set("DefaultSubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSubnetId: Self = this.set("DefaultSubnetId", js.undefined)
    
    @scala.inline
    def setHostnameTheme(value: String): Self = this.set("HostnameTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostnameTheme: Self = this.set("HostnameTheme", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setServiceRoleArn(value: String): Self = this.set("ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("ServiceRoleArn", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    
    @scala.inline
    def setUseCustomCookbooks(value: Boolean): Self = this.set("UseCustomCookbooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCustomCookbooks: Self = this.set("UseCustomCookbooks", js.undefined)
    
    @scala.inline
    def setUseOpsworksSecurityGroups(value: Boolean): Self = this.set("UseOpsworksSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOpsworksSecurityGroups: Self = this.set("UseOpsworksSecurityGroups", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
