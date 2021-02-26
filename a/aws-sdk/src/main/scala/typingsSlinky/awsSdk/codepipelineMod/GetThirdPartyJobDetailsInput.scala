package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThirdPartyJobDetailsInput extends StObject {
  
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The unique system-generated ID used for identifying the job.
    */
  var jobId: ThirdPartyJobId = js.native
}
object GetThirdPartyJobDetailsInput {
  
  @scala.inline
  def apply(clientToken: ClientToken, jobId: ThirdPartyJobId): GetThirdPartyJobDetailsInput = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThirdPartyJobDetailsInput]
  }
  
  @scala.inline
  implicit class GetThirdPartyJobDetailsInputMutableBuilder[Self <: GetThirdPartyJobDetailsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: ThirdPartyJobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
