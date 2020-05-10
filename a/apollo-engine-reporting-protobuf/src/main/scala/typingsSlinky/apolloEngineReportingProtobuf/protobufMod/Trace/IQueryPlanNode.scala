package typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace

import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFetchNode
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFlattenNode
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.IParallelNode
import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode.ISequenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QueryPlanNode. */
@js.native
trait IQueryPlanNode extends js.Object {
  /** QueryPlanNode fetch */
  var fetch: js.UndefOr[IFetchNode | Null] = js.native
  /** QueryPlanNode flatten */
  var flatten: js.UndefOr[IFlattenNode | Null] = js.native
  /** QueryPlanNode parallel */
  var parallel: js.UndefOr[IParallelNode | Null] = js.native
  /** QueryPlanNode sequence */
  var sequence: js.UndefOr[ISequenceNode | Null] = js.native
}

object IQueryPlanNode {
  @scala.inline
  def apply(): IQueryPlanNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueryPlanNode]
  }
  @scala.inline
  implicit class IQueryPlanNodeOps[Self <: IQueryPlanNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFetch(value: IFetchNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(null)
        ret
    }
    @scala.inline
    def withFlatten(value: IFlattenNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
    @scala.inline
    def withFlattenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(null)
        ret
    }
    @scala.inline
    def withParallel(value: IParallelNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(js.undefined)
        ret
    }
    @scala.inline
    def withParallelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallel")(null)
        ret
    }
    @scala.inline
    def withSequence(value: ISequenceNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(null)
        ret
    }
  }
  
}

