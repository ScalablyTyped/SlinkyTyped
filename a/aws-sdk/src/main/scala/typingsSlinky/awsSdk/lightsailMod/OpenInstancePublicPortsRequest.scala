package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenInstancePublicPortsRequest extends js.Object {
  /**
    * The name of the instance for which you want to open the public ports.
    */
  var instanceName: ResourceName = js.native
  /**
    * An array of key-value pairs containing information about the port mappings.
    */
  var portInfo: PortInfo = js.native
}

object OpenInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfo: PortInfo): OpenInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfo = portInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenInstancePublicPortsRequest]
  }
  @scala.inline
  implicit class OpenInstancePublicPortsRequestOps[Self <: OpenInstancePublicPortsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortInfo(value: PortInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

