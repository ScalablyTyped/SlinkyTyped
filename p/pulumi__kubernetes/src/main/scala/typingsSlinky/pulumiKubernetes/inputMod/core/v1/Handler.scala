package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handler defines a specific action that should be taken
  */
@js.native
trait Handler extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  var exec: js.UndefOr[Input[ExecAction]] = js.native
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: js.UndefOr[Input[HTTPGetAction]] = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: js.UndefOr[Input[TCPSocketAction]] = js.native
}

object Handler {
  @scala.inline
  def apply(): Handler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handler]
  }
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExec(value: Input[ExecAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpGet(value: Input[HTTPGetAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpGet")(js.undefined)
        ret
    }
    @scala.inline
    def withTcpSocket(value: Input[TCPSocketAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpSocket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcpSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpSocket")(js.undefined)
        ret
    }
  }
  
}

