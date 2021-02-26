package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccessPolicyRequest extends StObject {
  
  /**
    * The identity for this access policy. Choose an AWS SSO user, an AWS SSO group, or an IAM user.
    */
  var accessPolicyIdentity: Identity = js.native
  
  /**
    * The permission level for this access policy. Note that a project ADMINISTRATOR is also known as a project owner.
    */
  var accessPolicyPermission: Permission = js.native
  
  /**
    * The AWS IoT SiteWise Monitor resource for this access policy. Choose either a portal or a project.
    */
  var accessPolicyResource: Resource = js.native
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * A list of key-value pairs that contain metadata for the access policy. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateAccessPolicyRequest {
  
  @scala.inline
  def apply(accessPolicyIdentity: Identity, accessPolicyPermission: Permission, accessPolicyResource: Resource): CreateAccessPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicyIdentity = accessPolicyIdentity.asInstanceOf[js.Any], accessPolicyPermission = accessPolicyPermission.asInstanceOf[js.Any], accessPolicyResource = accessPolicyResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPolicyRequest]
  }
  
  @scala.inline
  implicit class CreateAccessPolicyRequestMutableBuilder[Self <: CreateAccessPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicyIdentity(value: Identity): Self = StObject.set(x, "accessPolicyIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyPermission(value: Permission): Self = StObject.set(x, "accessPolicyPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicyResource(value: Resource): Self = StObject.set(x, "accessPolicyResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
