package typingsSlinky.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInsightRequest extends StObject {
  
  /**
    * The insight's unique identifier. Use the GetInsightSummaries action to retrieve an InsightId.
    */
  var InsightId: typingsSlinky.awsSdk.xrayMod.InsightId = js.native
}
object GetInsightRequest {
  
  @scala.inline
  def apply(InsightId: InsightId): GetInsightRequest = {
    val __obj = js.Dynamic.literal(InsightId = InsightId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInsightRequest]
  }
  
  @scala.inline
  implicit class GetInsightRequestMutableBuilder[Self <: GetInsightRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
  }
}
