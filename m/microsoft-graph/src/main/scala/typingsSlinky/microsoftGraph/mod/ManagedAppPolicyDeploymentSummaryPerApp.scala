package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppPolicyDeploymentSummaryPerApp extends js.Object {
  // Number of users the policy is applied.
  var configurationAppliedUserCount: js.UndefOr[Double] = js.native
  // Deployment of an app.
  var mobileAppIdentifier: js.UndefOr[MobileAppIdentifier] = js.native
}

object ManagedAppPolicyDeploymentSummaryPerApp {
  @scala.inline
  def apply(): ManagedAppPolicyDeploymentSummaryPerApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummaryPerApp]
  }
  @scala.inline
  implicit class ManagedAppPolicyDeploymentSummaryPerAppOps[Self <: ManagedAppPolicyDeploymentSummaryPerApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationAppliedUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationAppliedUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationAppliedUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationAppliedUserCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileAppIdentifier(value: MobileAppIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileAppIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppIdentifier")(js.undefined)
        ret
    }
  }
  
}

