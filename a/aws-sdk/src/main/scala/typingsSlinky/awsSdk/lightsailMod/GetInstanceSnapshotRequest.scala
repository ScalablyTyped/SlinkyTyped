package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceSnapshotRequest extends js.Object {
  
  /**
    * The name of the snapshot for which you are requesting information.
    */
  var instanceSnapshotName: ResourceName = js.native
}
object GetInstanceSnapshotRequest {
  
  @scala.inline
  def apply(instanceSnapshotName: ResourceName): GetInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceSnapshotRequest]
  }
  
  @scala.inline
  implicit class GetInstanceSnapshotRequestOps[Self <: GetInstanceSnapshotRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceSnapshotName(value: ResourceName): Self = this.set("instanceSnapshotName", value.asInstanceOf[js.Any])
  }
}
