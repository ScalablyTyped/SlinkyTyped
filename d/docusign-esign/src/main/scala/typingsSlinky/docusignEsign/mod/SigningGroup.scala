package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningGroup extends StObject {
  
  /**
    * The UTC DateTime when the signing group was created. Read only.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * The name of the user who created the signing group.
    */
  var createdBy: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The email address for the signing group. You can use a group email address to email all of the group members at the same time.
    */
  var groupEmail: js.UndefOr[String] = js.native
  
  /**
    * The name of the group. The search_text provided in the call automatically performs a wild card search on group_name.
    */
  var groupName: js.UndefOr[String] = js.native
  
  /**
    * The group type. Possible values include:
    *
    * - `adminstrators`
    * - `everyone`
    * - `customGroup`
    * - `sharedSigningGroup`
    *
    * <!-- More? To do -->
    */
  var groupType: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the signing group was last modified. Read only.
    */
  var modified: js.UndefOr[String] = js.native
  
  /**
    * The user id (GUID) of the user who last modified this user record.
    */
  var modifiedBy: js.UndefOr[String] = js.native
  
  /**
    * Optional. The ID of the [signing group](https://support.docusign.com/en/guides/ndse-user-guide-signing-groups).
    *
    * **Note**: When you send an envelope to a signing group, anyone in the group can open it and sign it with their own signature.
    * For this reason, we recommend that you do not include non-signer recipients (such as carbon copy recipients) in the same signing group as signer recipients.
    * However, you could create a second signing group for the non-signer recipients and change the default action of Needs to Sign to a different value, such as Receives a Copy.
    */
  var signingGroupId: js.UndefOr[String] = js.native
  
  /**
    * User management information.
    */
  var users: js.UndefOr[js.Array[SigningGroupUser]] = js.native
}
object SigningGroup {
  
  @scala.inline
  def apply(): SigningGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningGroup]
  }
  
  @scala.inline
  implicit class SigningGroupMutableBuilder[Self <: SigningGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setGroupEmail(value: String): Self = StObject.set(x, "groupEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupEmailUndefined: Self = StObject.set(x, "groupEmail", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    @scala.inline
    def setGroupType(value: String): Self = StObject.set(x, "groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupTypeUndefined: Self = StObject.set(x, "groupType", js.undefined)
    
    @scala.inline
    def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedBy(value: String): Self = StObject.set(x, "modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedByUndefined: Self = StObject.set(x, "modifiedBy", js.undefined)
    
    @scala.inline
    def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    @scala.inline
    def setSigningGroupId(value: String): Self = StObject.set(x, "signingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupIdUndefined: Self = StObject.set(x, "signingGroupId", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[SigningGroupUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: SigningGroupUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
