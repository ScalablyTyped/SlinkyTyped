package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServerAddressByClientCIDR helps the client to determine the server address that they should
  * use, depending on the clientCIDR that they match.
  */
@js.native
trait ServerAddressByClientCIDR extends js.Object {
  /**
    * The CIDR with which clients can match their IP to figure out the server address that they
    * should use.
    */
  var clientCIDR: Input[String] = js.native
  /**
    * Address of this server, suitable for a client that matches the above CIDR. This can be a
    * hostname, hostname:port, IP or IP:port.
    */
  var serverAddress: Input[String] = js.native
}

object ServerAddressByClientCIDR {
  @scala.inline
  def apply(clientCIDR: Input[String], serverAddress: Input[String]): ServerAddressByClientCIDR = {
    val __obj = js.Dynamic.literal(clientCIDR = clientCIDR.asInstanceOf[js.Any], serverAddress = serverAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerAddressByClientCIDR]
  }
  @scala.inline
  implicit class ServerAddressByClientCIDROps[Self <: ServerAddressByClientCIDR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientCIDR(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCIDR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAddress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

