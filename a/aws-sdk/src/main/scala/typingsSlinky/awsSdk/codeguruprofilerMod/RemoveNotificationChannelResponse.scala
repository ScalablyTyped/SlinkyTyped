package typingsSlinky.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveNotificationChannelResponse extends StObject {
  
  /**
    * The new notification configuration for this profiling group.
    */
  var notificationConfiguration: js.UndefOr[NotificationConfiguration] = js.native
}
object RemoveNotificationChannelResponse {
  
  @scala.inline
  def apply(): RemoveNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveNotificationChannelResponse]
  }
  
  @scala.inline
  implicit class RemoveNotificationChannelResponseMutableBuilder[Self <: RemoveNotificationChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "notificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigurationUndefined: Self = StObject.set(x, "notificationConfiguration", js.undefined)
  }
}
