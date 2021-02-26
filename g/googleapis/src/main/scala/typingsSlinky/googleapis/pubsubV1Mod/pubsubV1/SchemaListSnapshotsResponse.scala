package typingsSlinky.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListSnapshots` method.
  */
@js.native
trait SchemaListSnapshotsResponse extends StObject {
  
  /**
    * If not empty, indicates that there may be more snapshot that match the
    * request; this value should be passed in a new `ListSnapshotsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The resulting snapshots.
    */
  var snapshots: js.UndefOr[js.Array[SchemaSnapshot]] = js.native
}
object SchemaListSnapshotsResponse {
  
  @scala.inline
  def apply(): SchemaListSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSnapshotsResponse]
  }
  
  @scala.inline
  implicit class SchemaListSnapshotsResponseMutableBuilder[Self <: SchemaListSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSnapshots(value: js.Array[SchemaSnapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsUndefined: Self = StObject.set(x, "snapshots", js.undefined)
    
    @scala.inline
    def setSnapshotsVarargs(value: SchemaSnapshot*): Self = StObject.set(x, "snapshots", js.Array(value :_*))
  }
}
