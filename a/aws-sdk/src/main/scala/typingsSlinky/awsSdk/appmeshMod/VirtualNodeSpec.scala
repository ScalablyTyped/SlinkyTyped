package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpec extends js.Object {
  /**
    * A reference to an object that represents the defaults for backends.
    */
  var backendDefaults: js.UndefOr[BackendDefaults] = js.native
  /**
    * The backends that the virtual node is expected to send outbound traffic to.
    */
  var backends: js.UndefOr[Backends] = js.native
  /**
    * The listener that the virtual node is expected to receive inbound traffic from.
    You can specify one listener.
    */
  var listeners: js.UndefOr[Listeners] = js.native
  /**
    * The inbound and outbound access logging information for the virtual node.
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    * The service discovery information for the virtual node. If your virtual node does not
    expect ingress traffic, you can omit this parameter. If you specify a listener,
    then you must specify service discovery information.
    */
  var serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.native
}

object VirtualNodeSpec {
  @scala.inline
  def apply(): VirtualNodeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpec]
  }
  @scala.inline
  implicit class VirtualNodeSpecOps[Self <: VirtualNodeSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendDefaults(value: BackendDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withBackends(value: Backends): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backends")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: Listeners): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Logging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceDiscovery(value: ServiceDiscovery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceDiscovery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceDiscovery")(js.undefined)
        ret
    }
  }
  
}

