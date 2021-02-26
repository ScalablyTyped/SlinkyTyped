package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[String] = js.native
  
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
  
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.native
  
  /**
    * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
    */
  var InvitedOn: js.UndefOr[js.Date] = js.native
  
  /**
    * The license type for the user.
    */
  var LicenseType: js.UndefOr[License] = js.native
  
  /**
    * The user's personal meeting PIN.
    */
  var PersonalPIN: js.UndefOr[String] = js.native
  
  /**
    * The primary email address of the user.
    */
  var PrimaryEmail: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The primary phone number associated with the user.
    */
  var PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.native
  
  /**
    * Date and time when the user is registered, in ISO 8601 format.
    */
  var RegisteredOn: js.UndefOr[js.Date] = js.native
  
  /**
    * The user ID.
    */
  var UserId: String = js.native
  
  /**
    * The user invite status.
    */
  var UserInvitationStatus: js.UndefOr[InviteStatus] = js.native
  
  /**
    * The user registration status.
    */
  var UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.native
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.UserType] = js.native
}
object User {
  
  @scala.inline
  def apply(UserId: String): User = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = StObject.set(x, "AlexaForBusinessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaForBusinessMetadataUndefined: Self = StObject.set(x, "AlexaForBusinessMetadata", js.undefined)
    
    @scala.inline
    def setDisplayName(value: SensitiveString): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setInvitedOn(value: js.Date): Self = StObject.set(x, "InvitedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedOnUndefined: Self = StObject.set(x, "InvitedOn", js.undefined)
    
    @scala.inline
    def setLicenseType(value: License): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    @scala.inline
    def setPersonalPIN(value: String): Self = StObject.set(x, "PersonalPIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalPINUndefined: Self = StObject.set(x, "PersonalPIN", js.undefined)
    
    @scala.inline
    def setPrimaryEmail(value: EmailAddress): Self = StObject.set(x, "PrimaryEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEmailUndefined: Self = StObject.set(x, "PrimaryEmail", js.undefined)
    
    @scala.inline
    def setPrimaryProvisionedNumber(value: SensitiveString): Self = StObject.set(x, "PrimaryProvisionedNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryProvisionedNumberUndefined: Self = StObject.set(x, "PrimaryProvisionedNumber", js.undefined)
    
    @scala.inline
    def setRegisteredOn(value: js.Date): Self = StObject.set(x, "RegisteredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredOnUndefined: Self = StObject.set(x, "RegisteredOn", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInvitationStatus(value: InviteStatus): Self = StObject.set(x, "UserInvitationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInvitationStatusUndefined: Self = StObject.set(x, "UserInvitationStatus", js.undefined)
    
    @scala.inline
    def setUserRegistrationStatus(value: RegistrationStatus): Self = StObject.set(x, "UserRegistrationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRegistrationStatusUndefined: Self = StObject.set(x, "UserRegistrationStatus", js.undefined)
    
    @scala.inline
    def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
