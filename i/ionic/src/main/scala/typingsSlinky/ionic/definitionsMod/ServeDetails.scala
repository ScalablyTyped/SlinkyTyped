package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionicUtilsNetwork.mod.NetworkInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeDetails extends js.Object {
  var custom: Boolean = js.native
  var externalAddress: String = js.native
  var externalNetworkInterfaces: js.Array[NetworkInterface] = js.native
  var externallyAccessible: Boolean = js.native
  var localAddress: String = js.native
  var port: Double = js.native
  var protocol: String = js.native
}

object ServeDetails {
  @scala.inline
  def apply(
    custom: Boolean,
    externalAddress: String,
    externalNetworkInterfaces: js.Array[NetworkInterface],
    externallyAccessible: Boolean,
    localAddress: String,
    port: Double,
    protocol: String
  ): ServeDetails = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], externalAddress = externalAddress.asInstanceOf[js.Any], externalNetworkInterfaces = externalNetworkInterfaces.asInstanceOf[js.Any], externallyAccessible = externallyAccessible.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeDetails]
  }
  @scala.inline
  implicit class ServeDetailsOps[Self <: ServeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalNetworkInterfaces(value: js.Array[NetworkInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalNetworkInterfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternallyAccessible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externallyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

