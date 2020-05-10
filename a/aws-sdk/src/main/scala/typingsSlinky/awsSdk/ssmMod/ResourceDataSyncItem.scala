package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncItem extends js.Object {
  /**
    * The status reported by the last sync.
    */
  var LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.native
  /**
    * The last time the sync operations returned a status of SUCCESSFUL (UTC).
    */
  var LastSuccessfulSyncTime: js.UndefOr[js.Date] = js.native
  /**
    * The status message details reported by the last sync.
    */
  var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.native
  /**
    * The last time the configuration attempted to sync (UTC).
    */
  var LastSyncTime: js.UndefOr[js.Date] = js.native
  /**
    * Configuration information for the target Amazon S3 bucket.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.native
  /**
    * The date and time the configuration was created (UTC).
    */
  var SyncCreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The date and time the resource data sync was changed. 
    */
  var SyncLastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the Resource Data Sync.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.native
  /**
    * Information about the source where the data was synchronized. 
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSourceWithState] = js.native
  /**
    * The type of resource data sync. If SyncType is SyncToDestination, then the resource data sync synchronizes data to an Amazon S3 bucket. If the SyncType is SyncFromSource then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}

object ResourceDataSyncItem {
  @scala.inline
  def apply(): ResourceDataSyncItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncItem]
  }
  @scala.inline
  implicit class ResourceDataSyncItemOps[Self <: ResourceDataSyncItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastStatus(value: LastResourceDataSyncStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfulSyncTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulSyncTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulSyncTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulSyncTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSyncStatusMessage(value: LastResourceDataSyncMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSyncStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSyncStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSyncStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSyncTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSyncTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSyncTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSyncTime")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Destination(value: ResourceDataSyncS3Destination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Destination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Destination")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncCreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncCreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncLastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncLastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncName(value: ResourceDataSyncName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncName")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncSource(value: ResourceDataSyncSourceWithState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSource")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncType(value: ResourceDataSyncType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncType")(js.undefined)
        ret
    }
  }
  
}

