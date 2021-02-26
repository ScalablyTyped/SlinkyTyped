package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserProfileRequest extends StObject {
  
  /**
    * The ID of the associated Domain.
    */
  var DomainId: typingsSlinky.awsSdk.sagemakerMod.DomainId = js.native
  
  /**
    * A specifier for the type of value specified in SingleSignOnUserValue. Currently, the only supported value is "UserName". If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SingleSignOnUserIdentifier] = js.native
  
  /**
    * The username of the associated AWS Single Sign-On User for this UserProfile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified. 
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.native
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A name for the UserProfile.
    */
  var UserProfileName: typingsSlinky.awsSdk.sagemakerMod.UserProfileName = js.native
  
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserSettings] = js.native
}
object CreateUserProfileRequest {
  
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): CreateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileRequest]
  }
  
  @scala.inline
  implicit class CreateUserProfileRequestMutableBuilder[Self <: CreateUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSignOnUserIdentifier(value: SingleSignOnUserIdentifier): Self = StObject.set(x, "SingleSignOnUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSignOnUserIdentifierUndefined: Self = StObject.set(x, "SingleSignOnUserIdentifier", js.undefined)
    
    @scala.inline
    def setSingleSignOnUserValue(value: String256): Self = StObject.set(x, "SingleSignOnUserValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleSignOnUserValueUndefined: Self = StObject.set(x, "SingleSignOnUserValue", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
  }
}
