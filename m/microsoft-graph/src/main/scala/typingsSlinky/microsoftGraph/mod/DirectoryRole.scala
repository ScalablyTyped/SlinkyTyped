package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryRole extends DirectoryObject {
  // The description for the directory role. Read-only.
  var description: js.UndefOr[String] = js.native
  // The display name for the directory role. Read-only.
  var displayName: js.UndefOr[String] = js.native
  // Users that are members of this directory role. HTTP Methods: GET, POST, DELETE. Read-only. Nullable.
  var members: js.UndefOr[js.Array[DirectoryObject]] = js.native
  /**
    * The id of the directoryRoleTemplate that this role is based on. The property must be specified when activating a
    * directory role in a tenant with a POST operation. After the directory role has been activated, the property is read
    * only.
    */
  var roleTemplateId: js.UndefOr[String] = js.native
}

object DirectoryRole {
  @scala.inline
  def apply(): DirectoryRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryRole]
  }
  @scala.inline
  implicit class DirectoryRoleOps[Self <: DirectoryRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[DirectoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleTemplateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleTemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleTemplateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleTemplateId")(js.undefined)
        ret
    }
  }
  
}

