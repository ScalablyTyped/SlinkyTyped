package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
  
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
  implicit class DeleteRelationalDatabaseSnapshotRequestOps[Self <: DeleteRelationalDatabaseSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = this.set("relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
  }
}
