package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceBackend extends js.Object {
  /**
    * A reference to an object that represents the client policy for a backend.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.native
  /**
    * The name of the virtual service that is acting as a virtual node backend.
    */
  var virtualServiceName: ServiceName = js.native
}

object VirtualServiceBackend {
  @scala.inline
  def apply(virtualServiceName: ServiceName): VirtualServiceBackend = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceBackend]
  }
  @scala.inline
  implicit class VirtualServiceBackendOps[Self <: VirtualServiceBackend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualServiceName(value: ServiceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientPolicy(value: ClientPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPolicy")(js.undefined)
        ret
    }
  }
  
}

