package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VppToken extends Entity {
  
  // The apple Id associated with the given Apple Volume Purchase Program Token.
  var appleId: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether or not apps for the VPP token will be automatically updated.
  var automaticallyUpdateApps: js.UndefOr[Boolean] = js.native
  
  // Whether or not apps for the VPP token will be automatically updated.
  var countryOrRegion: js.UndefOr[NullableOption[String]] = js.native
  
  // The expiration date time of the Apple Volume Purchase Program Token.
  var expirationDateTime: js.UndefOr[String] = js.native
  
  // Last modification date time associated with the Apple Volume Purchase Program Token.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The last time when an application sync was done with the Apple volume purchase program service using the Apple Volume
    * Purchase Program Token.
    */
  var lastSyncDateTime: js.UndefOr[String] = js.native
  
  /**
    * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token.
    * Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
    */
  var lastSyncStatus: js.UndefOr[VppTokenSyncStatus] = js.native
  
  // The organization associated with the Apple Volume Purchase Program Token
  var organizationName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid,
    * assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM.
    */
  var state: js.UndefOr[VppTokenState] = js.native
  
  // The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
  var token: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.native
}
object VppToken {
  
  @scala.inline
  def apply(): VppToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VppToken]
  }
  
  @scala.inline
  implicit class VppTokenMutableBuilder[Self <: VppToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppleId(value: NullableOption[String]): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleIdNull: Self = StObject.set(x, "appleId", null)
    
    @scala.inline
    def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
    
    @scala.inline
    def setAutomaticallyUpdateApps(value: Boolean): Self = StObject.set(x, "automaticallyUpdateApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticallyUpdateAppsUndefined: Self = StObject.set(x, "automaticallyUpdateApps", js.undefined)
    
    @scala.inline
    def setCountryOrRegion(value: NullableOption[String]): Self = StObject.set(x, "countryOrRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryOrRegionNull: Self = StObject.set(x, "countryOrRegion", null)
    
    @scala.inline
    def setCountryOrRegionUndefined: Self = StObject.set(x, "countryOrRegion", js.undefined)
    
    @scala.inline
    def setExpirationDateTime(value: String): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    @scala.inline
    def setLastSyncStatus(value: VppTokenSyncStatus): Self = StObject.set(x, "lastSyncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncStatusUndefined: Self = StObject.set(x, "lastSyncStatus", js.undefined)
    
    @scala.inline
    def setOrganizationName(value: NullableOption[String]): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationNameNull: Self = StObject.set(x, "organizationName", null)
    
    @scala.inline
    def setOrganizationNameUndefined: Self = StObject.set(x, "organizationName", js.undefined)
    
    @scala.inline
    def setState(value: VppTokenState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setToken(value: NullableOption[String]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenNull: Self = StObject.set(x, "token", null)
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setVppTokenAccountType(value: VppTokenAccountType): Self = StObject.set(x, "vppTokenAccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVppTokenAccountTypeUndefined: Self = StObject.set(x, "vppTokenAccountType", js.undefined)
  }
}
