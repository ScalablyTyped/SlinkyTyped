package typingsSlinky.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkErrorInfo extends ErrorInfo {
  var networkErrorCode: Double = js.native
}

object NetworkErrorInfo {
  @scala.inline
  def apply(message: String, networkErrorCode: Double, stack: String): NetworkErrorInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], networkErrorCode = networkErrorCode.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkErrorInfo]
  }
  @scala.inline
  implicit class NetworkErrorInfoOps[Self <: NetworkErrorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

