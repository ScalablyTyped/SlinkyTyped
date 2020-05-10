package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSummary extends js.Object {
  /**
    * The type of change pending for the ActiveMQ user.
    */
  var PendingChange: js.UndefOr[ChangeType] = js.native
  /**
    * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: js.UndefOr[string] = js.native
}

object UserSummary {
  @scala.inline
  def apply(): UserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSummary]
  }
  @scala.inline
  implicit class UserSummaryOps[Self <: UserSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPendingChange(value: ChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingChange")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(js.undefined)
        ret
    }
  }
  
}

