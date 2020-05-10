package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterSpecListenerPortMapping extends js.Object {
  /**
    * The port used for the port mapping.
    */
  var port: Double = js.native
  /**
    * The protocol used for the port mapping. Valid values are `http` and `tcp`.
    */
  var protocol: String = js.native
}

object VirtualRouterSpecListenerPortMapping {
  @scala.inline
  def apply(port: Double, protocol: String): VirtualRouterSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterSpecListenerPortMapping]
  }
  @scala.inline
  implicit class VirtualRouterSpecListenerPortMappingOps[Self <: VirtualRouterSpecListenerPortMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

