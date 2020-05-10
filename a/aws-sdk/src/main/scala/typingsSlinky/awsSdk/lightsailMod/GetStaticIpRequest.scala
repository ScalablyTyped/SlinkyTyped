package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStaticIpRequest extends js.Object {
  /**
    * The name of the static IP in Lightsail.
    */
  var staticIpName: ResourceName = js.native
}

object GetStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): GetStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticIpRequest]
  }
  @scala.inline
  implicit class GetStaticIpRequestOps[Self <: GetStaticIpRequest] (val x: Self) extends AnyVal {
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

