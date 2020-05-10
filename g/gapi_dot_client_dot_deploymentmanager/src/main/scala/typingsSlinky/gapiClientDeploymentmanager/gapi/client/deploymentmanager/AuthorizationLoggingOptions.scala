package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationLoggingOptions extends js.Object {
  /** The type of the permission that was checked. */
  var permissionType: js.UndefOr[String] = js.native
}

object AuthorizationLoggingOptions {
  @scala.inline
  def apply(): AuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationLoggingOptions]
  }
  @scala.inline
  implicit class AuthorizationLoggingOptionsOps[Self <: AuthorizationLoggingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionType")(js.undefined)
        ret
    }
  }
  
}

