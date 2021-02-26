package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UserProfile extends StObject {
  
  /**
    * The user's full name as specified in their Google account.
    * Requires the NAME permission.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The user's last name as specified in their Google account.
    * Note that this field could be empty.
    * Requires the NAME permission.
    */
  var familyName: js.UndefOr[String] = js.native
  
  /**
    * The user's first name as specified in their Google account.
    * Requires the NAME permission.
    */
  var givenName: js.UndefOr[String] = js.native
}
object GoogleActionsV2UserProfile {
  
  @scala.inline
  def apply(): GoogleActionsV2UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UserProfile]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UserProfileMutableBuilder[Self <: GoogleActionsV2UserProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
