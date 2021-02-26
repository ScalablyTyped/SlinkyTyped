package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionSummaryForJob extends StObject {
  
  /**
    * Contains a subset of information about a job execution.
    */
  var jobExecutionSummary: js.UndefOr[JobExecutionSummary] = js.native
  
  /**
    * The ARN of the thing on which the job execution is running.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
}
object JobExecutionSummaryForJob {
  
  @scala.inline
  def apply(): JobExecutionSummaryForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummaryForJob]
  }
  
  @scala.inline
  implicit class JobExecutionSummaryForJobMutableBuilder[Self <: JobExecutionSummaryForJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobExecutionSummary(value: JobExecutionSummary): Self = StObject.set(x, "jobExecutionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobExecutionSummaryUndefined: Self = StObject.set(x, "jobExecutionSummary", js.undefined)
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
  }
}
