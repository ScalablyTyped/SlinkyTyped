package typingsSlinky.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfig extends StObject {
  
  /**
    * The service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account. 
    */
  var cloudWatchLogsRoleArn: String = js.native
  
  /**
    * Set to TRUE to exclude sections that contain information such as headers, context, and evaluated mapping templates, regardless of logging level.
    */
  var excludeVerboseContent: js.UndefOr[Boolean] = js.native
  
  /**
    * The field logging level. Values can be NONE, ERROR, or ALL.     NONE: No field-level logs are captured.    ERROR: Logs the following information only for the fields that are in error:   The error section in the server response.   Field-level errors.   The generated request/response functions that got resolved for error fields.      ALL: The following information is logged for all fields in the query:   Field-level tracing information.   The generated request/response functions that got resolved for each field.    
    */
  var fieldLogLevel: FieldLogLevel = js.native
}
object LogConfig {
  
  @scala.inline
  def apply(cloudWatchLogsRoleArn: String, fieldLogLevel: FieldLogLevel): LogConfig = {
    val __obj = js.Dynamic.literal(cloudWatchLogsRoleArn = cloudWatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit class LogConfigMutableBuilder[Self <: LogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchLogsRoleArn(value: String): Self = StObject.set(x, "cloudWatchLogsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVerboseContent(value: Boolean): Self = StObject.set(x, "excludeVerboseContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeVerboseContentUndefined: Self = StObject.set(x, "excludeVerboseContent", js.undefined)
    
    @scala.inline
    def setFieldLogLevel(value: FieldLogLevel): Self = StObject.set(x, "fieldLogLevel", value.asInstanceOf[js.Any])
  }
}
