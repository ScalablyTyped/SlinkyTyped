package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkContainer extends js.Object {
  var EndpointID: String = js.native
  var IPv4Address: String = js.native
  var IPv6Address: String = js.native
  var MacAddress: String = js.native
  var Name: String = js.native
}

object NetworkContainer {
  @scala.inline
  def apply(EndpointID: String, IPv4Address: String, IPv6Address: String, MacAddress: String, Name: String): NetworkContainer = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID.asInstanceOf[js.Any], IPv4Address = IPv4Address.asInstanceOf[js.Any], IPv6Address = IPv6Address.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkContainer]
  }
  @scala.inline
  implicit class NetworkContainerOps[Self <: NetworkContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPv4Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv4Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIPv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMacAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MacAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

