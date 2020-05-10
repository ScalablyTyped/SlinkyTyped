package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRolePermissionsDataPaged extends GetRolePermissionsData {
  var include_totals: Boolean = js.native
}

object GetRolePermissionsDataPaged {
  @scala.inline
  def apply(id: String, include_totals: Boolean): GetRolePermissionsDataPaged = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolePermissionsDataPaged]
  }
  @scala.inline
  implicit class GetRolePermissionsDataPagedOps[Self <: GetRolePermissionsDataPaged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInclude_totals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include_totals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

