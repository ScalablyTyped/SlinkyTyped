package typingsSlinky.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to submit a job.
  */
@js.native
trait SchemaSubmitJobRequest extends StObject {
  
  /**
    * Required. The job resource.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  
  /**
    * Optional. A unique id used to identify the request. If the server
    * receives two SubmitJobRequest requests with the same id, then the second
    * request will be ignored and the first Job created and stored in the
    * backend is returned.It is recommended to always set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and
    * hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}
object SchemaSubmitJobRequest {
  
  @scala.inline
  def apply(): SchemaSubmitJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmitJobRequest]
  }
  
  @scala.inline
  implicit class SchemaSubmitJobRequestMutableBuilder[Self <: SchemaSubmitJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
