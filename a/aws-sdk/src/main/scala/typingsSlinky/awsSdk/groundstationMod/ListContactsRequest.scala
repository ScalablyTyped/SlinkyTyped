package typingsSlinky.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactsRequest extends StObject {
  
  /**
    * End time of a contact.
    */
  var endTime: js.Date = js.native
  
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of contacts returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.native
  
  /**
    * Next token returned in the request of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typingsSlinky.awsSdk.groundstationMod.satelliteArn] = js.native
  
  /**
    * Start time of a contact.
    */
  var startTime: js.Date = js.native
  
  /**
    * Status of a contact reservation.
    */
  var statusList: StatusList = js.native
}
object ListContactsRequest {
  
  @scala.inline
  def apply(endTime: js.Date, startTime: js.Date, statusList: StatusList): ListContactsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusList = statusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactsRequest]
  }
  
  @scala.inline
  implicit class ListContactsRequestMutableBuilder[Self <: ListContactsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundStation(value: String): Self = StObject.set(x, "groundStation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroundStationUndefined: Self = StObject.set(x, "groundStation", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissionProfileArnUndefined: Self = StObject.set(x, "missionProfileArn", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatelliteArnUndefined: Self = StObject.set(x, "satelliteArn", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusList(value: StatusList): Self = StObject.set(x, "statusList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusListVarargs(value: ContactStatus*): Self = StObject.set(x, "statusList", js.Array(value :_*))
  }
}
