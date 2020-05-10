package typingsSlinky.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInspectedHeapObjectParameterType extends js.Object {
  /**
    * Heap snapshot object id to be accessible by means of $x command line API.
    */
  var heapObjectId: HeapSnapshotObjectId = js.native
}

object AddInspectedHeapObjectParameterType {
  @scala.inline
  def apply(heapObjectId: HeapSnapshotObjectId): AddInspectedHeapObjectParameterType = {
    val __obj = js.Dynamic.literal(heapObjectId = heapObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInspectedHeapObjectParameterType]
  }
  @scala.inline
  implicit class AddInspectedHeapObjectParameterTypeOps[Self <: AddInspectedHeapObjectParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeapObjectId(value: HeapSnapshotObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heapObjectId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

