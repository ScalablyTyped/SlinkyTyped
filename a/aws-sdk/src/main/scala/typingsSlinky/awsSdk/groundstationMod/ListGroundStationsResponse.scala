package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGroundStationsResponse extends StObject {
  
  /**
    * List of ground stations.
    */
  var groundStationList: js.UndefOr[GroundStationList] = js.native
  
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListGroundStationsResponse {
  
  @scala.inline
  def apply(): ListGroundStationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsResponse]
  }
  
  @scala.inline
  implicit class ListGroundStationsResponseMutableBuilder[Self <: ListGroundStationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroundStationList(value: GroundStationList): Self = StObject.set(x, "groundStationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundStationListUndefined: Self = StObject.set(x, "groundStationList", js.undefined)
    
    @scala.inline
    def setGroundStationListVarargs(value: GroundStationData*): Self = StObject.set(x, "groundStationList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
