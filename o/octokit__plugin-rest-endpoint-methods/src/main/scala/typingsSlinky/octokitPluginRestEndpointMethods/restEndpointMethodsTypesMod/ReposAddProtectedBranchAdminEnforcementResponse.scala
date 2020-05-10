package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposAddProtectedBranchAdminEnforcementResponse extends js.Object {
  var enabled: Boolean = js.native
  var url: String = js.native
}

object ReposAddProtectedBranchAdminEnforcementResponse {
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposAddProtectedBranchAdminEnforcementResponse = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddProtectedBranchAdminEnforcementResponse]
  }
  @scala.inline
  implicit class ReposAddProtectedBranchAdminEnforcementResponseOps[Self <: ReposAddProtectedBranchAdminEnforcementResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

