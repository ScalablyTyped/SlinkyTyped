package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcknowledgeJobInput extends StObject {
  
  /**
    * The unique system-generated ID of the job for which you want to confirm receipt.
    */
  var jobId: JobId = js.native
  
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Get this number from the response of the PollForJobs request that returned this job.
    */
  var nonce: Nonce = js.native
}
object AcknowledgeJobInput {
  
  @scala.inline
  def apply(jobId: JobId, nonce: Nonce): AcknowledgeJobInput = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeJobInput]
  }
  
  @scala.inline
  implicit class AcknowledgeJobInputMutableBuilder[Self <: AcknowledgeJobInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: Nonce): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
  }
}
