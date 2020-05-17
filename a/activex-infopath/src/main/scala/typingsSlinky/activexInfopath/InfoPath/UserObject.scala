package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserObject extends js.Object {
  @JSName("InfoPath.UserObject_typekey")
  var InfoPathDotUserObject_typekey: UserObject = js.native
  def IsCurrentUser(bstrUsername: String): Boolean = js.native
  def IsUserMemberOf(bstrGroupname: String): Boolean = js.native
}

object UserObject {
  @scala.inline
  def apply(
    InfoPathDotUserObject_typekey: UserObject,
    IsCurrentUser: String => Boolean,
    IsUserMemberOf: String => Boolean
  ): UserObject = {
    val __obj = js.Dynamic.literal(IsCurrentUser = js.Any.fromFunction1(IsCurrentUser), IsUserMemberOf = js.Any.fromFunction1(IsUserMemberOf))
    __obj.updateDynamic("InfoPath.UserObject_typekey")(InfoPathDotUserObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObject]
  }
  @scala.inline
  implicit class UserObjectOps[Self <: UserObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotUserObject_typekey(value: UserObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.UserObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCurrentUser(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsCurrentUser")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsUserMemberOf(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUserMemberOf")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

