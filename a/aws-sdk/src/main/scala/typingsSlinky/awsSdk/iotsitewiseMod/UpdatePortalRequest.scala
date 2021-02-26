package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePortalRequest extends StObject {
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  
  /**
    * The AWS administrator's contact email address.
    */
  var portalContactEmail: Email = js.native
  
  /**
    * A new description for the portal.
    */
  var portalDescription: js.UndefOr[Description] = js.native
  
  /**
    * The ID of the portal to update.
    */
  var portalId: ID = js.native
  
  var portalLogoImage: js.UndefOr[Image] = js.native
  
  /**
    * A new friendly name for the portal.
    */
  var portalName: Name = js.native
  
  /**
    * The ARN of a service role that allows the portal's users to access your AWS IoT SiteWise resources on your behalf. For more information, see Using service roles for AWS IoT SiteWise Monitor in the AWS IoT SiteWise User Guide.
    */
  var roleArn: ARN = js.native
}
object UpdatePortalRequest {
  
  @scala.inline
  def apply(portalContactEmail: Email, portalId: ID, portalName: Name, roleArn: ARN): UpdatePortalRequest = {
    val __obj = js.Dynamic.literal(portalContactEmail = portalContactEmail.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalName = portalName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortalRequest]
  }
  
  @scala.inline
  implicit class UpdatePortalRequestMutableBuilder[Self <: UpdatePortalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setPortalContactEmail(value: Email): Self = StObject.set(x, "portalContactEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDescription(value: Description): Self = StObject.set(x, "portalDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalDescriptionUndefined: Self = StObject.set(x, "portalDescription", js.undefined)
    
    @scala.inline
    def setPortalId(value: ID): Self = StObject.set(x, "portalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalLogoImage(value: Image): Self = StObject.set(x, "portalLogoImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalLogoImageUndefined: Self = StObject.set(x, "portalLogoImage", js.undefined)
    
    @scala.inline
    def setPortalName(value: Name): Self = StObject.set(x, "portalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
