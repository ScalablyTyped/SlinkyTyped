package typingsSlinky.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoutinesResponse extends StObject {
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Routines in the requested dataset. Unless read_mask is set in the request, only the following fields are populated: etag, project_id, dataset_id, routine_id, routine_type,
    * creation_time, last_modified_time, and language.
    */
  var routines: js.UndefOr[js.Array[Routine]] = js.native
}
object ListRoutinesResponse {
  
  @scala.inline
  def apply(): ListRoutinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutinesResponse]
  }
  
  @scala.inline
  implicit class ListRoutinesResponseMutableBuilder[Self <: ListRoutinesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRoutines(value: js.Array[Routine]): Self = StObject.set(x, "routines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutinesUndefined: Self = StObject.set(x, "routines", js.undefined)
    
    @scala.inline
    def setRoutinesVarargs(value: Routine*): Self = StObject.set(x, "routines", js.Array(value :_*))
  }
}
