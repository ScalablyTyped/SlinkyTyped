package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceDataSyncRequest extends js.Object {
  /**
    * The name of the resource data sync you want to update.
    */
  var SyncName: ResourceDataSyncName = js.native
  /**
    * Specify information about the data sources to synchronize.
    */
  var SyncSource: ResourceDataSyncSource = js.native
  /**
    * The type of resource data sync. If SyncType is SyncToDestination, then the resource data sync synchronizes data to an Amazon S3 bucket. If the SyncType is SyncFromSource then the resource data sync synchronizes data from AWS Organizations or from multiple AWS Regions.
    */
  var SyncType: ResourceDataSyncType = js.native
}

object UpdateResourceDataSyncRequest {
  @scala.inline
  def apply(SyncName: ResourceDataSyncName, SyncSource: ResourceDataSyncSource, SyncType: ResourceDataSyncType): UpdateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any], SyncSource = SyncSource.asInstanceOf[js.Any], SyncType = SyncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceDataSyncRequest]
  }
  @scala.inline
  implicit class UpdateResourceDataSyncRequestOps[Self <: UpdateResourceDataSyncRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSyncName(value: ResourceDataSyncName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncSource(value: ResourceDataSyncSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncType(value: ResourceDataSyncType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SyncType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

