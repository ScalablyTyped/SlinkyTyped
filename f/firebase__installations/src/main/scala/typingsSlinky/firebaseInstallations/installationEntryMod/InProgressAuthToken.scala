package typingsSlinky.firebaseInstallations.installationEntryMod

import typingsSlinky.firebaseInstallations.firebaseInstallationsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InProgressAuthToken extends AuthToken {
  val requestStatus: `1` = js.native
  /**
    * Unix timestamp when the current generateAuthRequest was initiated.
    * Used for figuring out how long the request status has been IN_PROGRESS.
    */
  val requestTime: Double = js.native
}

object InProgressAuthToken {
  @scala.inline
  def apply(requestStatus: `1`, requestTime: Double): InProgressAuthToken = {
    val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[InProgressAuthToken]
  }
  @scala.inline
  implicit class InProgressAuthTokenOps[Self <: InProgressAuthToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestStatus(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

