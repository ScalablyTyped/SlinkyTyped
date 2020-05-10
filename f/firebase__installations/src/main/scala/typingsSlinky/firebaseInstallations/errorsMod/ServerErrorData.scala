package typingsSlinky.firebaseInstallations.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerErrorData extends js.Object {
  var serverCode: Double = js.native
  var serverMessage: String = js.native
  var serverStatus: String = js.native
}

object ServerErrorData {
  @scala.inline
  def apply(serverCode: Double, serverMessage: String, serverStatus: String): ServerErrorData = {
    val __obj = js.Dynamic.literal(serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerErrorData]
  }
  @scala.inline
  implicit class ServerErrorDataOps[Self <: ServerErrorData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

