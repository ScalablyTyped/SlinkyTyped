package typingsSlinky.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudPubsubTopic extends StObject {
  
  /** Optional. The format of the payload that would be sent. If not specified the format will be JSON. */
  var payloadFormat: js.UndefOr[String] = js.native
  
  /** The `name` field of a Cloud Pubsub [Topic] (https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic). */
  var topicName: js.UndefOr[String] = js.native
}
object CloudPubsubTopic {
  
  @scala.inline
  def apply(): CloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudPubsubTopic]
  }
  
  @scala.inline
  implicit class CloudPubsubTopicMutableBuilder[Self <: CloudPubsubTopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayloadFormat(value: String): Self = StObject.set(x, "payloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFormatUndefined: Self = StObject.set(x, "payloadFormat", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
