package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnomaliesResponse extends StObject {
  
  /**
    *  A list of cost anomalies. 
    */
  var Anomalies: typingsSlinky.awsSdk.costexplorerMod.Anomalies = js.native
  
  /**
    *  The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
}
object GetAnomaliesResponse {
  
  @scala.inline
  def apply(Anomalies: Anomalies): GetAnomaliesResponse = {
    val __obj = js.Dynamic.literal(Anomalies = Anomalies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomaliesResponse]
  }
  
  @scala.inline
  implicit class GetAnomaliesResponseMutableBuilder[Self <: GetAnomaliesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomalies(value: Anomalies): Self = StObject.set(x, "Anomalies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomaliesVarargs(value: Anomaly*): Self = StObject.set(x, "Anomalies", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
