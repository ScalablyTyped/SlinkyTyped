package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var deletedUser: js.UndefOr[js.Any] = js.native
  var knownUser: js.UndefOr[KnownUser] = js.native
  var unknownUser: js.UndefOr[js.Any] = js.native
}

object User {
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedUser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedUser")(js.undefined)
        ret
    }
    @scala.inline
    def withKnownUser(value: KnownUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKnownUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("knownUser")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownUser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownUser")(js.undefined)
        ret
    }
  }
  
}

