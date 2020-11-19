package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationTaskResponse extends js.Object {
  
  /**
    * The replication task that was created.
    */
  var ReplicationTask: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationTask] = js.native
}
object CreateReplicationTaskResponse {
  
  @scala.inline
  def apply(): CreateReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationTaskResponse]
  }
  
  @scala.inline
  implicit class CreateReplicationTaskResponseOps[Self <: CreateReplicationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReplicationTask(value: ReplicationTask): Self = this.set("ReplicationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationTask: Self = this.set("ReplicationTask", js.undefined)
  }
}
