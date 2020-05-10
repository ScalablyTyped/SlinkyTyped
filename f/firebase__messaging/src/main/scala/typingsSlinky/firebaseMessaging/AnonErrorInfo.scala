package typingsSlinky.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrorInfo extends js.Object {
  var errorInfo: String = js.native
}

object AnonErrorInfo {
  @scala.inline
  def apply(errorInfo: String): AnonErrorInfo = {
    val __obj = js.Dynamic.literal(errorInfo = errorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorInfo]
  }
  @scala.inline
  implicit class AnonErrorInfoOps[Self <: AnonErrorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorInfo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

