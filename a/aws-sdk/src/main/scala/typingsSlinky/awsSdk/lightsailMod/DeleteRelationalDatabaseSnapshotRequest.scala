package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRelationalDatabaseSnapshotRequest extends StObject {
  
  /**
    * The name of the database snapshot that you are deleting.
    */
  var relationalDatabaseSnapshotName: ResourceName = js.native
}
object DeleteRelationalDatabaseSnapshotRequest {
  
  @scala.inline
  def apply(relationalDatabaseSnapshotName: ResourceName): DeleteRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRelationalDatabaseSnapshotRequest]
  }
  
  @scala.inline
  implicit class DeleteRelationalDatabaseSnapshotRequestMutableBuilder[Self <: DeleteRelationalDatabaseSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
  }
}
