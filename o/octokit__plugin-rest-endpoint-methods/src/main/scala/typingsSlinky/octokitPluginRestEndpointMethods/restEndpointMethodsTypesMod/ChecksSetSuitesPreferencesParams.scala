package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksSetSuitesPreferencesParams extends js.Object {
  /**
    * Enables or disables automatic creation of CheckSuite events upon pushes to the repository. Enabled by default. See the [`auto_trigger_checks` object](https://developer.github.com/v3/checks/suites/#auto_trigger_checks-object) description for details.
    */
  var auto_trigger_checks: js.UndefOr[js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]] = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ChecksSetSuitesPreferencesParams {
  @scala.inline
  def apply(owner: String, repo: String): ChecksSetSuitesPreferencesParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesParams]
  }
  @scala.inline
  implicit class ChecksSetSuitesPreferencesParamsOps[Self <: ChecksSetSuitesPreferencesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto_trigger_checks(value: js.Array[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuto_trigger_checks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto_trigger_checks")(js.undefined)
        ret
    }
  }
  
}

