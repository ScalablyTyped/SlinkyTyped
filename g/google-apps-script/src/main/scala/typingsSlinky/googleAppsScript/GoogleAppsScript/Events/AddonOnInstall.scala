package typingsSlinky.googleAppsScript.GoogleAppsScript.Events

import typingsSlinky.googleAppsScript.GoogleAppsScript.Script.AuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddonOnInstall extends js.Object {
  var authMode: AuthMode = js.native
}

object AddonOnInstall {
  @scala.inline
  def apply(authMode: AuthMode): AddonOnInstall = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonOnInstall]
  }
  @scala.inline
  implicit class AddonOnInstallOps[Self <: AddonOnInstall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthMode(value: AuthMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

