package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DEPRECATED!! Please use UserField(...).IsIn* methods instead. This interface will be removed in the next release */
@js.native
trait IMembership extends js.Object {
  /** DEPRECATED. Please use UserField(...).IsInSPWeb* methods instead */
  var SPWeb: IMembershipSPWeb = js.native
  /** DEPRECATED. Please use UserField(...).IsInCurrentUserGroups() instead */
  def CurrentUserGroups(): IExpression = js.native
  /** DEPRECATED. Please use UserField(...).IsInSPGroup() instead */
  def SPGroup(groupId: Double): IExpression = js.native
}

object IMembership {
  @scala.inline
  def apply(CurrentUserGroups: () => IExpression, SPGroup: Double => IExpression, SPWeb: IMembershipSPWeb): IMembership = {
    val __obj = js.Dynamic.literal(CurrentUserGroups = js.Any.fromFunction0(CurrentUserGroups), SPGroup = js.Any.fromFunction1(SPGroup), SPWeb = SPWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMembership]
  }
  @scala.inline
  implicit class IMembershipOps[Self <: IMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentUserGroups(value: () => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentUserGroups")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSPGroup(value: Double => IExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSPWeb(value: IMembershipSPWeb): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPWeb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

