package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editors extends js.Object {
  /**
    * True if anyone in the document's domain has edit access to the protected
    * range.  Domain protection is only supported on documents within a domain.
    */
  var domainUsersCanEdit: js.UndefOr[Boolean] = js.native
  /** The email addresses of groups with edit access to the protected range. */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /** The email addresses of users with edit access to the protected range. */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object Editors {
  @scala.inline
  def apply(): Editors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Editors]
  }
  @scala.inline
  implicit class EditorsOps[Self <: Editors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainUsersCanEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainUsersCanEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainUsersCanEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainUsersCanEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(js.undefined)
        ret
    }
  }
  
}

