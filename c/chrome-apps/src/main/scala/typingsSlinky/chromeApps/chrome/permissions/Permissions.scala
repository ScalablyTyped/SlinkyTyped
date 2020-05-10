package typingsSlinky.chromeApps.chrome.permissions

import typingsSlinky.chromeApps.chrome.runtime.OptionalPermission
import typingsSlinky.chromeApps.chrome.runtime.UrlMatches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permissions extends js.Object {
  /**
    * List of origin permissions.
    * Anything listed here must be a subset of a host that appears in the
    * optional_permissions list in the manifest. For example, if
    * http:// *.example.com/ or http:// * appears in optional_permissions,
    * you can request an origin of http://help.example.com/.
    * Any path is ignored.
    */
  var origins: js.UndefOr[js.Array[String | UrlMatches]] = js.native
  /**
    * List of named permissions (does not include hosts or origins).
    * Anything listed here must appear in the optional_permissions list in the manifest.
    */
  var permissions: js.UndefOr[js.Array[OptionalPermission]] = js.native
}

object Permissions {
  @scala.inline
  def apply(): Permissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permissions]
  }
  @scala.inline
  implicit class PermissionsOps[Self <: Permissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrigins(value: js.Array[String | UrlMatches]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origins")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: js.Array[OptionalPermission]): Self = {
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

