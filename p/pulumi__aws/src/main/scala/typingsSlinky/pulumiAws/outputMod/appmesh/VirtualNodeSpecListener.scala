package typingsSlinky.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecListener extends js.Object {
  /**
    * The health check information for the listener.
    */
  var healthCheck: js.UndefOr[VirtualNodeSpecListenerHealthCheck] = js.native
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualNodeSpecListenerPortMapping = js.native
}

object VirtualNodeSpecListener {
  @scala.inline
  def apply(portMapping: VirtualNodeSpecListenerPortMapping): VirtualNodeSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListener]
  }
  @scala.inline
  implicit class VirtualNodeSpecListenerOps[Self <: VirtualNodeSpecListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPortMapping(value: VirtualNodeSpecListenerPortMapping): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthCheck(value: VirtualNodeSpecListenerHealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(js.undefined)
        ret
    }
  }
  
}

