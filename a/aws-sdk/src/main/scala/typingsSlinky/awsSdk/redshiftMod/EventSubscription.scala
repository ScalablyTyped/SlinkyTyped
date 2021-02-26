package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSubscription extends StObject {
  
  /**
    * The name of the Amazon Redshift event notification subscription.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.native
  
  /**
    * The AWS customer account associated with the Amazon Redshift event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.native
  
  /**
    * A boolean value indicating whether the subscription is enabled; true indicates that the subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The list of Amazon Redshift event categories specified in the event notification subscription. Values: Configuration, Management, Monitoring, Security
    */
  var EventCategoriesList: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.EventCategoriesList] = js.native
  
  /**
    * The event severity specified in the Amazon Redshift event notification subscription. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
  
  /**
    * A list of the sources that publish events to the Amazon Redshift event notification subscription.
    */
  var SourceIdsList: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.SourceIdsList] = js.native
  
  /**
    * The source type of the events returned by the Amazon Redshift event notification, such as cluster, cluster-snapshot, cluster-parameter-group, cluster-security-group, or scheduled-action. 
    */
  var SourceType: js.UndefOr[String] = js.native
  
  /**
    * The status of the Amazon Redshift event notification subscription. Constraints:   Can be one of the following: active | no-permission | topic-not-exist   The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.  
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The date and time the Amazon Redshift event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The list of tags for the event subscription.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object EventSubscription {
  
  @scala.inline
  def apply(): EventSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSubscription]
  }
  
  @scala.inline
  implicit class EventSubscriptionMutableBuilder[Self <: EventSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustSubscriptionId(value: String): Self = StObject.set(x, "CustSubscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustSubscriptionIdUndefined: Self = StObject.set(x, "CustSubscriptionId", js.undefined)
    
    @scala.inline
    def setCustomerAwsId(value: String): Self = StObject.set(x, "CustomerAwsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerAwsIdUndefined: Self = StObject.set(x, "CustomerAwsId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setEventCategoriesList(value: EventCategoriesList): Self = StObject.set(x, "EventCategoriesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCategoriesListUndefined: Self = StObject.set(x, "EventCategoriesList", js.undefined)
    
    @scala.inline
    def setEventCategoriesListVarargs(value: String*): Self = StObject.set(x, "EventCategoriesList", js.Array(value :_*))
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    @scala.inline
    def setSnsTopicArn(value: String): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    @scala.inline
    def setSourceIdsList(value: SourceIdsList): Self = StObject.set(x, "SourceIdsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdsListUndefined: Self = StObject.set(x, "SourceIdsList", js.undefined)
    
    @scala.inline
    def setSourceIdsListVarargs(value: String*): Self = StObject.set(x, "SourceIdsList", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubscriptionCreationTime(value: js.Date): Self = StObject.set(x, "SubscriptionCreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionCreationTimeUndefined: Self = StObject.set(x, "SubscriptionCreationTime", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
