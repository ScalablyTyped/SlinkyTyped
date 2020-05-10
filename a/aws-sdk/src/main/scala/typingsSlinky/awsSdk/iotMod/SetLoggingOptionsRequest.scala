package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoggingOptionsRequest extends js.Object {
  /**
    * The logging options payload.
    */
  var loggingOptionsPayload: LoggingOptionsPayload = js.native
}

object SetLoggingOptionsRequest {
  @scala.inline
  def apply(loggingOptionsPayload: LoggingOptionsPayload): SetLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptionsPayload = loggingOptionsPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoggingOptionsRequest]
  }
  @scala.inline
  implicit class SetLoggingOptionsRequestOps[Self <: SetLoggingOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingOptionsPayload(value: LoggingOptionsPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingOptionsPayload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

