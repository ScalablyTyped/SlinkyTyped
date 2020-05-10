package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachStaticIpRequest extends js.Object {
  /**
    * The name of the static IP to detach from the instance.
    */
  var staticIpName: ResourceName = js.native
}

object DetachStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): DetachStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachStaticIpRequest]
  }
  @scala.inline
  implicit class DetachStaticIpRequestOps[Self <: DetachStaticIpRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStaticIpName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticIpName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

