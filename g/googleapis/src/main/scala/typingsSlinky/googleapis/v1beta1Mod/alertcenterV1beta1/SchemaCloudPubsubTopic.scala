package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

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
trait SchemaCloudPubsubTopic extends js.Object {
  
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
  implicit class SchemaCloudPubsubTopicOps[Self <: SchemaCloudPubsubTopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPayloadFormat(value: String): Self = this.set("payloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadFormat: Self = this.set("payloadFormat", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = this.set("topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("topicName", js.undefined)
  }
}
