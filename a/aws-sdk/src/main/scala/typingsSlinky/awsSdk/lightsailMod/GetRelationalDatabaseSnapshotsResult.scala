package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseSnapshotsResult extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseSnapshots request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * An object describing the result of your get relational database snapshots request.
    */
  var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.native
}
object GetRelationalDatabaseSnapshotsResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotsResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseSnapshotsResultMutableBuilder[Self <: GetRelationalDatabaseSnapshotsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseSnapshots(value: RelationalDatabaseSnapshotList): Self = StObject.set(x, "relationalDatabaseSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSnapshotsUndefined: Self = StObject.set(x, "relationalDatabaseSnapshots", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseSnapshotsVarargs(value: RelationalDatabaseSnapshot*): Self = StObject.set(x, "relationalDatabaseSnapshots", js.Array(value :_*))
  }
}
