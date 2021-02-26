package typingsSlinky.node.inspectorMod.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddHeapSnapshotChunkEventDataType extends StObject {
  
  var chunk: String = js.native
}
object AddHeapSnapshotChunkEventDataType {
  
  @scala.inline
  def apply(chunk: String): AddHeapSnapshotChunkEventDataType = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddHeapSnapshotChunkEventDataType]
  }
  
  @scala.inline
  implicit class AddHeapSnapshotChunkEventDataTypeMutableBuilder[Self <: AddHeapSnapshotChunkEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
  }
}
