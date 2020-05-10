package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignInStatus extends js.Object {
  // Provides additional details on the sign-in activity
  var additionalDetails: js.UndefOr[String] = js.native
  /**
    * Provides the 5-6digit error code that's generated during a sign-in failure. Check out the list of error codes and
    * messages.
    */
  var errorCode: js.UndefOr[Double] = js.native
  /**
    * Provides the error message or the reason for failure for the corresponding sign-in activity. Check out the list of
    * error codes and messages.
    */
  var failureReason: js.UndefOr[String] = js.native
}

object SignInStatus {
  @scala.inline
  def apply(): SignInStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInStatus]
  }
  @scala.inline
  implicit class SignInStatusOps[Self <: SignInStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
  }
  
}

