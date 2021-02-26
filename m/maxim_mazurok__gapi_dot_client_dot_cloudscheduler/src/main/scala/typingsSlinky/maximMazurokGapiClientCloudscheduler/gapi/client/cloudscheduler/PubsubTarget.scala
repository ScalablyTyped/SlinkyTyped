package typingsSlinky.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubsubTarget extends StObject {
  
  /** Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute. */
  var attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.PubsubTarget with TopLevel[js.Any]
  ] = js.native
  
  /** The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute. */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Required. The name of the Cloud Pub/Sub topic to which messages will be published when a job is delivered. The topic name must be in the same format as required by PubSub's
    * [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in
    * the same project as the Cloud Scheduler job.
    */
  var topicName: js.UndefOr[String] = js.native
}
object PubsubTarget {
  
  @scala.inline
  def apply(): PubsubTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubTarget]
  }
  
  @scala.inline
  implicit class PubsubTargetMutableBuilder[Self <: PubsubTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.PubsubTarget with TopLevel[js.Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
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
