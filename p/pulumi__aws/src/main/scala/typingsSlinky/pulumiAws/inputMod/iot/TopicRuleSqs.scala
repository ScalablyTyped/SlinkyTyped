package typingsSlinky.pulumiAws.inputMod.iot

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleSqs extends StObject {
  
  /**
    * The URL of the Amazon SQS queue.
    */
  var queueUrl: Input[String] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * Specifies whether to use Base64 encoding.
    */
  var useBase64: Input[Boolean] = js.native
}
object TopicRuleSqs {
  
  @scala.inline
  def apply(queueUrl: Input[String], roleArn: Input[String], useBase64: Input[Boolean]): TopicRuleSqs = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleSqs]
  }
  
  @scala.inline
  implicit class TopicRuleSqsMutableBuilder[Self <: TopicRuleSqs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueueUrl(value: Input[String]): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBase64(value: Input[Boolean]): Self = StObject.set(x, "useBase64", value.asInstanceOf[js.Any])
  }
}
