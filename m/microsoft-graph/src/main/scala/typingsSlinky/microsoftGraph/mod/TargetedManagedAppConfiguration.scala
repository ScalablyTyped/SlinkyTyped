package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetedManagedAppConfiguration extends ManagedAppConfiguration {
  // List of apps to which the policy is deployed.
  var apps: js.UndefOr[js.Array[ManagedMobileApp]] = js.native
  // Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
  var assignments: js.UndefOr[js.Array[TargetedManagedAppPolicyAssignment]] = js.native
  // Count of apps to which the current policy is deployed.
  var deployedAppCount: js.UndefOr[Double] = js.native
  // Navigation property to deployment summary of the configuration.
  var deploymentSummary: js.UndefOr[ManagedAppPolicyDeploymentSummary] = js.native
  // Indicates if the policy is deployed to any inclusion groups or not.
  var isAssigned: js.UndefOr[Boolean] = js.native
}

object TargetedManagedAppConfiguration {
  @scala.inline
  def apply(): TargetedManagedAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetedManagedAppConfiguration]
  }
  @scala.inline
  implicit class TargetedManagedAppConfigurationOps[Self <: TargetedManagedAppConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApps(value: js.Array[ManagedMobileApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apps")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignments(value: js.Array[TargetedManagedAppPolicyAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployedAppCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployedAppCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployedAppCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployedAppCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentSummary(value: ManagedAppPolicyDeploymentSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAssigned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAssigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAssigned")(js.undefined)
        ret
    }
  }
  
}

