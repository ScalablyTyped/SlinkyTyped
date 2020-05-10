package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withAppId(value: AppId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: AppDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestReplicationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestReplicationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestReplicationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestReplicationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchDetails(value: LaunchDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchStatus(value: AppLaunchStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLaunchStatusMessage(value: AppLaunchStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: AppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationStatus(value: AppReplicationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationStatusMessage(value: AppReplicationStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleName(value: RoleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: AppStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: AppStatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalServerGroups(value: TotalServerGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalServerGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalServerGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalServerGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalServers(value: TotalServers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalServers")(js.undefined)
        ret
    }
  }
  
}

