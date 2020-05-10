package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualRouterOutput extends js.Object {
  /**
    * The virtual router that was deleted.
    */
  var virtualRouter: VirtualRouterData = js.native
}

object DeleteVirtualRouterOutput {
  @scala.inline
  def apply(virtualRouter: VirtualRouterData): DeleteVirtualRouterOutput = {
    val __obj = js.Dynamic.literal(virtualRouter = virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualRouterOutput]
  }
  @scala.inline
  implicit class DeleteVirtualRouterOutputOps[Self <: DeleteVirtualRouterOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualRouter(value: VirtualRouterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualRouter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

