package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTimeout extends StObject {
  
  /**
    * The time duration in seconds (measured from the job attempt's startedAt timestamp) after which AWS Batch terminates your jobs if they have not finished.
    */
  var attemptDurationSeconds: js.UndefOr[Integer] = js.native
}
object JobTimeout {
  
  @scala.inline
  def apply(): JobTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTimeout]
  }
  
  @scala.inline
  implicit class JobTimeoutMutableBuilder[Self <: JobTimeout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttemptDurationSeconds(value: Integer): Self = StObject.set(x, "attemptDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptDurationSecondsUndefined: Self = StObject.set(x, "attemptDurationSeconds", js.undefined)
  }
}
