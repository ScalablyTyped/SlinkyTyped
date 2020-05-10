package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInstancePublicPortsRequest extends js.Object {
  /**
    * The Lightsail instance name of the public port(s) you are setting.
    */
  var instanceName: ResourceName = js.native
  /**
    * Specifies information about the public port(s).
    */
  var portInfos: PortInfoList = js.native
}

object PutInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfos: PortInfoList): PutInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfos = portInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInstancePublicPortsRequest]
  }
  @scala.inline
  implicit class PutInstancePublicPortsRequestOps[Self <: PutInstancePublicPortsRequest] (val x: Self) extends AnyVal {
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
    def withPortInfos(value: PortInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portInfos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

