package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleRunConfiguration extends js.Object {
  /**
    * A list of upload ARNs for app packages to be installed with your app.
    */
  var auxiliaryApps: js.UndefOr[AmazonResourceNames] = js.native
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.  If you have purchased unmetered device slots, you must set this parameter to unmetered to make use of them. Otherwise, your run counts against your metered time. 
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  /**
    * Input CustomerArtifactPaths object for the scheduled run configuration.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.native
  /**
    * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm extracts to external data for Android or the app's sandbox for iOS.
    */
  var extraDataPackageArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.native
  /**
    * Reserved for internal use.
    */
  var networkProfileArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.native
  /**
    * An array of ARNs for your VPC endpoint configurations.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.native
}

object ScheduleRunConfiguration {
  @scala.inline
  def apply(): ScheduleRunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRunConfiguration]
  }
  @scala.inline
  implicit class ScheduleRunConfigurationOps[Self <: ScheduleRunConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuxiliaryApps(value: AmazonResourceNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryApps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuxiliaryApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxiliaryApps")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingMethod(value: BillingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerArtifactPaths(value: CustomerArtifactPaths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerArtifactPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerArtifactPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerArtifactPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraDataPackageArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDataPackageArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraDataPackageArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDataPackageArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkProfileArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRadios(value: Radios): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadios: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radios")(js.undefined)
        ret
    }
    @scala.inline
    def withVpceConfigurationArns(value: AmazonResourceNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpceConfigurationArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpceConfigurationArns")(js.undefined)
        ret
    }
  }
  
}

