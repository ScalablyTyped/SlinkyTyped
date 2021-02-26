package typingsSlinky.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLog extends StObject {
  
  /**
    * The interval for publishing the access logs. You can specify an interval of either 5 minutes or 60 minutes. Default: 60 minutes
    */
  var EmitInterval: js.UndefOr[AccessLogInterval] = js.native
  
  /**
    * Specifies whether access logs are enabled for the load balancer.
    */
  var Enabled: AccessLogEnabled = js.native
  
  /**
    * The name of the Amazon S3 bucket where the access logs are stored.
    */
  var S3BucketName: js.UndefOr[typingsSlinky.awsSdk.elbMod.S3BucketName] = js.native
  
  /**
    * The logical hierarchy you created for your Amazon S3 bucket, for example my-bucket-prefix/prod. If the prefix is not provided, the log is placed at the root level of the bucket.
    */
  var S3BucketPrefix: js.UndefOr[AccessLogPrefix] = js.native
}
object AccessLog {
  
  @scala.inline
  def apply(Enabled: AccessLogEnabled): AccessLog = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLog]
  }
  
  @scala.inline
  implicit class AccessLogMutableBuilder[Self <: AccessLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitInterval(value: AccessLogInterval): Self = StObject.set(x, "EmitInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitIntervalUndefined: Self = StObject.set(x, "EmitInterval", js.undefined)
    
    @scala.inline
    def setEnabled(value: AccessLogEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setS3BucketPrefix(value: AccessLogPrefix): Self = StObject.set(x, "S3BucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketPrefixUndefined: Self = StObject.set(x, "S3BucketPrefix", js.undefined)
  }
}
