package typingsSlinky.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroupMembership extends js.Object {
  var contactGroupId: js.UndefOr[String] = js.native
}

object ContactGroupMembership {
  @scala.inline
  def apply(): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupMembership]
  }
  @scala.inline
  implicit class ContactGroupMembershipOps[Self <: ContactGroupMembership] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupId")(js.undefined)
        ret
    }
  }
  
}

