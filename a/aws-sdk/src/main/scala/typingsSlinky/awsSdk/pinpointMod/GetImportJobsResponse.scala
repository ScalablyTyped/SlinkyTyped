package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImportJobsResponse extends StObject {
  
  var ImportJobsResponse: typingsSlinky.awsSdk.pinpointMod.ImportJobsResponse = js.native
}
object GetImportJobsResponse {
  
  @scala.inline
  def apply(ImportJobsResponse: ImportJobsResponse): GetImportJobsResponse = {
    val __obj = js.Dynamic.literal(ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImportJobsResponse]
  }
  
  @scala.inline
  implicit class GetImportJobsResponseMutableBuilder[Self <: GetImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportJobsResponse(value: ImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
  }
}
