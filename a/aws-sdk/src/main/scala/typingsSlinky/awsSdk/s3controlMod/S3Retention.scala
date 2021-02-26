package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Retention extends StObject {
  
  /**
    * The Object Lock retention mode to be applied to all objects in the Batch Operations job.
    */
  var Mode: js.UndefOr[S3ObjectLockRetentionMode] = js.native
  
  /**
    * The date when the applied Object Lock retention will expire on all objects set by the Batch Operations job.
    */
  var RetainUntilDate: js.UndefOr[js.Date] = js.native
}
object S3Retention {
  
  @scala.inline
  def apply(): S3Retention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Retention]
  }
  
  @scala.inline
  implicit class S3RetentionMutableBuilder[Self <: S3Retention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: S3ObjectLockRetentionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setRetainUntilDate(value: js.Date): Self = StObject.set(x, "RetainUntilDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainUntilDateUndefined: Self = StObject.set(x, "RetainUntilDate", js.undefined)
  }
}
