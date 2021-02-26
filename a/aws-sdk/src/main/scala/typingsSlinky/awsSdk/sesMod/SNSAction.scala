package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SNSAction extends StObject {
  
  /**
    * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all special characters. The default value is UTF-8.
    */
  var Encoding: js.UndefOr[SNSActionEncoding] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: AmazonResourceName = js.native
}
object SNSAction {
  
  @scala.inline
  def apply(TopicArn: AmazonResourceName): SNSAction = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSAction]
  }
  
  @scala.inline
  implicit class SNSActionMutableBuilder[Self <: SNSAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: SNSActionEncoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "Encoding", js.undefined)
    
    @scala.inline
    def setTopicArn(value: AmazonResourceName): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
