package typingsSlinky.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionResponse extends js.Object {
  /**
    * Information about the permission.
    */
  var permission: js.UndefOr[ResourceSharePermissionDetail] = js.native
}

object GetPermissionResponse {
  @scala.inline
  def apply(): GetPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionResponse]
  }
  @scala.inline
  implicit class GetPermissionResponseOps[Self <: GetPermissionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermission(value: ResourceSharePermissionDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permission")(js.undefined)
        ret
    }
  }
  
}

