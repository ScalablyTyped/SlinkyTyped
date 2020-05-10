package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TCPSocketAction describes an action based on opening a socket
  */
@js.native
trait TCPSocketAction extends js.Object {
  /**
    * Optional: Host name to connect to, defaults to the pod IP.
    */
  var host: js.UndefOr[Input[String]] = js.native
  /**
    * Number or name of the port to access on the container. Number must be in the range 1 to
    * 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Input[Double | String] = js.native
}

object TCPSocketAction {
  @scala.inline
  def apply(port: Input[Double | String]): TCPSocketAction = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCPSocketAction]
  }
  @scala.inline
  implicit class TCPSocketActionOps[Self <: TCPSocketAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPort(value: Input[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
  }
  
}

