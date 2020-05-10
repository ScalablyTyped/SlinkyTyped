package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServicePort contains information on service's port.
  */
@js.native
trait ServicePort extends js.Object {
  /**
    * The name of this port within the service. This must be a DNS_LABEL. All ports within a
    * ServiceSpec must have unique names. When considering the endpoints for a Service, this must
    * match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on
    * this service.
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * The port on each node on which this service is exposed when type=NodePort or LoadBalancer.
    * Usually assigned by the system. If specified, it will be allocated to the service if unused
    * or else creation of the service will fail. Default is to auto-allocate a port if the
    * ServiceType of this Service requires one. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
    */
  var nodePort: js.UndefOr[Input[Double]] = js.native
  /**
    * The port that will be exposed by this service.
    */
  var port: Input[Double] = js.native
  /**
    * The IP protocol for this port. Supports "TCP", "UDP", and "SCTP". Default is TCP.
    */
  var protocol: js.UndefOr[Input[String]] = js.native
  /**
    * Number or name of the port to access on the pods targeted by the service. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked
    * up as a named port in the target Pod's container ports. If this is not specified, the value
    * of the 'port' field is used (an identity map). This field is ignored for services with
    * clusterIP=None, and should be omitted or set equal to the 'port' field. More info:
    * https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
    */
  var targetPort: js.UndefOr[Input[Double | String]] = js.native
}

object ServicePort {
  @scala.inline
  def apply(port: Input[Double]): ServicePort = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicePort]
  }
  @scala.inline
  implicit class ServicePortOps[Self <: ServicePort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
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
    def withNodePort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodePort")(js.undefined)
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
    @scala.inline
    def withTargetPort(value: Input[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPort")(js.undefined)
        ret
    }
  }
  
}

