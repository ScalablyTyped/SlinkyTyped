package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.native
  /**
    * The ID of the virtual private interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object UpdateVirtualInterfaceAttributesRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId): UpdateVirtualInterfaceAttributesRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
  }
  @scala.inline
  implicit class UpdateVirtualInterfaceAttributesRequestOps[Self <: UpdateVirtualInterfaceAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualInterfaceId(value: VirtualInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtu(value: MTU): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMtu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtu")(js.undefined)
        ret
    }
  }
  
}

