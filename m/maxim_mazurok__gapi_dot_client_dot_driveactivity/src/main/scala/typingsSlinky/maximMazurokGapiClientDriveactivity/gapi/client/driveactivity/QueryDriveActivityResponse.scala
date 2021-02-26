package typingsSlinky.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDriveActivityResponse extends StObject {
  
  /** List of activity requested. */
  var activities: js.UndefOr[js.Array[DriveActivity]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object QueryDriveActivityResponse {
  
  @scala.inline
  def apply(): QueryDriveActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDriveActivityResponse]
  }
  
  @scala.inline
  implicit class QueryDriveActivityResponseMutableBuilder[Self <: QueryDriveActivityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: js.Array[DriveActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: DriveActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
