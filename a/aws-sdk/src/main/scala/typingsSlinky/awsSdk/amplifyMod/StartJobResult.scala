package typingsSlinky.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartJobResult extends StObject {
  
  /**
    *  The summary for the job. 
    */
  var jobSummary: JobSummary = js.native
}
object StartJobResult {
  
  @scala.inline
  def apply(jobSummary: JobSummary): StartJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobResult]
  }
  
  @scala.inline
  implicit class StartJobResultMutableBuilder[Self <: StartJobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobSummary(value: JobSummary): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
  }
}
