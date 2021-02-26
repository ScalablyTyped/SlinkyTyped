package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTopicsDetectionJobRequest extends StObject {
  
  /**
    * The identifier assigned by the user to the detection job.
    */
  var JobId: typingsSlinky.awsSdk.comprehendMod.JobId = js.native
}
object DescribeTopicsDetectionJobRequest {
  
  @scala.inline
  def apply(JobId: JobId): DescribeTopicsDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTopicsDetectionJobRequest]
  }
  
  @scala.inline
  implicit class DescribeTopicsDetectionJobRequestMutableBuilder[Self <: DescribeTopicsDetectionJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
