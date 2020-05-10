package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodePoolRequest extends js.Object {
  /** The node pool to create. */
  var nodePool: js.UndefOr[NodePool] = js.native
}

object CreateNodePoolRequest {
  @scala.inline
  def apply(): CreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodePoolRequest]
  }
  @scala.inline
  implicit class CreateNodePoolRequestOps[Self <: CreateNodePoolRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodePool(value: NodePool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePool")(js.undefined)
        ret
    }
  }
  
}

