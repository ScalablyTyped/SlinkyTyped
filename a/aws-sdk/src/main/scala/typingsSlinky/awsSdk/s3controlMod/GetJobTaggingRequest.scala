package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobTaggingRequest extends StObject {
  
  /**
    * The AWS account ID associated with the S3 Batch Operations job.
    */
  var AccountId: typingsSlinky.awsSdk.s3controlMod.AccountId = js.native
  
  /**
    * The ID for the S3 Batch Operations job whose tags you want to retrieve.
    */
  var JobId: typingsSlinky.awsSdk.s3controlMod.JobId = js.native
}
object GetJobTaggingRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId): GetJobTaggingRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobTaggingRequest]
  }
  
  @scala.inline
  implicit class GetJobTaggingRequestMutableBuilder[Self <: GetJobTaggingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
