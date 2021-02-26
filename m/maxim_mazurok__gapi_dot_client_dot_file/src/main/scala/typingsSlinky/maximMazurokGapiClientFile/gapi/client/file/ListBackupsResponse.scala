package typingsSlinky.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupsResponse extends StObject {
  
  /**
    * A list of backups in the project for the specified location. If the {location} value in the request is "-", the response contains a list of backups from all locations. If any
    * location is unreachable, the response will only return backups in reachable locations and the "unreachable" field will be populated with a list of unreachable locations.
    */
  var backups: js.UndefOr[js.Array[Backup]] = js.native
  
  /** The token you can use to retrieve the next page of results. Not returned if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListBackupsResponse {
  
  @scala.inline
  def apply(): ListBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsResponse]
  }
  
  @scala.inline
  implicit class ListBackupsResponseMutableBuilder[Self <: ListBackupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackups(value: js.Array[Backup]): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    @scala.inline
    def setBackupsVarargs(value: Backup*): Self = StObject.set(x, "backups", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
