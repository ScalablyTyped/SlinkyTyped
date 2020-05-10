package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceDataSyncRequest extends js.Object {
  /**
    * Amazon S3 configuration details for the sync.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.native
  /**
    * A name for the configuration.
    */
  var SyncName: ResourceDataSyncName = js.native
  /**
    * Specify information about the data sources to synchronize.
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSource] = js.native
  /**
    * Specify SyncToDestination to create a resource data sync that synchronizes data from multiple AWS Regions to an Amazon S3 bucket. Specify SyncFromSource to synchronize data from multiple AWS accounts and Regions, as listed in AWS Organizations.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}

object CreateResourceDataSyncRequest {
  @scala.inline
  def apply(SyncName: ResourceDataSyncName): CreateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDataSyncRequest]
  }
  @scala.inline
  implicit class CreateResourceDataSyncRequestOps[Self <: CreateResourceDataSyncRequest] (val x: Self) extends AnyVal {
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
    def withSyncSource(value: ResourceDataSyncSource): Self = {
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

