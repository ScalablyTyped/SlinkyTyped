package typingsSlinky.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribedServer extends StObject {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) of the server.
    */
  var Arn: typingsSlinky.awsSdk.transferMod.Arn = js.native
  
  /**
    * Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when Protocols is set to FTPS.
    */
  var Certificate: js.UndefOr[typingsSlinky.awsSdk.transferMod.Certificate] = js.native
  
  /**
    * Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
    */
  var EndpointDetails: js.UndefOr[typingsSlinky.awsSdk.transferMod.EndpointDetails] = js.native
  
  /**
    * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint, your server isn't accessible over the public internet.
    */
  var EndpointType: js.UndefOr[typingsSlinky.awsSdk.transferMod.EndpointType] = js.native
  
  /**
    * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output of the ssh-keygen -l -f my-new-server-key command.
    */
  var HostKeyFingerprint: js.UndefOr[typingsSlinky.awsSdk.transferMod.HostKeyFingerprint] = js.native
  
  /**
    * Specifies information to call a customer-supplied authentication API. This field is not populated when the IdentityProviderType of a server is SERVICE_MANAGED.
    */
  var IdentityProviderDetails: js.UndefOr[typingsSlinky.awsSdk.transferMod.IdentityProviderDetails] = js.native
  
  /**
    * Specifies the mode of authentication method enabled for this service. A value of SERVICE_MANAGED means that you are using this server to store and access user credentials within the service. A value of API_GATEWAY indicates that you have integrated an API Gateway endpoint that will be invoked for authenticating your user into the service.
    */
  var IdentityProviderType: js.UndefOr[typingsSlinky.awsSdk.transferMod.IdentityProviderType] = js.native
  
  /**
    * Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.native
  
  /**
    * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. The available protocols are:    SFTP (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH    FTPS (File Transfer Protocol Secure): File transfer with TLS encryption    FTP (File Transfer Protocol): Unencrypted file transfer  
    */
  var Protocols: js.UndefOr[typingsSlinky.awsSdk.transferMod.Protocols] = js.native
  
  /**
    * Specifies the name of the security policy that is attached to the server.
    */
  var SecurityPolicyName: js.UndefOr[typingsSlinky.awsSdk.transferMod.SecurityPolicyName] = js.native
  
  /**
    * Specifies the unique system-assigned identifier for a server that you instantiate.
    */
  var ServerId: js.UndefOr[typingsSlinky.awsSdk.transferMod.ServerId] = js.native
  
  /**
    * Specifies the condition of a server for the server that was described. A value of ONLINE indicates that the server can accept jobs and transfer files. A State value of OFFLINE means that the server cannot perform file transfer operations. The states of STARTING and STOPPING indicate that the server is in an intermediate state, either not fully able to respond, or not fully offline. The values of START_FAILED or STOP_FAILED can indicate an error condition.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.transferMod.State] = js.native
  
  /**
    * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server that was described.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.transferMod.Tags] = js.native
  
  /**
    * Specifies the number of users that are assigned to a server you specified with the ServerId.
    */
  var UserCount: js.UndefOr[typingsSlinky.awsSdk.transferMod.UserCount] = js.native
}
object DescribedServer {
  
  @scala.inline
  def apply(Arn: Arn): DescribedServer = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedServer]
  }
  
  @scala.inline
  implicit class DescribedServerMutableBuilder[Self <: DescribedServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    @scala.inline
    def setEndpointDetails(value: EndpointDetails): Self = StObject.set(x, "EndpointDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointDetailsUndefined: Self = StObject.set(x, "EndpointDetails", js.undefined)
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    @scala.inline
    def setHostKeyFingerprint(value: HostKeyFingerprint): Self = StObject.set(x, "HostKeyFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostKeyFingerprintUndefined: Self = StObject.set(x, "HostKeyFingerprint", js.undefined)
    
    @scala.inline
    def setIdentityProviderDetails(value: IdentityProviderDetails): Self = StObject.set(x, "IdentityProviderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderDetailsUndefined: Self = StObject.set(x, "IdentityProviderDetails", js.undefined)
    
    @scala.inline
    def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityProviderTypeUndefined: Self = StObject.set(x, "IdentityProviderType", js.undefined)
    
    @scala.inline
    def setLoggingRole(value: Role): Self = StObject.set(x, "LoggingRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingRoleUndefined: Self = StObject.set(x, "LoggingRole", js.undefined)
    
    @scala.inline
    def setProtocols(value: Protocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "Protocols", js.Array(value :_*))
    
    @scala.inline
    def setSecurityPolicyName(value: SecurityPolicyName): Self = StObject.set(x, "SecurityPolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyNameUndefined: Self = StObject.set(x, "SecurityPolicyName", js.undefined)
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIdUndefined: Self = StObject.set(x, "ServerId", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserCount(value: UserCount): Self = StObject.set(x, "UserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCountUndefined: Self = StObject.set(x, "UserCount", js.undefined)
  }
}
