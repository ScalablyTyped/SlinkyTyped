package typingsSlinky.googleapis.driveV3Mod.driveV3

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePermissionsCreate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A plain text custom message to include in the notification email.
    */
  var emailMessage: js.UndefOr[String] = js.native
  
  /**
    * The ID of the file or Team Drive.
    */
  var fileId: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPermission] = js.native
  
  /**
    * Whether to send a notification email when sharing to users or groups.
    * This defaults to true for users and groups, and is not allowed for other
    * requests. It must not be disabled for ownership transfers.
    */
  var sendNotificationEmail: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to transfer ownership to the specified user and downgrade the
    * current owner to a writer. This parameter is required as an
    * acknowledgement of the side effect.
    */
  var transferOwnership: js.UndefOr[Boolean] = js.native
  
  /**
    * Issue the request as a domain administrator; if set to true, then the
    * requester will be granted access if they are an administrator of the
    * domain to which the item belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.native
}
object ParamsResourcePermissionsCreate {
  
  @scala.inline
  def apply(): ParamsResourcePermissionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePermissionsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourcePermissionsCreateMutableBuilder[Self <: ParamsResourcePermissionsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaPermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSendNotificationEmail(value: Boolean): Self = StObject.set(x, "sendNotificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationEmailUndefined: Self = StObject.set(x, "sendNotificationEmail", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setTransferOwnership(value: Boolean): Self = StObject.set(x, "transferOwnership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferOwnershipUndefined: Self = StObject.set(x, "transferOwnership", js.undefined)
    
    @scala.inline
    def setUseDomainAdminAccess(value: Boolean): Self = StObject.set(x, "useDomainAdminAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDomainAdminAccessUndefined: Self = StObject.set(x, "useDomainAdminAccess", js.undefined)
  }
}
