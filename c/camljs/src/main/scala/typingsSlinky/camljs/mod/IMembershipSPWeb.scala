package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DEPRECATED!! Please use UserField(...).IsInSPWeb* methods instead. This interface will be removed in the next release */
@js.native
trait IMembershipSPWeb extends js.Object {
  /** DEPRECATED. Please use UserField(...).IsInSPWebAllUsers() instead */
  def AllUsers(): IExpression = js.native
  /** DEPRECATED. Please use UserField(...).IsInSPWebGroups() instead */
  def Groups(): IExpression = js.native
  /** DEPRECATED. Please use UserField(...).IsInSPWebUsers() instead */
  def Users(): IExpression = js.native
}

object IMembershipSPWeb {
  @scala.inline
  def apply(AllUsers: () => IExpression, Groups: () => IExpression, Users: () => IExpression): IMembershipSPWeb = {
    val __obj = js.Dynamic.literal(AllUsers = js.Any.fromFunction0(AllUsers), Groups = js.Any.fromFunction0(Groups), Users = js.Any.fromFunction0(Users))
    __obj.asInstanceOf[IMembershipSPWeb]
  }
  @scala.inline
  implicit class IMembershipSPWebOps[Self <: IMembershipSPWeb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllUsers(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllUsers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGroups(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUsers(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

