package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecurityProfileResponse extends js.Object {
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
    * The time the security profile was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The time the security profile was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.native
  /**
    * A description of the security profile (associated with the security profile when it was created or updated).
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.native
  /**
    * The name of the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.native
  /**
    * The version of the security profile. A new version is generated whenever the security profile is updated.
    */
  var version: js.UndefOr[Version] = js.native
}

object DescribeSecurityProfileResponse {
  @scala.inline
  def apply(): DescribeSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityProfileResponse]
  }
  @scala.inline
  implicit class DescribeSecurityProfileResponseOps[Self <: DescribeSecurityProfileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityProfileArn(value: SecurityProfileArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileArn")(js.undefined)
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
    @scala.inline
    def withSecurityProfileName(value: SecurityProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

