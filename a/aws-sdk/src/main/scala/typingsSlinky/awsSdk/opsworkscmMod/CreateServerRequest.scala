package typingsSlinky.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateServerRequest extends StObject {
  
  /**
    *  Associate a public IP address with a server that you are launching. Valid values are true or false. The default value is true. 
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.native
  
  /**
    *  If you specify this field, AWS OpsWorks CM creates the server by using the backup represented by BackupId. 
    */
  var BackupId: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.BackupId] = js.native
  
  /**
    *  The number of automated backups that you want to keep. Whenever a new backup is created, AWS OpsWorks CM deletes the oldest backups if this number is exceeded. The default value is 1. 
    */
  var BackupRetentionCount: js.UndefOr[BackupRetentionCountDefinition] = js.native
  
  /**
    * A PEM-formatted HTTPS certificate. The value can be be a single, self-signed certificate, or a certificate chain. If you specify a custom certificate, you must also specify values for CustomDomain and CustomPrivateKey. The following are requirements for the CustomCertificate value:   You can provide either a self-signed, custom certificate, or the full certificate chain.   The certificate must be a valid X509 certificate, or a certificate chain in PEM format.   The certificate must be valid at the time of upload. A certificate can't be used before its validity period begins (the certificate's NotBefore date), or after it expires (the certificate's NotAfter date).   The certificate’s common name or subject alternative names (SANs), if present, must match the value of CustomDomain.   The certificate must match the value of CustomPrivateKey.  
    */
  var CustomCertificate: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.CustomCertificate] = js.native
  
  /**
    * An optional public endpoint of a server, such as https://aws.my-company.com. To access the server, create a CNAME DNS record in your preferred DNS service that points the custom domain to the endpoint that is generated when the server is created (the value of the CreateServer Endpoint attribute). You cannot access the server by using the generated Endpoint value if the server is using a custom domain. If you specify a custom domain, you must also specify values for CustomCertificate and CustomPrivateKey.
    */
  var CustomDomain: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.CustomDomain] = js.native
  
  /**
    * A private key in PEM format for connecting to the server by using HTTPS. The private key must not be encrypted; it cannot be protected by a password or passphrase. If you specify a custom private key, you must also specify values for CustomDomain and CustomCertificate.
    */
  var CustomPrivateKey: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.CustomPrivateKey] = js.native
  
  /**
    *  Enable or disable scheduled backups. Valid values are true or false. The default value is true. 
    */
  var DisableAutomatedBackup: js.UndefOr[Boolean] = js.native
  
  /**
    *  The configuration management engine to use. Valid values include ChefAutomate and Puppet. 
    */
  var Engine: String = js.native
  
  /**
    * Optional engine attributes on a specified server.   Attributes accepted in a Chef createServer request:     CHEF_AUTOMATE_PIVOTAL_KEY: A base64-encoded RSA public key. The corresponding private key is required to access the Chef API. When no CHEF_AUTOMATE_PIVOTAL_KEY is set, a private key is generated and returned in the response.     CHEF_AUTOMATE_ADMIN_PASSWORD: The password for the administrative user in the Chef Automate web-based dashboard. The password length is a minimum of eight characters, and a maximum of 32. The password can contain letters, numbers, and special characters (!/@#$%^&amp;+=_). The password must contain at least one lower case letter, one upper case letter, one number, and one special character. When no CHEF_AUTOMATE_ADMIN_PASSWORD is set, one is generated and returned in the response.    Attributes accepted in a Puppet createServer request:     PUPPET_ADMIN_PASSWORD: To work with the Puppet Enterprise console, a password must use ASCII characters.    PUPPET_R10K_REMOTE: The r10k remote is the URL of your control repository (for example, ssh://git@your.git-repo.com:user/control-repo.git). Specifying an r10k remote opens TCP port 8170.    PUPPET_R10K_PRIVATE_KEY: If you are using a private Git repository, add PUPPET_R10K_PRIVATE_KEY to specify a PEM-encoded private SSH key.  
    */
  var EngineAttributes: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.EngineAttributes] = js.native
  
  /**
    *  The engine model of the server. Valid values in this release include Monolithic for Puppet and Single for Chef. 
    */
  var EngineModel: js.UndefOr[String] = js.native
  
  /**
    *  The major release version of the engine that you want to use. For a Chef server, the valid value for EngineVersion is currently 2. For a Puppet server, the valid value is 2017. 
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    *  The ARN of the instance profile that your Amazon EC2 instances use. Although the AWS OpsWorks console typically creates the instance profile for you, if you are using API commands instead, run the service-role-creation.yaml AWS CloudFormation template, located at https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template creates a CloudFormation stack that includes the instance profile you need. 
    */
  var InstanceProfileArn: typingsSlinky.awsSdk.opsworkscmMod.InstanceProfileArn = js.native
  
  /**
    *  The Amazon EC2 instance type to use. For example, m5.large. 
    */
  var InstanceType: String = js.native
  
  /**
    *  The Amazon EC2 key pair to set for the instance. This parameter is optional; if desired, you may specify this parameter to connect to your instances by using SSH. 
    */
  var KeyPair: js.UndefOr[typingsSlinky.awsSdk.opsworkscmMod.KeyPair] = js.native
  
  /**
    *  The start time for a one-hour period during which AWS OpsWorks CM backs up application-level data on your server if automated backups are enabled. Valid values must be specified in one of the following formats:     HH:MM for daily backups    DDD:HH:MM for weekly backups    MM must be specified as 00. The specified time is in coordinated universal time (UTC). The default value is a random, daily start time.  Example: 08:00, which represents a daily start time of 08:00 UTC.  Example: Mon:08:00, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.)
    */
  var PreferredBackupWindow: js.UndefOr[TimeWindowDefinition] = js.native
  
  /**
    *  The start time for a one-hour period each week during which AWS OpsWorks CM performs maintenance on the instance. Valid values must be specified in the following format: DDD:HH:MM. MM must be specified as 00. The specified time is in coordinated universal time (UTC). The default value is a random one-hour period on Tuesday, Wednesday, or Friday. See TimeWindowDefinition for more information.   Example: Mon:08:00, which represents a start time of every Monday at 08:00 UTC. (8:00 a.m.) 
    */
  var PreferredMaintenanceWindow: js.UndefOr[TimeWindowDefinition] = js.native
  
  /**
    *  A list of security group IDs to attach to the Amazon EC2 instance. If you add this parameter, the specified security groups must be within the VPC that is specified by SubnetIds.   If you do not specify this parameter, AWS OpsWorks CM creates one new security group that uses TCP ports 22 and 443, open to 0.0.0.0/0 (everyone). 
    */
  var SecurityGroupIds: js.UndefOr[Strings] = js.native
  
  /**
    *  The name of the server. The server name must be unique within your AWS account, within each region. Server names must start with a letter; then letters, numbers, or hyphens (-) are allowed, up to a maximum of 40 characters. 
    */
  var ServerName: typingsSlinky.awsSdk.opsworkscmMod.ServerName = js.native
  
  /**
    *  The service role that the AWS OpsWorks CM service backend uses to work with your account. Although the AWS OpsWorks management console typically creates the service role for you, if you are using the AWS CLI or API commands, run the service-role-creation.yaml AWS CloudFormation template, located at https://s3.amazonaws.com/opsworks-cm-us-east-1-prod-default-assets/misc/opsworks-cm-roles.yaml. This template creates a CloudFormation stack that includes the service role and instance profile that you need. 
    */
  var ServiceRoleArn: typingsSlinky.awsSdk.opsworkscmMod.ServiceRoleArn = js.native
  
  /**
    *  The IDs of subnets in which to launch the server EC2 instance.   Amazon EC2-Classic customers: This field is required. All servers must run within a VPC. The VPC must have "Auto Assign Public IP" enabled.   EC2-VPC customers: This field is optional. If you do not specify subnet IDs, your EC2 instances are created in a default subnet that is selected by Amazon EC2. If you specify subnet IDs, the VPC must have "Auto Assign Public IP" enabled.  For more information about supported Amazon EC2 platforms, see Supported Platforms.
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
  
  /**
    * A map that contains tag keys and tag values to attach to an AWS OpsWorks for Chef Automate or AWS OpsWorks for Puppet Enterprise server.   The key cannot be empty.   The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : / @    The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : / @    Leading and trailing white spaces are trimmed from both the key and value.   A maximum of 50 user-applied tags is allowed for any AWS OpsWorks-CM server.  
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateServerRequest {
  
  @scala.inline
  def apply(
    Engine: String,
    InstanceProfileArn: InstanceProfileArn,
    InstanceType: String,
    ServerName: ServerName,
    ServiceRoleArn: ServiceRoleArn
  ): CreateServerRequest = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any], InstanceProfileArn = InstanceProfileArn.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], ServiceRoleArn = ServiceRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServerRequest]
  }
  
  @scala.inline
  implicit class CreateServerRequestMutableBuilder[Self <: CreateServerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupIdUndefined: Self = StObject.set(x, "BackupId", js.undefined)
    
    @scala.inline
    def setBackupRetentionCount(value: BackupRetentionCountDefinition): Self = StObject.set(x, "BackupRetentionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionCountUndefined: Self = StObject.set(x, "BackupRetentionCount", js.undefined)
    
    @scala.inline
    def setCustomCertificate(value: CustomCertificate): Self = StObject.set(x, "CustomCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCertificateUndefined: Self = StObject.set(x, "CustomCertificate", js.undefined)
    
    @scala.inline
    def setCustomDomain(value: CustomDomain): Self = StObject.set(x, "CustomDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDomainUndefined: Self = StObject.set(x, "CustomDomain", js.undefined)
    
    @scala.inline
    def setCustomPrivateKey(value: CustomPrivateKey): Self = StObject.set(x, "CustomPrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPrivateKeyUndefined: Self = StObject.set(x, "CustomPrivateKey", js.undefined)
    
    @scala.inline
    def setDisableAutomatedBackup(value: Boolean): Self = StObject.set(x, "DisableAutomatedBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAutomatedBackupUndefined: Self = StObject.set(x, "DisableAutomatedBackup", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineAttributesUndefined: Self = StObject.set(x, "EngineAttributes", js.undefined)
    
    @scala.inline
    def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value :_*))
    
    @scala.inline
    def setEngineModel(value: String): Self = StObject.set(x, "EngineModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineModelUndefined: Self = StObject.set(x, "EngineModel", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setInstanceProfileArn(value: InstanceProfileArn): Self = StObject.set(x, "InstanceProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPair(value: KeyPair): Self = StObject.set(x, "KeyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "KeyPair", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: TimeWindowDefinition): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: Strings): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArn(value: ServiceRoleArn): Self = StObject.set(x, "ServiceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIds(value: Strings): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
