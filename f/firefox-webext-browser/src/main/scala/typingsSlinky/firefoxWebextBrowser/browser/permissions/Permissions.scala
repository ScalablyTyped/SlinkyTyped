package typingsSlinky.firefoxWebextBrowser.browser.permissions

import typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
import typingsSlinky.firefoxWebextBrowser.browser.manifest.OptionalPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* permissions types */
@js.native
trait Permissions extends js.Object {
  var origins: js.UndefOr[js.Array[MatchPattern]] = js.native
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
    def withOrigins(value: js.Array[MatchPattern]): Self = {
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

