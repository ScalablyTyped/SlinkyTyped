package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonComplianceDetail extends js.Object {
  /** If the policy setting could not be applied, the current value of the setting on the device. */
  var currentValue: js.UndefOr[js.Any] = js.native
  /**
    * For settings with nested fields, if a particular nested field is out of compliance, this specifies the full path to the offending field. The path is
    * formatted in the same way the policy JSON field would be referenced in JavaScript, that is: 1) For object-typed fields, the field name is followed by a
    * dot then by a  subfield name. 2) For array-typed fields, the field name is followed by the array index  enclosed in brackets. For example, to indicate
    * a problem with the url field in the externalData field in the 3rd application, the path would be applications[2].externalData.url
    */
  var fieldPath: js.UndefOr[String] = js.native
  /**
    * If package_name is set and the non-compliance reason is APP_NOT_INSTALLED or APP_NOT_UPDATED, the detailed reason the app cannot be installed or
    * updated.
    */
  var installationFailureReason: js.UndefOr[String] = js.native
  /** The reason the device is not in compliance with the setting. */
  var nonComplianceReason: js.UndefOr[String] = js.native
  /** The package name indicating which application is out of compliance, if applicable. */
  var packageName: js.UndefOr[String] = js.native
  /** The name of the policy setting. This is the JSON field name of a top-level Policy  field. */
  var settingName: js.UndefOr[String] = js.native
}

object NonComplianceDetail {
  @scala.inline
  def apply(): NonComplianceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonComplianceDetail]
  }
  @scala.inline
  implicit class NonComplianceDetailOps[Self <: NonComplianceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldPath")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallationFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationFailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallationFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationFailureReason")(js.undefined)
        ret
    }
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

