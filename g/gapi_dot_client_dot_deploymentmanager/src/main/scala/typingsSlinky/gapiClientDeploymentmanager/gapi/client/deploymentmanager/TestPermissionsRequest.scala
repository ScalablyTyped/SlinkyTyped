package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPermissionsRequest extends js.Object {
  /** The set of permissions to check for the 'resource'. Permissions with wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object TestPermissionsRequest {
  @scala.inline
  def apply(): TestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestPermissionsRequest]
  }
  @scala.inline
  implicit class TestPermissionsRequestOps[Self <: TestPermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissions(value: js.Array[String]): Self = {
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

