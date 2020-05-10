package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataflowGraphResponse extends js.Object {
  /**
    * A list of the edges in the resulting DAG.
    */
  var DagEdges: js.UndefOr[typingsSlinky.awsSdk.glueMod.DagEdges] = js.native
  /**
    * A list of the nodes in the resulting DAG.
    */
  var DagNodes: js.UndefOr[typingsSlinky.awsSdk.glueMod.DagNodes] = js.native
}

object GetDataflowGraphResponse {
  @scala.inline
  def apply(): GetDataflowGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowGraphResponse]
  }
  @scala.inline
  implicit class GetDataflowGraphResponseOps[Self <: GetDataflowGraphResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDagEdges(value: DagEdges): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DagEdges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDagEdges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DagEdges")(js.undefined)
        ret
    }
    @scala.inline
    def withDagNodes(value: DagNodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DagNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDagNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DagNodes")(js.undefined)
        ret
    }
  }
  
}

