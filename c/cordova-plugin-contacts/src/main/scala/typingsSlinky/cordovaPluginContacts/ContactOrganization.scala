package typingsSlinky.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ContactOrganization object stores a contact's organization properties. A Contact object stores
  * one or more ContactOrganization objects in an array.
  */
@js.native
trait ContactOrganization extends js.Object {
  /** The department the contract works for. */
  var department: js.UndefOr[String] = js.native
  /** The name of the organization. */
  var name: js.UndefOr[String] = js.native
  /** Set to true if this ContactOrganization contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.native
  /** The contact's title at the organization. */
  var title: js.UndefOr[String] = js.native
  /** A string that indicates what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.native
}

object ContactOrganization {
  @scala.inline
  def apply(): ContactOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactOrganization]
  }
  @scala.inline
  implicit class ContactOrganizationOps[Self <: ContactOrganization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDepartment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("department")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPref(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pref")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

