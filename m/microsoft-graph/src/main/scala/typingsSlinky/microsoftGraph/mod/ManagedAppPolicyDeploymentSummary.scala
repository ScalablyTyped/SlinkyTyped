package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigurationDeployedUserCount(value: Double): Self = this.set("configurationDeployedUserCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationDeployedUserCount: Self = this.set("configurationDeployedUserCount", js.undefined)
    
    @scala.inline
    def setConfigurationDeploymentSummaryPerAppVarargs(value: ManagedAppPolicyDeploymentSummaryPerApp*): Self = this.set("configurationDeploymentSummaryPerApp", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationDeploymentSummaryPerApp(value: js.Array[ManagedAppPolicyDeploymentSummaryPerApp]): Self = this.set("configurationDeploymentSummaryPerApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationDeploymentSummaryPerApp: Self = this.set("configurationDeploymentSummaryPerApp", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = this.set("lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshTime: Self = this.set("lastRefreshTime", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
