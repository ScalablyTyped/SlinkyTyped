package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationTaskResponse extends StObject {
  
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
  implicit class CreateReplicationTaskResponseMutableBuilder[Self <: CreateReplicationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTask(value: ReplicationTask): Self = StObject.set(x, "ReplicationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskUndefined: Self = StObject.set(x, "ReplicationTask", js.undefined)
  }
}
