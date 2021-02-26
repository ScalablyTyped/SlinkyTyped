package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a Cloud Pubsub topic.  To register for notifications, the
  * owner of the topic must grant
  * `alerts-api-push-notifications@system.gserviceaccount.com` the
  * `projects.topics.publish` permission.
  */
@js.native
trait SchemaCloudPubsubTopic extends StObject {
  
  /**
    * Optional. The format of the payload that would be sent. If not specified
    * the format will be JSON.
    */
  var payloadFormat: js.UndefOr[String] = js.native
  
  /**
    * The `name` field of a Cloud Pubsub [Topic]
    * (https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic).
    */
  var topicName: js.UndefOr[String] = js.native
}
object SchemaCloudPubsubTopic {
  
  @scala.inline
  def apply(): SchemaCloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudPubsubTopic]
  }
  
  @scala.inline
  implicit class SchemaCloudPubsubTopicMutableBuilder[Self <: SchemaCloudPubsubTopic] (val x: Self) extends AnyVal {
    
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
