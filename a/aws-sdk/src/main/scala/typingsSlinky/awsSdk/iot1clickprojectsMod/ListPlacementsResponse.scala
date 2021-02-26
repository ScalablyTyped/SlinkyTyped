package typingsSlinky.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlacementsResponse extends StObject {
  
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An object listing the requested placements.
    */
  var placements: PlacementSummaryList = js.native
}
object ListPlacementsResponse {
  
  @scala.inline
  def apply(placements: PlacementSummaryList): ListPlacementsResponse = {
    val __obj = js.Dynamic.literal(placements = placements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlacementsResponse]
  }
  
  @scala.inline
  implicit class ListPlacementsResponseMutableBuilder[Self <: ListPlacementsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPlacements(value: PlacementSummaryList): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementsVarargs(value: PlacementSummary*): Self = StObject.set(x, "placements", js.Array(value :_*))
  }
}
