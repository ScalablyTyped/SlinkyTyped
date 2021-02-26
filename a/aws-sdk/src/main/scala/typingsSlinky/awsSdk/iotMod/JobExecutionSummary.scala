package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionSummary extends StObject {
  
  /**
    * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used later in commands which return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  
  /**
    * The time, in seconds since the epoch, when the job execution was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The time, in seconds since the epoch, when the job execution was queued.
    */
  var queuedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The time, in seconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The status of the job execution.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
}
object JobExecutionSummary {
  
  @scala.inline
  def apply(): JobExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummary]
  }
  
  @scala.inline
  implicit class JobExecutionSummaryMutableBuilder[Self <: JobExecutionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNumberUndefined: Self = StObject.set(x, "executionNumber", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setQueuedAt(value: js.Date): Self = StObject.set(x, "queuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedAtUndefined: Self = StObject.set(x, "queuedAt", js.undefined)
    
    @scala.inline
    def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
