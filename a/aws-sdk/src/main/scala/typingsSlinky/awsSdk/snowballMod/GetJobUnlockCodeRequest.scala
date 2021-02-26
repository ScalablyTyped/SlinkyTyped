package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobUnlockCodeRequest extends StObject {
  
  /**
    * The ID for the job that you want to get the UnlockCode value for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typingsSlinky.awsSdk.snowballMod.JobId = js.native
}
object GetJobUnlockCodeRequest {
  
  @scala.inline
  def apply(JobId: JobId): GetJobUnlockCodeRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobUnlockCodeRequest]
  }
  
  @scala.inline
  implicit class GetJobUnlockCodeRequestMutableBuilder[Self <: GetJobUnlockCodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
