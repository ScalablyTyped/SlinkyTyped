package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpecProviderVirtualRouter extends js.Object {
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: String = js.native
}

object VirtualServiceSpecProviderVirtualRouter {
  @scala.inline
  def apply(virtualRouterName: String): VirtualServiceSpecProviderVirtualRouter = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualRouter]
  }
  @scala.inline
  implicit class VirtualServiceSpecProviderVirtualRouterOps[Self <: VirtualServiceSpecProviderVirtualRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualRouterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualRouterName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

