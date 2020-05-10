package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncSource extends js.Object {
  /**
    * Information about the AwsOrganizationsSource resource data sync source. A sync source of this type can synchronize data from AWS Organizations.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.native
  /**
    * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.native
  /**
    * The SyncSource AWS Regions included in the resource data sync.
    */
  var SourceRegions: ResourceDataSyncSourceRegionList = js.native
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in AWS Organizations) or singleAccountMultiRegions.
    */
  var SourceType: ResourceDataSyncSourceType = js.native
}

object ResourceDataSyncSource {
  @scala.inline
  def apply(SourceRegions: ResourceDataSyncSourceRegionList, SourceType: ResourceDataSyncSourceType): ResourceDataSyncSource = {
    val __obj = js.Dynamic.literal(SourceRegions = SourceRegions.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncSource]
  }
  @scala.inline
  implicit class ResourceDataSyncSourceOps[Self <: ResourceDataSyncSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceRegions(value: ResourceDataSyncSourceRegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: ResourceDataSyncSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsOrganizationsSource(value: ResourceDataSyncAwsOrganizationsSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsOrganizationsSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsOrganizationsSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsOrganizationsSource")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFutureRegions(value: ResourceDataSyncIncludeFutureRegions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeFutureRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFutureRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeFutureRegions")(js.undefined)
        ret
    }
  }
  
}

