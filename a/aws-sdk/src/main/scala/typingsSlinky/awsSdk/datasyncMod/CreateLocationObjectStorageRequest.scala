package typingsSlinky.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocationObjectStorageRequest extends StObject {
  
  /**
    * Optional. The access key is used if credentials are required to access the self-managed object storage server. If your object storage requires a user name and password to authenticate, use AccessKey and SecretKey to provide the user name and password, respectively.
    */
  var AccessKey: js.UndefOr[ObjectStorageAccessKey] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
    */
  var AgentArns: AgentArnList = js.native
  
  /**
    * The bucket on the self-managed object storage server that is used to read data from.
    */
  var BucketName: ObjectStorageBucketName = js.native
  
  /**
    * Optional. The secret key is used if credentials are required to access the self-managed object storage server. If your object storage requires a user name and password to authenticate, use AccessKey and SecretKey to provide the user name and password, respectively.
    */
  var SecretKey: js.UndefOr[ObjectStorageSecretKey] = js.native
  
  /**
    * The name of the self-managed object storage server. This value is the IP address or Domain Name Service (DNS) name of the object storage server. An agent uses this host name to mount the object storage server in a network. 
    */
  var ServerHostname: typingsSlinky.awsSdk.datasyncMod.ServerHostname = js.native
  
  /**
    * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed object storage server requires one.
    */
  var ServerPort: js.UndefOr[ObjectStorageServerPort] = js.native
  
  /**
    * The protocol that the object storage server uses to communicate. Valid values are HTTP or HTTPS.
    */
  var ServerProtocol: js.UndefOr[ObjectStorageServerProtocol] = js.native
  
  /**
    * The subdirectory in the self-managed object storage server that is used to read data from.
    */
  var Subdirectory: js.UndefOr[S3Subdirectory] = js.native
  
  /**
    * The key-value pair that represents the tag that you want to add to the location. The value can be an empty string. We recommend using tags to name your resources.
    */
  var Tags: js.UndefOr[InputTagList] = js.native
}
object CreateLocationObjectStorageRequest {
  
  @scala.inline
  def apply(AgentArns: AgentArnList, BucketName: ObjectStorageBucketName, ServerHostname: ServerHostname): CreateLocationObjectStorageRequest = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any], BucketName = BucketName.asInstanceOf[js.Any], ServerHostname = ServerHostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationObjectStorageRequest]
  }
  
  @scala.inline
  implicit class CreateLocationObjectStorageRequestMutableBuilder[Self <: CreateLocationObjectStorageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKey(value: ObjectStorageAccessKey): Self = StObject.set(x, "AccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyUndefined: Self = StObject.set(x, "AccessKey", js.undefined)
    
    @scala.inline
    def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value :_*))
    
    @scala.inline
    def setBucketName(value: ObjectStorageBucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: ObjectStorageSecretKey): Self = StObject.set(x, "SecretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKeyUndefined: Self = StObject.set(x, "SecretKey", js.undefined)
    
    @scala.inline
    def setServerHostname(value: ServerHostname): Self = StObject.set(x, "ServerHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPort(value: ObjectStorageServerPort): Self = StObject.set(x, "ServerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPortUndefined: Self = StObject.set(x, "ServerPort", js.undefined)
    
    @scala.inline
    def setServerProtocol(value: ObjectStorageServerProtocol): Self = StObject.set(x, "ServerProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerProtocolUndefined: Self = StObject.set(x, "ServerProtocol", js.undefined)
    
    @scala.inline
    def setSubdirectory(value: S3Subdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    @scala.inline
    def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
