package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksSetSuitesPreferencesResponsePreferences extends js.Object {
  var auto_trigger_checks: js.Array[ChecksSetSuitesPreferencesResponsePreferencesAutoTriggerChecksItem] = js.native
}

object ChecksSetSuitesPreferencesResponsePreferences {
  @scala.inline
  def apply(auto_trigger_checks: js.Array[ChecksSetSuitesPreferencesResponsePreferencesAutoTriggerChecksItem]): ChecksSetSuitesPreferencesResponsePreferences = {
    val __obj = js.Dynamic.literal(auto_trigger_checks = auto_trigger_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesResponsePreferences]
  }
  @scala.inline
  implicit class ChecksSetSuitesPreferencesResponsePreferencesOps[Self <: ChecksSetSuitesPreferencesResponsePreferences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto_trigger_checks(value: js.Array[ChecksSetSuitesPreferencesResponsePreferencesAutoTriggerChecksItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

