package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SNSDestination extends StObject {
  
  /**
    * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicARN: AmazonResourceName = js.native
}
object SNSDestination {
  
  @scala.inline
  def apply(TopicARN: AmazonResourceName): SNSDestination = {
    val __obj = js.Dynamic.literal(TopicARN = TopicARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSDestination]
  }
  
  @scala.inline
  implicit class SNSDestinationMutableBuilder[Self <: SNSDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicARN(value: AmazonResourceName): Self = StObject.set(x, "TopicARN", value.asInstanceOf[js.Any])
  }
}
