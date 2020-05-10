package typingsSlinky.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroupMembership extends js.Object {
  /** Output only. The contact group ID for the contact group membership. */
  var contactGroupId: js.UndefOr[String] = js.native
  /**
    * The resource name for the contact group, assigned by the server. An ASCII
    * string, in the form of `contactGroups/{contact_group_id}`.
    * Only contact_group_resource_name can be used for modifying memberships.
    * Any contact group membership can be removed, but only user group or
    * "myContacts" or "starred" system groups memberships can be added. A
    * contact must always have at least one contact group membership.
    */
  var contactGroupResourceName: js.UndefOr[String] = js.native
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
    @scala.inline
    def withContactGroupResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactGroupResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroupResourceName")(js.undefined)
        ret
    }
  }
  
}

