package typingsSlinky.node.inspectorMod.HeapProfiler

import typingsSlinky.node.inspectorMod.Runtime.CallFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sampling Heap Profile node. Holds callsite information, allocation statistics and child nodes.
  */
@js.native
trait SamplingHeapProfileNode extends js.Object {
  /**
    * Function location.
    */
  var callFrame: CallFrame = js.native
  /**
    * Child nodes.
    */
  var children: js.Array[SamplingHeapProfileNode] = js.native
  /**
    * Allocations size in bytes for the node excluding children.
    */
  var selfSize: Double = js.native
}

object SamplingHeapProfileNode {
  @scala.inline
  def apply(callFrame: CallFrame, children: js.Array[SamplingHeapProfileNode], selfSize: Double): SamplingHeapProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], selfSize = selfSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingHeapProfileNode]
  }
  @scala.inline
  implicit class SamplingHeapProfileNodeOps[Self <: SamplingHeapProfileNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallFrame(value: CallFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[SamplingHeapProfileNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelfSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

