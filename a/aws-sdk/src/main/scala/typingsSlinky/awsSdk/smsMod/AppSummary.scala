package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSummary extends js.Object {
  
  /**
    * Unique ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
  
  /**
    * Time of creation of this application.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.native
  
  /**
    * Timestamp of the application's creation.
    */
  var lastModified: js.UndefOr[js.Date] = js.native
  
  /**
    * Timestamp of the application's most recent successful replication.
    */
  var latestReplicationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Details about the latest launch of the application.
    */
  var launchDetails: js.UndefOr[LaunchDetails] = js.native
  
  /**
    * Launch status of the application.
    */
  var launchStatus: js.UndefOr[AppLaunchStatus] = js.native
  
  /**
    * A message related to the launch status of the application.
    */
  var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.native
  
  /**
    * Name of the application.
    */
  var name: js.UndefOr[AppName] = js.native
  
  /**
    * Replication status of the application.
    */
  var replicationStatus: js.UndefOr[AppReplicationStatus] = js.native
  
  /**
    * A message related to the replication status of the application.
    */
  var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.native
  
  /**
    * Name of the service role in the customer's account used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  
  /**
    * Status of the application.
    */
  var status: js.UndefOr[AppStatus] = js.native
  
  /**
    * A message related to the status of the application
    */
  var statusMessage: js.UndefOr[AppStatusMessage] = js.native
  
  /**
    * Number of server groups present in the application.
    */
  var totalServerGroups: js.UndefOr[TotalServerGroups] = js.native
  
  /**
    * Number of servers present in the application.
    */
  var totalServers: js.UndefOr[TotalServers] = js.native
}
object AppSummary {
  
  @scala.inline
  def apply(): AppSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppSummary]
  }
  
  @scala.inline
  implicit class AppSummaryOps[Self <: AppSummary] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: AppDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLastModified(value: js.Date): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setLatestReplicationTime(value: js.Date): Self = this.set("latestReplicationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestReplicationTime: Self = this.set("latestReplicationTime", js.undefined)
    
    @scala.inline
    def setLaunchDetails(value: LaunchDetails): Self = this.set("launchDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchDetails: Self = this.set("launchDetails", js.undefined)
    
    @scala.inline
    def setLaunchStatus(value: AppLaunchStatus): Self = this.set("launchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchStatus: Self = this.set("launchStatus", js.undefined)
    
    @scala.inline
    def setLaunchStatusMessage(value: AppLaunchStatusMessage): Self = this.set("launchStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchStatusMessage: Self = this.set("launchStatusMessage", js.undefined)
    
    @scala.inline
    def setName(value: AppName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReplicationStatus(value: AppReplicationStatus): Self = this.set("replicationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationStatus: Self = this.set("replicationStatus", js.undefined)
    
    @scala.inline
    def setReplicationStatusMessage(value: AppReplicationStatusMessage): Self = this.set("replicationStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationStatusMessage: Self = this.set("replicationStatusMessage", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setStatus(value: AppStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: AppStatusMessage): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setTotalServerGroups(value: TotalServerGroups): Self = this.set("totalServerGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalServerGroups: Self = this.set("totalServerGroups", js.undefined)
    
    @scala.inline
    def setTotalServers(value: TotalServers): Self = this.set("totalServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalServers: Self = this.set("totalServers", js.undefined)
  }
}
