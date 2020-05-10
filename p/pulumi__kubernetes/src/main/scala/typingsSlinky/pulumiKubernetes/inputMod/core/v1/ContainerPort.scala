package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerPort represents a network port in a single container.
  */
@js.native
trait ContainerPort extends js.Object {
  /**
    * Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x <
    * 65536.
    */
  var containerPort: Input[Double] = js.native
  /**
    * What host IP to bind the external port to.
    */
  var hostIP: js.UndefOr[Input[String]] = js.native
  /**
    * Number of port to expose on the host. If specified, this must be a valid port number, 0 < x
    * < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not
    * need this.
    */
  var hostPort: js.UndefOr[Input[Double]] = js.native
  /**
    * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a
    * pod must have a unique name. Name for the port that can be referred to by services.
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * Protocol for port. Must be UDP, TCP, or SCTP. Defaults to "TCP".
    */
  var protocol: js.UndefOr[Input[String]] = js.native
}

object ContainerPort {
  @scala.inline
  def apply(containerPort: Input[Double]): ContainerPort = {
    val __obj = js.Dynamic.literal(containerPort = containerPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPort]
  }
  @scala.inline
  implicit class ContainerPortOps[Self <: ContainerPort] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostIP(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostIP")(js.undefined)
        ret
    }
    @scala.inline
    def withHostPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostPort")(js.undefined)
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

