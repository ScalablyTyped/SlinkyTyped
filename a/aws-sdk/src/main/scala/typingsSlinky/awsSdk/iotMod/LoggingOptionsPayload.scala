package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptionsPayload extends js.Object {
  
  /**
    * The log level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
}
object LoggingOptionsPayload {
  
  @scala.inline
  def apply(roleArn: AwsArn): LoggingOptionsPayload = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptionsPayload]
  }
  
  @scala.inline
  implicit class LoggingOptionsPayloadOps[Self <: LoggingOptionsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoleArn(value: AwsArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
  }
}
