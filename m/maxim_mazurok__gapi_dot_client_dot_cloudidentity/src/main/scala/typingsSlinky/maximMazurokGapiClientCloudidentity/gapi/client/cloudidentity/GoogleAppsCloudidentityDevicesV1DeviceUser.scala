package typingsSlinky.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1DeviceUser extends StObject {
  
  /** Compromised State of the DeviceUser object */
  var compromisedState: js.UndefOr[String] = js.native
  
  /** When the user first signed in to the device */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. Most recent time when user registered with this service. */
  var firstSyncTime: js.UndefOr[String] = js.native
  
  /** Output only. Default locale used on device, in IETF BCP-47 format. */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Output only. Last time when user synced with policies. */
  var lastSyncTime: js.UndefOr[String] = js.native
  
  /** Output only. Management state of the user on the device. */
  var managementState: js.UndefOr[String] = js.native
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the DeviceUser in format: `devices/{device_id}/deviceUsers/{user_id}`, where user_id is the ID
    * of the user associated with the user session.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Password state of the DeviceUser object */
  var passwordState: js.UndefOr[String] = js.native
  
  /** Output only. User agent on the device for this specific user */
  var userAgent: js.UndefOr[String] = js.native
  
  /** Email address of the user registered on the device. */
  var userEmail: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1DeviceUser {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1DeviceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1DeviceUser]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1DeviceUserMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1DeviceUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompromisedState(value: String): Self = StObject.set(x, "compromisedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompromisedStateUndefined: Self = StObject.set(x, "compromisedState", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFirstSyncTime(value: String): Self = StObject.set(x, "firstSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSyncTimeUndefined: Self = StObject.set(x, "firstSyncTime", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setLastSyncTime(value: String): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSyncTimeUndefined: Self = StObject.set(x, "lastSyncTime", js.undefined)
    
    @scala.inline
    def setManagementState(value: String): Self = StObject.set(x, "managementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagementStateUndefined: Self = StObject.set(x, "managementState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPasswordState(value: String): Self = StObject.set(x, "passwordState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordStateUndefined: Self = StObject.set(x, "passwordState", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
