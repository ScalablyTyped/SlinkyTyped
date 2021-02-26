package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnsAction extends StObject {
  
  /**
    * (Optional) The message format of the message to publish. Accepted values are "JSON" and "RAW". The default value of the attribute is "RAW". SNS uses this setting to determine if the payload should be parsed and relevant platform-specific bits of the payload should be extracted. To read more about SNS message formats, see https://docs.aws.amazon.com/sns/latest/dg/json-formats.html refer to their official documentation.
    */
  var messageFormat: js.UndefOr[MessageFormat] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
  
  /**
    * The ARN of the SNS topic.
    */
  var targetArn: AwsArn = js.native
}
object SnsAction {
  
  @scala.inline
  def apply(roleArn: AwsArn, targetArn: AwsArn): SnsAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsAction]
  }
  
  @scala.inline
  implicit class SnsActionMutableBuilder[Self <: SnsAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageFormat(value: MessageFormat): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArn(value: AwsArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
