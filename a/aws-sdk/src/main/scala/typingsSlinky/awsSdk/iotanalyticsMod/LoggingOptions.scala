package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingOptions extends StObject {
  
  /**
    * If true, logging is enabled for AWS IoT Analytics.
    */
  var enabled: LoggingEnabled = js.native
  
  /**
    * The logging level. Currently, only ERROR is supported.
    */
  var level: LoggingLevel = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT Analytics to perform logging.
    */
  var roleArn: RoleArn = js.native
}
object LoggingOptions {
  
  @scala.inline
  def apply(enabled: LoggingEnabled, level: LoggingLevel, roleArn: RoleArn): LoggingOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
  
  @scala.inline
  implicit class LoggingOptionsMutableBuilder[Self <: LoggingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: LoggingEnabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LoggingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
