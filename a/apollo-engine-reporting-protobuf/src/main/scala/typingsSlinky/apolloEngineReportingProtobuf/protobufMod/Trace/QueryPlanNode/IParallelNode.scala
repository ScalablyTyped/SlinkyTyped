package typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ParallelNode. */
@js.native
trait IParallelNode extends js.Object {
  /** ParallelNode nodes */
  var nodes: js.UndefOr[js.Array[IQueryPlanNode] | Null] = js.native
}

object IParallelNode {
  @scala.inline
  def apply(): IParallelNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParallelNode]
  }
  @scala.inline
  implicit class IParallelNodeOps[Self <: IParallelNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: js.Array[IQueryPlanNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(js.undefined)
        ret
    }
    @scala.inline
    def withNodesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(null)
        ret
    }
  }
  
}

