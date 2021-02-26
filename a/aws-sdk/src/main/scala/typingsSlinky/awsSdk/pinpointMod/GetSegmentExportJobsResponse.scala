package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSegmentExportJobsResponse extends StObject {
  
  var ExportJobsResponse: typingsSlinky.awsSdk.pinpointMod.ExportJobsResponse = js.native
}
object GetSegmentExportJobsResponse {
  
  @scala.inline
  def apply(ExportJobsResponse: ExportJobsResponse): GetSegmentExportJobsResponse = {
    val __obj = js.Dynamic.literal(ExportJobsResponse = ExportJobsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentExportJobsResponse]
  }
  
  @scala.inline
  implicit class GetSegmentExportJobsResponseMutableBuilder[Self <: GetSegmentExportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportJobsResponse(value: ExportJobsResponse): Self = StObject.set(x, "ExportJobsResponse", value.asInstanceOf[js.Any])
  }
}
