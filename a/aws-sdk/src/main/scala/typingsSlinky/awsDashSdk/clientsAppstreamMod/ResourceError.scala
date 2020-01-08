package typingsSlinky.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[FleetErrorCode] = js.native
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The time the error occurred.
    */
  var ErrorTimestamp: js.UndefOr[js.Date] = js.native
}

object ResourceError {
  @scala.inline
  def apply(ErrorCode: FleetErrorCode = null, ErrorMessage: String = null, ErrorTimestamp: js.Date = null): ResourceError = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (ErrorTimestamp != null) __obj.updateDynamic("ErrorTimestamp")(ErrorTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceError]
  }
}

