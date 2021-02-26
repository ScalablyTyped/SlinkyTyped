package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeliverabilityTestReportRequest extends StObject {
  
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: typingsSlinky.awsSdk.sesv2Mod.ReportId = js.native
}
object GetDeliverabilityTestReportRequest {
  
  @scala.inline
  def apply(ReportId: ReportId): GetDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportRequest]
  }
  
  @scala.inline
  implicit class GetDeliverabilityTestReportRequestMutableBuilder[Self <: GetDeliverabilityTestReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportId(value: ReportId): Self = StObject.set(x, "ReportId", value.asInstanceOf[js.Any])
  }
}
