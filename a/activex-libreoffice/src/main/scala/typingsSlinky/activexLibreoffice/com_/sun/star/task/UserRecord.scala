package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRecord extends js.Object {
  var Passwords: SafeArray[String] = js.native
  var UserName: String = js.native
}

object UserRecord {
  @scala.inline
  def apply(Passwords: SafeArray[String], UserName: String): UserRecord = {
    val __obj = js.Dynamic.literal(Passwords = Passwords.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRecord]
  }
  @scala.inline
  implicit class UserRecordOps[Self <: UserRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPasswords(value: SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Passwords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

