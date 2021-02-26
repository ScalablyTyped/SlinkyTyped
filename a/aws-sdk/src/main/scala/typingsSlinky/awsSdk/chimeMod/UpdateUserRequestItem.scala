package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserRequestItem extends StObject {
  
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typingsSlinky.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.native
  
  /**
    * The user license type.
    */
  var LicenseType: js.UndefOr[License] = js.native
  
  /**
    * The user ID.
    */
  var UserId: NonEmptyString = js.native
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typingsSlinky.awsSdk.chimeMod.UserType] = js.native
}
object UpdateUserRequestItem {
  
  @scala.inline
  def apply(UserId: NonEmptyString): UpdateUserRequestItem = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequestItem]
  }
  
  @scala.inline
  implicit class UpdateUserRequestItemMutableBuilder[Self <: UpdateUserRequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = StObject.set(x, "AlexaForBusinessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaForBusinessMetadataUndefined: Self = StObject.set(x, "AlexaForBusinessMetadata", js.undefined)
    
    @scala.inline
    def setLicenseType(value: License): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    @scala.inline
    def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
