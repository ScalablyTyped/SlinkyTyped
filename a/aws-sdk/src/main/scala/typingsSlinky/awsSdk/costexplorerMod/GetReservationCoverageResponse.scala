package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReservationCoverageResponse extends StObject {
  
  /**
    * The amount of time that your reservations covered.
    */
  var CoveragesByTime: typingsSlinky.awsSdk.costexplorerMod.CoveragesByTime = js.native
  
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NextPageToken] = js.native
  
  /**
    * The total amount of instance usage that a reservation covered.
    */
  var Total: js.UndefOr[Coverage] = js.native
}
object GetReservationCoverageResponse {
  
  @scala.inline
  def apply(CoveragesByTime: CoveragesByTime): GetReservationCoverageResponse = {
    val __obj = js.Dynamic.literal(CoveragesByTime = CoveragesByTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationCoverageResponse]
  }
  
  @scala.inline
  implicit class GetReservationCoverageResponseMutableBuilder[Self <: GetReservationCoverageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoveragesByTime(value: CoveragesByTime): Self = StObject.set(x, "CoveragesByTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoveragesByTimeVarargs(value: CoverageByTime*): Self = StObject.set(x, "CoveragesByTime", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setTotal(value: Coverage): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
