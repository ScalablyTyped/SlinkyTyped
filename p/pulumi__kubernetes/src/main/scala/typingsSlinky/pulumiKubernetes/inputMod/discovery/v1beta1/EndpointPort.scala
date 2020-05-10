package typingsSlinky.pulumiKubernetes.inputMod.discovery.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointPort represents a Port used by an EndpointSlice
  */
@js.native
trait EndpointPort extends js.Object {
  /**
    * The application protocol for this port. This field follows standard Kubernetes label
    * syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and
    * http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed
    * names. Default is empty string.
    */
  var appProtocol: js.UndefOr[Input[String]] = js.native
  /**
    * The name of this port. All ports in an EndpointSlice must have a unique name. If the
    * EndpointSlice is dervied from a Kubernetes service, this corresponds to the
    * Service.ports[].name. Name must either be an empty string or pass DNS_LABEL validation: *
    * must be no more than 63 characters long. * must consist of lower case alphanumeric
    * characters or '-'. * must start and end with an alphanumeric character. Default is empty
    * string.
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * The port number of the endpoint. If this is not specified, ports are not restricted and
    * must be interpreted in the context of the specific consumer.
    */
  var port: js.UndefOr[Input[Double]] = js.native
  /**
    * The IP protocol for this port. Must be UDP, TCP, or SCTP. Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.native
}

object EndpointPort {
  @scala.inline
  def apply(): EndpointPort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointPort]
  }
  @scala.inline
  implicit class EndpointPortOps[Self <: EndpointPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
  }
  
}

