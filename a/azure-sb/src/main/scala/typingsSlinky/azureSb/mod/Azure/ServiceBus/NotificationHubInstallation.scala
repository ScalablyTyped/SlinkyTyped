package typingsSlinky.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.azureSb.anon.Body
import typingsSlinky.azureSb.anon.PushChannel
import typingsSlinky.azureSb.azureSbStrings.adm
import typingsSlinky.azureSb.azureSbStrings.apns
import typingsSlinky.azureSb.azureSbStrings.gcm
import typingsSlinky.azureSb.azureSbStrings.mpns
import typingsSlinky.azureSb.azureSbStrings.wns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationHubInstallation extends StObject {
  
  val expirationTime: js.UndefOr[String] = js.native
  
  val expiredPushChannel: js.UndefOr[String] = js.native
  
  var installationId: String = js.native
  
  val lastActiveOn: js.UndefOr[String] = js.native
  
  val lastUpdate: js.UndefOr[String] = js.native
  
  var platform: apns | wns | mpns | adm | gcm = js.native
  
  var pushChannel: String = js.native
  
  var secondaryTile: js.UndefOr[StringDictionary[PushChannel]] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var templates: js.UndefOr[StringDictionary[Body]] = js.native
  
  var userId: js.UndefOr[String] = js.native
}
object NotificationHubInstallation {
  
  @scala.inline
  def apply(installationId: String, platform: apns | wns | mpns | adm | gcm, pushChannel: String): NotificationHubInstallation = {
    val __obj = js.Dynamic.literal(installationId = installationId.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pushChannel = pushChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationHubInstallation]
  }
  
  @scala.inline
  implicit class NotificationHubInstallationMutableBuilder[Self <: NotificationHubInstallation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setExpiredPushChannel(value: String): Self = StObject.set(x, "expiredPushChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredPushChannelUndefined: Self = StObject.set(x, "expiredPushChannel", js.undefined)
    
    @scala.inline
    def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActiveOn(value: String): Self = StObject.set(x, "lastActiveOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastActiveOnUndefined: Self = StObject.set(x, "lastActiveOn", js.undefined)
    
    @scala.inline
    def setLastUpdate(value: String): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateUndefined: Self = StObject.set(x, "lastUpdate", js.undefined)
    
    @scala.inline
    def setPlatform(value: apns | wns | mpns | adm | gcm): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushChannel(value: String): Self = StObject.set(x, "pushChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTile(value: StringDictionary[PushChannel]): Self = StObject.set(x, "secondaryTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTileUndefined: Self = StObject.set(x, "secondaryTile", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTemplates(value: StringDictionary[Body]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
