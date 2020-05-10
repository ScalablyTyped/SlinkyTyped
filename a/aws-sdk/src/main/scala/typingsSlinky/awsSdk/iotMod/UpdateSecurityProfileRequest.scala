package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSecurityProfileRequest extends js.Object {
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.native
  /**
    * Where the alerts are sent. (Alerts are always sent to the console.)
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.native
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.native
  /**
    * If true, delete all additionalMetricsToRetain defined for this security profile. If any additionalMetricsToRetain are defined in the current invocation, an exception occurs.
    */
  var deleteAdditionalMetricsToRetain: js.UndefOr[DeleteAdditionalMetricsToRetain] = js.native
  /**
    * If true, delete all alertTargets defined for this security profile. If any alertTargets are defined in the current invocation, an exception occurs.
    */
  var deleteAlertTargets: js.UndefOr[DeleteAlertTargets] = js.native
  /**
    * If true, delete all behaviors defined for this security profile. If any behaviors are defined in the current invocation, an exception occurs.
    */
  var deleteBehaviors: js.UndefOr[DeleteBehaviors] = js.native
  /**
    * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different from the actual version, a VersionConflictException is thrown.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  /**
    * A description of the security profile.
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.native
  /**
    * The name of the security profile you want to update.
    */
  var securityProfileName: SecurityProfileName = js.native
}

object UpdateSecurityProfileRequest {
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): UpdateSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecurityProfileRequest]
  }
  @scala.inline
  implicit class UpdateSecurityProfileRequestOps[Self <: UpdateSecurityProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecurityProfileName(value: SecurityProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalMetricsToRetain(value: AdditionalMetricsToRetainList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalMetricsToRetain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalMetricsToRetain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalMetricsToRetain")(js.undefined)
        ret
    }
    @scala.inline
    def withAlertTargets(value: AlertTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlertTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alertTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withBehaviors(value: Behaviors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAdditionalMetricsToRetain(value: DeleteAdditionalMetricsToRetain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAdditionalMetricsToRetain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAdditionalMetricsToRetain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAdditionalMetricsToRetain")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAlertTargets(value: DeleteAlertTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAlertTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAlertTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAlertTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteBehaviors(value: DeleteBehaviors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBehaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteBehaviors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteBehaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedVersion(value: OptionalVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expectedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityProfileDescription(value: SecurityProfileDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileDescription")(js.undefined)
        ret
    }
  }
  
}

