package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermsAndConditionsAcceptanceStatus extends Entity {
  
  // DateTime when the terms were last accepted by the user.
  var acceptedDateTime: js.UndefOr[String] = js.native
  
  // Most recent version number of the T&amp;C accepted by the user.
  var acceptedVersion: js.UndefOr[Double] = js.native
  
  // Navigation link to the terms and conditions that are assigned.
  var termsAndConditions: js.UndefOr[NullableOption[TermsAndConditions]] = js.native
  
  // Display name of the user whose acceptance the entity represents.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The userPrincipalName of the User that accepted the term.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.native
}
object TermsAndConditionsAcceptanceStatus {
  
  @scala.inline
  def apply(): TermsAndConditionsAcceptanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditionsAcceptanceStatus]
  }
  
  @scala.inline
  implicit class TermsAndConditionsAcceptanceStatusMutableBuilder[Self <: TermsAndConditionsAcceptanceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptedDateTime(value: String): Self = StObject.set(x, "acceptedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedDateTimeUndefined: Self = StObject.set(x, "acceptedDateTime", js.undefined)
    
    @scala.inline
    def setAcceptedVersion(value: Double): Self = StObject.set(x, "acceptedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedVersionUndefined: Self = StObject.set(x, "acceptedVersion", js.undefined)
    
    @scala.inline
    def setTermsAndConditions(value: NullableOption[TermsAndConditions]): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermsAndConditionsNull: Self = StObject.set(x, "termsAndConditions", null)
    
    @scala.inline
    def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
    
    @scala.inline
    def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    @scala.inline
    def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
