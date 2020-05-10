package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualInterfaces extends js.Object {
  /**
    * The virtual interfaces
    */
  var virtualInterfaces: js.UndefOr[VirtualInterfaceList] = js.native
}

object VirtualInterfaces {
  @scala.inline
  def apply(): VirtualInterfaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualInterfaces]
  }
  @scala.inline
  implicit class VirtualInterfacesOps[Self <: VirtualInterfaces] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualInterfaces(value: VirtualInterfaceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterfaces")(js.undefined)
        ret
    }
  }
  
}

