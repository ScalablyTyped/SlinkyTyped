package typingsSlinky.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorReason extends js.Object {
  /**
    * Service Quotas returns the following error values.   DEPENDENCY_ACCESS_DENIED_ERROR is returned when the caller does not have permission to call the service or service quota. To resolve the error, you need permission to access the service or service quota.  DEPENDENCY_THROTTLING_ERROR is returned when the service being called is throttling Service Quotas.  DEPENDENCY_SERVICE_ERROR is returned when the service being called has availability issues.  SERVICE_QUOTA_NOT_AVAILABLE_ERROR is returned when there was an error in Service Quotas.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ErrorCode] = js.native
  /**
    * The error message that provides more detail.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.servicequotasMod.ErrorMessage] = js.native
}

object ErrorReason {
  @scala.inline
  def apply(): ErrorReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorReason]
  }
  @scala.inline
  implicit class ErrorReasonOps[Self <: ErrorReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
  }
  
}

