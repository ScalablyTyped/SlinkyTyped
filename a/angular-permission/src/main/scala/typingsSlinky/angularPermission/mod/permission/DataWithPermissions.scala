package typingsSlinky.angularPermission.mod.permission

import typingsSlinky.angularPermission.AnonExcept
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataWithPermissions extends js.Object {
  var permissions: js.UndefOr[AnonExcept] = js.native
}

object DataWithPermissions {
  @scala.inline
  def apply(): DataWithPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataWithPermissions]
  }
  @scala.inline
  implicit class DataWithPermissionsOps[Self <: DataWithPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissions(value: AnonExcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
  }
  
}

