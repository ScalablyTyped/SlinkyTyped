package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopReplicationTaskResponse extends StObject {
  
  /**
    * The replication task stopped.
    */
  var ReplicationTask: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationTask] = js.native
}
object StopReplicationTaskResponse {
  
  @scala.inline
  def apply(): StopReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopReplicationTaskResponse]
  }
  
  @scala.inline
  implicit class StopReplicationTaskResponseMutableBuilder[Self <: StopReplicationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
