package typingsSlinky.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionKinesis extends StObject {
  
  /**
    * The partition key.
    */
  var partitionKey: js.UndefOr[String] = js.native
  
  /**
    * The ARN of the IAM role that grants access to the Amazon Kinesis stream.
    */
  var roleArn: String = js.native
  
  /**
    * The name of the Amazon Kinesis stream.
    */
  var streamName: String = js.native
}
object TopicRuleErrorActionKinesis {
  
  @scala.inline
  def apply(roleArn: String, streamName: String): TopicRuleErrorActionKinesis = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionKinesis]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionKinesisMutableBuilder[Self <: TopicRuleErrorActionKinesis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
  }
}
