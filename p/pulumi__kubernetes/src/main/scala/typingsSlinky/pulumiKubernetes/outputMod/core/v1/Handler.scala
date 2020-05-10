package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val exec: ExecAction = js.native
  /**
    * HTTPGet specifies the http request to perform.
    */
  val httpGet: HTTPGetAction = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  val tcpSocket: TCPSocketAction = js.native
}

object Handler {
  @scala.inline
  def apply(exec: ExecAction, httpGet: HTTPGetAction, tcpSocket: TCPSocketAction): Handler = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExec(value: ExecAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpGet(value: HTTPGetAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpGet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcpSocket(value: TCPSocketAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcpSocket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

