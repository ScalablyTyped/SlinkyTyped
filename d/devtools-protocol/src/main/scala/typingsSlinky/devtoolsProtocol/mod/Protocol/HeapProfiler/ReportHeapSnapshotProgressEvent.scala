package typingsSlinky.devtoolsProtocol.mod.Protocol.HeapProfiler

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportHeapSnapshotProgressEvent extends StObject {
  
  var done: integer = js.native
  
  var finished: js.UndefOr[Boolean] = js.native
  
  var total: integer = js.native
}
object ReportHeapSnapshotProgressEvent {
  
  @scala.inline
  def apply(done: integer, total: integer): ReportHeapSnapshotProgressEvent = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportHeapSnapshotProgressEvent]
  }
  
  @scala.inline
  implicit class ReportHeapSnapshotProgressEventMutableBuilder[Self <: ReportHeapSnapshotProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: integer): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    @scala.inline
    def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
