package typingsSlinky.activexOffice.Office

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPermission extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var ExpirationDate: VarDate = js.native
  @JSName("Office.UserPermission_typekey")
  var OfficeDotUserPermission_typekey: UserPermission = js.native
  val Parent: js.Any = js.native
  var Permission: Double = js.native
  val UserId: String = js.native
  def Remove(): Unit = js.native
}

object UserPermission {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    ExpirationDate: VarDate,
    OfficeDotUserPermission_typekey: UserPermission,
    Parent: js.Any,
    Permission: Double,
    Remove: () => Unit,
    UserId: String
  ): UserPermission = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any], Remove = js.Any.fromFunction0(Remove), UserId = UserId.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.UserPermission_typekey")(OfficeDotUserPermission_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermission]
  }
  @scala.inline
  implicit class UserPermissionOps[Self <: UserPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: VarDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotUserPermission_typekey(value: UserPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.UserPermission_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermission(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

