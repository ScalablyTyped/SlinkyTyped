package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonComplianceDetailCondition extends js.Object {
  /** The reason the device is not in compliance with the setting. If not set, then this condition matches any reason. */
  var nonComplianceReason: js.UndefOr[String] = js.native
  /** The package name indicating which application is out of compliance. If not set, then this condition matches any package name. */
  var packageName: js.UndefOr[String] = js.native
  /** The name of the policy setting. This is the JSON field name of a top-level Policy field. If not set, then this condition matches any setting name. */
  var settingName: js.UndefOr[String] = js.native
}

object NonComplianceDetailCondition {
  @scala.inline
  def apply(): NonComplianceDetailCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonComplianceDetailCondition]
  }
  @scala.inline
  implicit class NonComplianceDetailConditionOps[Self <: NonComplianceDetailCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonComplianceReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonComplianceReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonComplianceReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonComplianceReason")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageName")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingName")(js.undefined)
        ret
    }
  }
  
}

