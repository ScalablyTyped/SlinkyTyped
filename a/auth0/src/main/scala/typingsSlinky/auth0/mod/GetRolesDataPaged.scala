package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRolesDataPaged extends GetRolesData {
  var include_totals: Boolean = js.native
}

object GetRolesDataPaged {
  @scala.inline
  def apply(include_totals: Boolean): GetRolesDataPaged = {
    val __obj = js.Dynamic.literal(include_totals = include_totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRolesDataPaged]
  }
  @scala.inline
  implicit class GetRolesDataPagedOps[Self <: GetRolesDataPaged] (val x: Self) extends AnyVal {
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

