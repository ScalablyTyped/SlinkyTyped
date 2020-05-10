package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceRule extends js.Object {
  /** A condition which is satisfied if the Android Framework API level on the device does not meet a minimum requirement. */
  var apiLevelCondition: js.UndefOr[ApiLevelCondition] = js.native
  /**
    * If set to true, the rule includes a mitigating action to disable applications so that the device is effectively disabled, but application data is
    * preserved. If the device is running an app in locked task mode, the app will be closed and a UI showing the reason for non-compliance will be
    * displayed.
    */
  var disableApps: js.UndefOr[Boolean] = js.native
  /** A condition which is satisfied if there exists any matching NonComplianceDetail for the device. */
  var nonComplianceDetailCondition: js.UndefOr[NonComplianceDetailCondition] = js.native
}

object ComplianceRule {
  @scala.inline
  def apply(): ComplianceRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceRule]
  }
  @scala.inline
  implicit class ComplianceRuleOps[Self <: ComplianceRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiLevelCondition(value: ApiLevelCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiLevelCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiLevelCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiLevelCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableApps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableApps")(js.undefined)
        ret
    }
    @scala.inline
    def withNonComplianceDetailCondition(value: NonComplianceDetailCondition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonComplianceDetailCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonComplianceDetailCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonComplianceDetailCondition")(js.undefined)
        ret
    }
  }
  
}

