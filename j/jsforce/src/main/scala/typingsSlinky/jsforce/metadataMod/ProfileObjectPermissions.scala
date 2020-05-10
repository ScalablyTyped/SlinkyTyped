package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileObjectPermissions extends js.Object {
  var allowCreate: js.UndefOr[Boolean] = js.native
  var allowDelete: js.UndefOr[Boolean] = js.native
  var allowEdit: js.UndefOr[Boolean] = js.native
  var allowRead: js.UndefOr[Boolean] = js.native
  var modifyAllRecords: js.UndefOr[Boolean] = js.native
  var `object`: String = js.native
  var viewAllRecords: js.UndefOr[Boolean] = js.native
}

object ProfileObjectPermissions {
  @scala.inline
  def apply(`object`: String): ProfileObjectPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileObjectPermissions]
  }
  @scala.inline
  implicit class ProfileObjectPermissionsOps[Self <: ProfileObjectPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRead")(js.undefined)
        ret
    }
    @scala.inline
    def withModifyAllRecords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyAllRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyAllRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifyAllRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withViewAllRecords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewAllRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewAllRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewAllRecords")(js.undefined)
        ret
    }
  }
  
}

