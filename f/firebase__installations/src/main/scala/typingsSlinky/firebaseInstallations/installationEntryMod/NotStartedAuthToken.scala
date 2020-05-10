package typingsSlinky.firebaseInstallations.installationEntryMod

import typingsSlinky.firebaseInstallations.firebaseInstallationsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotStartedAuthToken extends AuthToken {
  val requestStatus: `0` = js.native
}

object NotStartedAuthToken {
  @scala.inline
  def apply(requestStatus: `0`): NotStartedAuthToken = {
    val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotStartedAuthToken]
  }
  @scala.inline
  implicit class NotStartedAuthTokenOps[Self <: NotStartedAuthToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestStatus(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStatus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

