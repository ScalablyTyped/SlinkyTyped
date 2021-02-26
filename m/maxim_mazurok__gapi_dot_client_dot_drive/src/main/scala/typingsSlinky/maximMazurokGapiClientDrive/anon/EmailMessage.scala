package typingsSlinky.maximMazurokGapiClientDrive.anon

import typingsSlinky.maximMazurokGapiClientDrive.gapi.client.drive.Permission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailMessage extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /** A plain text custom message to include in the notification email. */
  var emailMessage: js.UndefOr[String] = js.native
  
  /** Deprecated. See moveToNewOwnersRoot for details. */
  var enforceSingleParent: js.UndefOr[Boolean] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** The ID of the file or shared drive. */
  var fileId: String = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * This parameter will only take effect if the item is not in a shared drive and the request is attempting to transfer the ownership of the item. If set to true, the item will be
    * moved to the new owner's My Drive root folder and all prior parents removed. If set to false, parents are not changed.
    */
  var moveToNewOwnersRoot: js.UndefOr[Boolean] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Request body */
  var resource: Permission = js.native
  
  /**
    * Whether to send a notification email when sharing to users or groups. This defaults to true for users and groups, and is not allowed for other requests. It must not be disabled
    * for ownership transfers.
    */
  var sendNotificationEmail: js.UndefOr[Boolean] = js.native
  
  /** Whether the requesting application supports both My Drives and shared drives. */
  var supportsAllDrives: js.UndefOr[Boolean] = js.native
  
  /** Deprecated use supportsAllDrives instead. */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  
  /** Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of the side effect. */
  var transferOwnership: js.UndefOr[Boolean] = js.native
  
  /**
    * Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an
    * administrator of the domain to which the shared drive belongs.
    */
  var useDomainAdminAccess: js.UndefOr[Boolean] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object EmailMessage {
  
  @scala.inline
  def apply(fileId: String, resource: Permission): EmailMessage = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessage]
  }
  
  @scala.inline
  implicit class EmailMessageMutableBuilder[Self <: EmailMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMessageUndefined: Self = StObject.set(x, "emailMessage", js.undefined)
    
    @scala.inline
    def setEnforceSingleParent(value: Boolean): Self = StObject.set(x, "enforceSingleParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceSingleParentUndefined: Self = StObject.set(x, "enforceSingleParent", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMoveToNewOwnersRoot(value: Boolean): Self = StObject.set(x, "moveToNewOwnersRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToNewOwnersRootUndefined: Self = StObject.set(x, "moveToNewOwnersRoot", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setResource(value: Permission): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationEmail(value: Boolean): Self = StObject.set(x, "sendNotificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationEmailUndefined: Self = StObject.set(x, "sendNotificationEmail", js.undefined)
    
    @scala.inline
    def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
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
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
