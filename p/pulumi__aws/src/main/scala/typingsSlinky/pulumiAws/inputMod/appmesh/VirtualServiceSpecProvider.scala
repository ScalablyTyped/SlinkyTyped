package typingsSlinky.pulumiAws.inputMod.appmesh

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpecProvider extends js.Object {
  /**
    * The virtual node associated with a virtual service.
    */
  var virtualNode: js.UndefOr[Input[VirtualServiceSpecProviderVirtualNode]] = js.native
  /**
    * The virtual router associated with a virtual service.
    */
  var virtualRouter: js.UndefOr[Input[VirtualServiceSpecProviderVirtualRouter]] = js.native
}

object VirtualServiceSpecProvider {
  @scala.inline
  def apply(): VirtualServiceSpecProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceSpecProvider]
  }
  @scala.inline
  implicit class VirtualServiceSpecProviderOps[Self <: VirtualServiceSpecProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualNode(value: Input[VirtualServiceSpecProviderVirtualNode]): Self = {
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
    def withVirtualRouter(value: Input[VirtualServiceSpecProviderVirtualRouter]): Self = {
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

