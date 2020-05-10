package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsAddNodesRequest extends js.Object {
  /**
    * Count of additional nodes to be added to the node group.
    */
  var additionalNodeCount: js.UndefOr[Double] = js.native
}

object SchemaNodeGroupsAddNodesRequest {
  @scala.inline
  def apply(): SchemaNodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsAddNodesRequest]
  }
  @scala.inline
  implicit class SchemaNodeGroupsAddNodesRequestOps[Self <: SchemaNodeGroupsAddNodesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalNodeCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalNodeCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalNodeCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalNodeCount")(js.undefined)
        ret
    }
  }
  
}

