package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSegmentImportJobsResponse extends StObject {
  
  var ImportJobsResponse: typingsSlinky.awsSdk.pinpointMod.ImportJobsResponse = js.native
}
object GetSegmentImportJobsResponse {
  
  @scala.inline
  def apply(ImportJobsResponse: ImportJobsResponse): GetSegmentImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentImportJobsResponse]
  }
  
  @scala.inline
  implicit class GetSegmentImportJobsResponseMutableBuilder[Self <: GetSegmentImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportJobsResponse(value: ImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
  }
}
