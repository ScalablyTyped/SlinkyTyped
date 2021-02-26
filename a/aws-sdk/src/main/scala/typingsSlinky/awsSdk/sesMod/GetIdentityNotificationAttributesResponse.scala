package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityNotificationAttributesResponse extends StObject {
  
  /**
    * A map of Identity to IdentityNotificationAttributes.
    */
  var NotificationAttributes: typingsSlinky.awsSdk.sesMod.NotificationAttributes = js.native
}
object GetIdentityNotificationAttributesResponse {
  
  @scala.inline
  def apply(NotificationAttributes: NotificationAttributes): GetIdentityNotificationAttributesResponse = {
    val __obj = js.Dynamic.literal(NotificationAttributes = NotificationAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityNotificationAttributesResponse]
  }
  
  @scala.inline
  implicit class GetIdentityNotificationAttributesResponseMutableBuilder[Self <: GetIdentityNotificationAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationAttributes(value: NotificationAttributes): Self = StObject.set(x, "NotificationAttributes", value.asInstanceOf[js.Any])
  }
}
