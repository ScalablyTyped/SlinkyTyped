package typingsSlinky.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollForThirdPartyJobsOutput extends StObject {
  
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[ThirdPartyJobList] = js.native
}
object PollForThirdPartyJobsOutput {
  
  @scala.inline
  def apply(): PollForThirdPartyJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForThirdPartyJobsOutput]
  }
  
  @scala.inline
  implicit class PollForThirdPartyJobsOutputMutableBuilder[Self <: PollForThirdPartyJobsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: ThirdPartyJobList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: ThirdPartyJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
  }
}
