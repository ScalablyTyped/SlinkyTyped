package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListNodePoolsResponse is the result of ListNodePoolsRequest.
  */
@js.native
trait SchemaListNodePoolsResponse extends js.Object {
  /**
    * A list of node pools for a cluster.
    */
  var nodePools: js.UndefOr[js.Array[SchemaNodePool]] = js.native
}

object SchemaListNodePoolsResponse {
  @scala.inline
  def apply(): SchemaListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNodePoolsResponse]
  }
  @scala.inline
  implicit class SchemaListNodePoolsResponseOps[Self <: SchemaListNodePoolsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodePools(value: js.Array[SchemaNodePool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePools")(js.undefined)
        ret
    }
  }
  
}

