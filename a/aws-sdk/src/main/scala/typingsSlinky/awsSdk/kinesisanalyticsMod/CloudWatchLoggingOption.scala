package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLoggingOption extends StObject {
  
  /**
    * ARN of the CloudWatch log to receive application messages.
    */
  var LogStreamARN: typingsSlinky.awsSdk.kinesisanalyticsMod.LogStreamARN = js.native
  
  /**
    * IAM ARN of the role to use to send application messages. Note: To write application messages to CloudWatch, the IAM role that is used must have the PutLogEvents policy action enabled.
    */
  var RoleARN: typingsSlinky.awsSdk.kinesisanalyticsMod.RoleARN = js.native
}
object CloudWatchLoggingOption {
  
  @scala.inline
  def apply(LogStreamARN: LogStreamARN, RoleARN: RoleARN): CloudWatchLoggingOption = {
    val __obj = js.Dynamic.literal(LogStreamARN = LogStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLoggingOption]
  }
  
  @scala.inline
  implicit class CloudWatchLoggingOptionMutableBuilder[Self <: CloudWatchLoggingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogStreamARN(value: LogStreamARN): Self = StObject.set(x, "LogStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
