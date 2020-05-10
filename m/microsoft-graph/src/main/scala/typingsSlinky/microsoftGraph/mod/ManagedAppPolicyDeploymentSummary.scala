package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedAppPolicyDeploymentSummary extends Entity {
  // Not yet documented
  var configurationDeployedUserCount: js.UndefOr[Double] = js.native
  // Not yet documented
  var configurationDeploymentSummaryPerApp: js.UndefOr[js.Array[ManagedAppPolicyDeploymentSummaryPerApp]] = js.native
  // Not yet documented
  var displayName: js.UndefOr[String] = js.native
  // Not yet documented
  var lastRefreshTime: js.UndefOr[String] = js.native
  // Version of the entity.
  var version: js.UndefOr[String] = js.native
}

object ManagedAppPolicyDeploymentSummary {
  @scala.inline
  def apply(): ManagedAppPolicyDeploymentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppPolicyDeploymentSummary]
  }
  @scala.inline
  implicit class ManagedAppPolicyDeploymentSummaryOps[Self <: ManagedAppPolicyDeploymentSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationDeployedUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationDeployedUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationDeployedUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationDeployedUserCount")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationDeploymentSummaryPerApp(value: js.Array[ManagedAppPolicyDeploymentSummaryPerApp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationDeploymentSummaryPerApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationDeploymentSummaryPerApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationDeploymentSummaryPerApp")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRefreshTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRefreshTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastRefreshTime")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
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

