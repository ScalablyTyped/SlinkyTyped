package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule declaring which mitigating actions to take when a device is not
  * compliant with its policy. For every rule, there is always an implicit
  * mitigating action to set policy_compliant to false for the Device resource,
  * and display a message on the device indicating that the device is not
  * compliant with its policy. Other mitigating actions may optionally be taken
  * as well, depending on the field values in the rule.
  */
@js.native
trait SchemaComplianceRule extends js.Object {
  /**
    * A condition which is satisfied if the Android Framework API level on the
    * device doesn&#39;t meet a minimum requirement.
    */
  var apiLevelCondition: js.UndefOr[SchemaApiLevelCondition] = js.native
  /**
    * If set to true, the rule includes a mitigating action to disable apps so
    * that the device is effectively disabled, but app data is preserved. If
    * the device is running an app in locked task mode, the app will be closed
    * and a UI showing the reason for non-compliance will be displayed.
    */
  var disableApps: js.UndefOr[Boolean] = js.native
  /**
    * A condition which is satisfied if there exists any matching
    * NonComplianceDetail for the device.
    */
  var nonComplianceDetailCondition: js.UndefOr[SchemaNonComplianceDetailCondition] = js.native
  /**
    * If set, the rule includes a mitigating action to disable apps specified
    * in the list, but app data is preserved.
    */
  var packageNamesToDisable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaComplianceRule {
  @scala.inline
  def apply(): SchemaComplianceRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComplianceRule]
  }
  @scala.inline
  implicit class SchemaComplianceRuleOps[Self <: SchemaComplianceRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiLevelCondition(value: SchemaApiLevelCondition): Self = {
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
    def withNonComplianceDetailCondition(value: SchemaNonComplianceDetailCondition): Self = {
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
    @scala.inline
    def withPackageNamesToDisable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageNamesToDisable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageNamesToDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageNamesToDisable")(js.undefined)
        ret
    }
  }
  
}

