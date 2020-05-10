package typingsSlinky.firefoxWebextBrowser.browser.permissions

import typingsSlinky.firefoxWebextBrowser.browser.manifest.MatchPattern
import typingsSlinky.firefoxWebextBrowser.browser.manifest.Permission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyPermissions extends js.Object {
  var origins: js.UndefOr[js.Array[MatchPattern]] = js.native
  var permissions: js.UndefOr[js.Array[Permission]] = js.native
}

object AnyPermissions {
  @scala.inline
  def apply(): AnyPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnyPermissions]
  }
  @scala.inline
  implicit class AnyPermissionsOps[Self <: AnyPermissions] (val x: Self) extends AnyVal {
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
    def withPermissions(value: js.Array[Permission]): Self = {
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

