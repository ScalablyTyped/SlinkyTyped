package typingsSlinky.firebaseRemoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHttpStatus extends js.Object {
  var httpStatus: Double = js.native
}

object AnonHttpStatus {
  @scala.inline
  def apply(httpStatus: Double): AnonHttpStatus = {
    val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHttpStatus]
  }
  @scala.inline
  implicit class AnonHttpStatusOps[Self <: AnonHttpStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

