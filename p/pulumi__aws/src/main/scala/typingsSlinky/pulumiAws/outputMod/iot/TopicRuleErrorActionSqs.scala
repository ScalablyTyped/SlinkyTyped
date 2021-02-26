package typingsSlinky.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleErrorActionSqs extends StObject {
  
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: String = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: String = js.native
  
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Boolean = js.native
}
object TopicRuleErrorActionSqs {
  
  @scala.inline
  def apply(queueUrl: String, roleArn: String, useBase64: Boolean): TopicRuleErrorActionSqs = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionSqs]
  }
  
  @scala.inline
  implicit class TopicRuleErrorActionSqsMutableBuilder[Self <: TopicRuleErrorActionSqs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: String): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBase64(value: Boolean): Self = StObject.set(x, "useBase64", value.asInstanceOf[js.Any])
  }
}
