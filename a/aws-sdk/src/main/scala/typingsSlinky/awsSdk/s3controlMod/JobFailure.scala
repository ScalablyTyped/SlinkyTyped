package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobFailure extends StObject {
  
  /**
    * The failure code, if any, for the specified job.
    */
  var FailureCode: js.UndefOr[JobFailureCode] = js.native
  
  /**
    * The failure reason, if any, for the specified job.
    */
  var FailureReason: js.UndefOr[JobFailureReason] = js.native
}
object JobFailure {
  
  @scala.inline
  def apply(): JobFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFailure]
  }
  
  @scala.inline
  implicit class JobFailureMutableBuilder[Self <: JobFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCode(value: JobFailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: JobFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
  }
}
