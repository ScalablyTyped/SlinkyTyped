package typingsSlinky.googleAppsScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnownUser extends js.Object {
  var isCurrentUser: js.UndefOr[Boolean] = js.native
  var personName: js.UndefOr[String] = js.native
}

object KnownUser {
  @scala.inline
  def apply(): KnownUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownUser]
  }
  @scala.inline
  implicit class KnownUserOps[Self <: KnownUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCurrentUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCurrentUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCurrentUser")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personName")(js.undefined)
        ret
    }
  }
  
}

