package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncSourceWithState extends js.Object {
  /**
    * The field name in SyncSource for the ResourceDataSyncAwsOrganizationsSource type.
    */
  var AwsOrganizationsSource: js.UndefOr[ResourceDataSyncAwsOrganizationsSource] = js.native
  /**
    * Whether to automatically synchronize and aggregate data from new AWS Regions when those Regions come online.
    */
  var IncludeFutureRegions: js.UndefOr[ResourceDataSyncIncludeFutureRegions] = js.native
  /**
    * The SyncSource AWS Regions included in the resource data sync.
    */
  var SourceRegions: js.UndefOr[ResourceDataSyncSourceRegionList] = js.native
  /**
    * The type of data source for the resource data sync. SourceType is either AwsOrganizations (if an organization is present in AWS Organizations) or singleAccountMultiRegions.
    */
  var SourceType: js.UndefOr[ResourceDataSyncSourceType] = js.native
  /**
    * The data type name for including resource data sync state. There are four sync states:  OrganizationNotExists: Your organization doesn't exist.  NoPermissions: The system can't locate the service-linked role. This role is automatically created when a user creates a resource data sync in Explorer.  InvalidOrganizationalUnit: You specified or selected an invalid unit in the resource data sync configuration.  TrustedAccessDisabled: You disabled Systems Manager access in the organization in AWS Organizations.
    */
  var State: js.UndefOr[ResourceDataSyncState] = js.native
}

object ResourceDataSyncSourceWithState {
  @scala.inline
  def apply(): ResourceDataSyncSourceWithState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncSourceWithState]
  }
  @scala.inline
  implicit class ResourceDataSyncSourceWithStateOps[Self <: ResourceDataSyncSourceWithState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSourceRegions(value: ResourceDataSyncSourceRegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: ResourceDataSyncSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: ResourceDataSyncState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

