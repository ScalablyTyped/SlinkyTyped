package typingsSlinky.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingLoggingConfig extends StObject {
  
  /**
    * The Amazon S3 bucket to store the access logs in, for example, myawslogbucket.s3.amazonaws.com.
    */
  var Bucket: String = js.native
  
  /**
    * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable logging when you create a streaming distribution or if you want to disable logging for an existing streaming distribution, specify false for Enabled, and specify empty Bucket and Prefix elements. If you specify false for Enabled but you specify values for Bucket and Prefix, the values are automatically deleted. 
    */
  var Enabled: Boolean = js.native
  
  /**
    * An optional string that you want CloudFront to prefix to the access log filenames for this streaming distribution, for example, myprefix/. If you want to enable logging, but you don't want to specify a prefix, you still must include an empty Prefix element in the Logging element.
    */
  var Prefix: String = js.native
}
object StreamingLoggingConfig {
  
  @scala.inline
  def apply(Bucket: String, Enabled: Boolean, Prefix: String): StreamingLoggingConfig = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingLoggingConfig]
  }
  
  @scala.inline
  implicit class StreamingLoggingConfigMutableBuilder[Self <: StreamingLoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
  }
}
