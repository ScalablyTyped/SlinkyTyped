package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyJob extends StObject {
  
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  
  /**
    * The identifier used to identify the job in AWS CodePipeline.
    */
  var jobId: js.UndefOr[JobId] = js.native
}
object ThirdPartyJob {
  
  @scala.inline
  def apply(): ThirdPartyJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyJob]
  }
  
  @scala.inline
  implicit class ThirdPartyJobMutableBuilder[Self <: ThirdPartyJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
  }
}
