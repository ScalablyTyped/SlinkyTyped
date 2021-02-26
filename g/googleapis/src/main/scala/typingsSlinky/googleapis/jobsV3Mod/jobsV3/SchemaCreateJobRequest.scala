package typingsSlinky.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Create job request.
  */
@js.native
trait SchemaCreateJobRequest extends StObject {
  
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[SchemaJob] = js.native
}
object SchemaCreateJobRequest {
  
  @scala.inline
  def apply(): SchemaCreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateJobRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateJobRequestMutableBuilder[Self <: SchemaCreateJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
