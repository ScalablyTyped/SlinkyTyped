package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobStatusRequest extends StObject {
  
  /**
    * 
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID of the job whose status you want to update.
    */
  var JobId: typingsSlinky.awsSdk.s3controlMod.JobId = js.native
  
  /**
    * The status that you want to move the specified job to.
    */
  var RequestedJobStatus: typingsSlinky.awsSdk.s3controlMod.RequestedJobStatus = js.native
  
  /**
    * A description of the reason why you want to change the specified job's status. This field can be any string up to the maximum length.
    */
  var StatusUpdateReason: js.UndefOr[JobStatusUpdateReason] = js.native
}
object UpdateJobStatusRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId, RequestedJobStatus: RequestedJobStatus): UpdateJobStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], RequestedJobStatus = RequestedJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobStatusRequest]
  }
  
  @scala.inline
  implicit class UpdateJobStatusRequestMutableBuilder[Self <: UpdateJobStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedJobStatus(value: RequestedJobStatus): Self = StObject.set(x, "RequestedJobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateReason(value: JobStatusUpdateReason): Self = StObject.set(x, "StatusUpdateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUpdateReasonUndefined: Self = StObject.set(x, "StatusUpdateReason", js.undefined)
  }
}
