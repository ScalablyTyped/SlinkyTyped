package typingsSlinky.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingOptionsRequest extends js.Object {
  /**
    * The new values of the AWS IoT Events logging options.
    */
  var loggingOptions: LoggingOptions = js.native
}

object PutLoggingOptionsRequest {
  @scala.inline
  def apply(loggingOptions: LoggingOptions): PutLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingOptionsRequest]
  }
  @scala.inline
  implicit class PutLoggingOptionsRequestOps[Self <: PutLoggingOptionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoggingOptions(value: LoggingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggingOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

