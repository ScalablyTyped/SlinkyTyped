package typingsSlinky.pulumiKubernetes.outputMod.extensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressBackend describes all endpoints for a given service and port.
  */
@js.native
trait IngressBackend extends js.Object {
  /**
    * Specifies the name of the referenced service.
    */
  val serviceName: String = js.native
  /**
    * Specifies the port of the referenced service.
    */
  val servicePort: Double | String = js.native
}

object IngressBackend {
  @scala.inline
  def apply(serviceName: String, servicePort: Double | String): IngressBackend = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], servicePort = servicePort.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressBackend]
  }
  @scala.inline
  implicit class IngressBackendOps[Self <: IngressBackend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServicePort(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servicePort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

