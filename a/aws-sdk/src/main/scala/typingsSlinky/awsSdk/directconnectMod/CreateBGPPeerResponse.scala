package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBGPPeerResponse extends js.Object {
  /**
    * The virtual interface.
    */
  var virtualInterface: js.UndefOr[VirtualInterface] = js.native
}

object CreateBGPPeerResponse {
  @scala.inline
  def apply(): CreateBGPPeerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBGPPeerResponse]
  }
  @scala.inline
  implicit class CreateBGPPeerResponseOps[Self <: CreateBGPPeerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualInterface(value: VirtualInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualInterface")(js.undefined)
        ret
    }
  }
  
}

