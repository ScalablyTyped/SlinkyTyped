package typingsSlinky.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapDiffChange extends js.Object {
  var allocated_nodes: Double = js.native
  var details: js.Array[HeapDiffDetail] = js.native
  var freed_nodes: Double = js.native
  var size: String = js.native
  var size_bytes: Double = js.native
}

object HeapDiffChange {
  @scala.inline
  def apply(
    allocated_nodes: Double,
    details: js.Array[HeapDiffDetail],
    freed_nodes: Double,
    size: String,
    size_bytes: Double
  ): HeapDiffChange = {
    val __obj = js.Dynamic.literal(allocated_nodes = allocated_nodes.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], freed_nodes = freed_nodes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffChange]
  }
  @scala.inline
  implicit class HeapDiffChangeOps[Self <: HeapDiffChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocated_nodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocated_nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: js.Array[HeapDiffDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreed_nodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freed_nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize_bytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size_bytes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

