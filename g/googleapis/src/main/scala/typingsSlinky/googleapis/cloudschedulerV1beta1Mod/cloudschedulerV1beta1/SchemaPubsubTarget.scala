package typingsSlinky.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pub/Sub target. The job will be delivered by publishing a message to the
  * given Pub/Sub topic.
  */
@js.native
trait SchemaPubsubTarget extends StObject {
  
  /**
    * Attributes for PubsubMessage.  Pubsub message must contain either
    * non-empty data, or at least one attribute.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The message payload for PubsubMessage.  Pubsub message must contain
    * either non-empty data, or at least one attribute.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Required.  The name of the Cloud Pub/Sub topic to which messages will be
    * published when a job is delivered. The topic name must be in the same
    * format as required by PubSub&#39;s
    * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest),
    * for example `projects/PROJECT_ID/topics/TOPIC_ID`.  The topic must be in
    * the same project as the Cloud Scheduler job.
    */
  var topicName: js.UndefOr[String] = js.native
}
object SchemaPubsubTarget {
  
  @scala.inline
  def apply(): SchemaPubsubTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubTarget]
  }
  
  @scala.inline
  implicit class SchemaPubsubTargetMutableBuilder[Self <: SchemaPubsubTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
