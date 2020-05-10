package typingsSlinky.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthSettings extends js.Object {
  var access: js.UndefOr[js.Array[AccessSetting]] = js.native
  var mode: AuthMode = js.native
  var strategies: js.Array[String] = js.native
}

object AuthSettings {
  @scala.inline
  def apply(mode: AuthMode, strategies: js.Array[String]): AuthSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], strategies = strategies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSettings]
  }
  @scala.inline
  implicit class AuthSettingsOps[Self <: AuthSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: AuthMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccess(value: js.Array[AccessSetting]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access")(js.undefined)
        ret
    }
  }
  
}

