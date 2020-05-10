package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handler defines a specific action that should be taken
  */
@js.native
trait SchemaHandler extends js.Object {
  /**
    * One and only one of the following should be specified. Exec specifies the
    * action to take. +optional
    */
  var exec: js.UndefOr[SchemaExecAction] = js.native
  /**
    * HTTPGet specifies the http request to perform. +optional
    */
  var httpGet: js.UndefOr[SchemaHTTPGetAction] = js.native
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet
    * supported
    */
  var tcpSocket: js.UndefOr[SchemaTCPSocketAction] = js.native
}

object SchemaHandler {
  @scala.inline
  def apply(): SchemaHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHandler]
  }
  @scala.inline
  implicit class SchemaHandlerOps[Self <: SchemaHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExec(value: SchemaExecAction): Self = {
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
    def withHttpGet(value: SchemaHTTPGetAction): Self = {
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
    def withTcpSocket(value: SchemaTCPSocketAction): Self = {
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

