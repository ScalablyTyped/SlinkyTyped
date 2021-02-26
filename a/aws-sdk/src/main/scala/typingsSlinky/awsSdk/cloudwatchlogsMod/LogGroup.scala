package typingsSlinky.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the log group.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The creation time of the log group, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the CMK to use when encrypting log data.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.native
  
  /**
    * The number of metric filters.
    */
  var metricFilterCount: js.UndefOr[FilterCount] = js.native
  
  var retentionInDays: js.UndefOr[Days] = js.native
  
  /**
    * The number of bytes stored.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.native
}
object LogGroup {
  
  @scala.inline
  def apply(): LogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogGroup]
  }
  
  @scala.inline
  implicit class LogGroupMutableBuilder[Self <: LogGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    @scala.inline
    def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
    
    @scala.inline
    def setMetricFilterCount(value: FilterCount): Self = StObject.set(x, "metricFilterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricFilterCountUndefined: Self = StObject.set(x, "metricFilterCount", js.undefined)
    
    @scala.inline
    def setRetentionInDays(value: Days): Self = StObject.set(x, "retentionInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionInDaysUndefined: Self = StObject.set(x, "retentionInDays", js.undefined)
    
    @scala.inline
    def setStoredBytes(value: StoredBytes): Self = StObject.set(x, "storedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredBytesUndefined: Self = StObject.set(x, "storedBytes", js.undefined)
  }
}
