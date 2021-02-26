package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTopicInput extends StObject {
  
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the CreateTopic action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    FifoTopic – Set to true to create a FIFO topic.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId – The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the AWS Key Management Service API Reference.    The following attributes apply only to FIFO topics:    FifoTopic – When this is set to true, a FIFO topic is created.    ContentBasedDeduplication – Enables content-based deduplication for FIFO topics.    By default, ContentBasedDeduplication is set to false. If you create a FIFO topic and this attribute is false, you must specify a value for the MessageDeduplicationId parameter for the Publish action.    When you set ContentBasedDeduplication to true, Amazon SNS uses a SHA-256 hash to generate the MessageDeduplicationId using the body of the message (but not the attributes of the message). (Optional) To override the generated value, you can specify a value for the the MessageDeduplicationId parameter for the Publish action.    
    */
  var Attributes: js.UndefOr[TopicAttributesMap] = js.native
  
  /**
    * The name of the topic you want to create. Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 256 characters long. For a FIFO (first-in-first-out) topic, the name must end with the .fifo suffix. 
    */
  var Name: topicName = js.native
  
  /**
    * The list of tags to add to a new topic.  To be able to tag a topic on creation, you must have the sns:CreateTopic and sns:TagResource permissions. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateTopicInput {
  
  @scala.inline
  def apply(Name: topicName): CreateTopicInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicInput]
  }
  
  @scala.inline
  implicit class CreateTopicInputMutableBuilder[Self <: CreateTopicInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: TopicAttributesMap): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setName(value: topicName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
