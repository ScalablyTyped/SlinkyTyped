package typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typingsSlinky.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FlattenNode. */
@js.native
trait IFlattenNode extends js.Object {
  /** FlattenNode node */
  var node: js.UndefOr[IQueryPlanNode | Null] = js.native
  /** FlattenNode responsePath */
  var responsePath: js.UndefOr[js.Array[IResponsePathElement] | Null] = js.native
}

object IFlattenNode {
  @scala.inline
  def apply(): IFlattenNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFlattenNode]
  }
  @scala.inline
  implicit class IFlattenNodeOps[Self <: IFlattenNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: IQueryPlanNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(null)
        ret
    }
    @scala.inline
    def withResponsePath(value: js.Array[IResponsePathElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsePath")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsePathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsePath")(null)
        ret
    }
  }
  
}

