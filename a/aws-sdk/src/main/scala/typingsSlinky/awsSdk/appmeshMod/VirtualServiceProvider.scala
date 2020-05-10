package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceProvider extends js.Object {
  /**
    * The virtual node associated with a virtual service.
    */
  var virtualNode: js.UndefOr[VirtualNodeServiceProvider] = js.native
  /**
    * The virtual router associated with a virtual service.
    */
  var virtualRouter: js.UndefOr[VirtualRouterServiceProvider] = js.native
}

object VirtualServiceProvider {
  @scala.inline
  def apply(): VirtualServiceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceProvider]
  }
  @scala.inline
  implicit class VirtualServiceProviderOps[Self <: VirtualServiceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualNode(value: VirtualNodeServiceProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualNode")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualRouter(value: VirtualRouterServiceProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualRouter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualRouter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualRouter")(js.undefined)
        ret
    }
  }
  
}

