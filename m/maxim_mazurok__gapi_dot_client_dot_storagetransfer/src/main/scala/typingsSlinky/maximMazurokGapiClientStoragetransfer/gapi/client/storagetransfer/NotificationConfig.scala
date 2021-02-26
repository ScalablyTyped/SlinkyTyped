package typingsSlinky.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationConfig extends StObject {
  
  /** Event types for which a notification is desired. If empty, send notifications for all event types. */
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The desired format of the notification message payloads. */
  var payloadFormat: js.UndefOr[String] = js.native
  
  /**
    * Required. The `Topic.name` of the Cloud Pub/Sub topic to which to publish notifications. Must be of the format: `projects/{project}/topics/{topic}`. Not matching this format will
    * result in an INVALID_ARGUMENT error.
    */
  var pubsubTopic: js.UndefOr[String] = js.native
}
object NotificationConfig {
  
  @scala.inline
  def apply(): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfig]
  }
  
  @scala.inline
  implicit class NotificationConfigMutableBuilder[Self <: NotificationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTypes(value: js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setPayloadFormat(value: String): Self = StObject.set(x, "payloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFormatUndefined: Self = StObject.set(x, "payloadFormat", js.undefined)
    
    @scala.inline
    def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
  }
}
