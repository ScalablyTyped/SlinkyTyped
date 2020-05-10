package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDashboardRequest extends js.Object {
  /**
    * The ID of the AWS account where you want to create the dashboard.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard, also added to the IAM policy.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * Options for publishing the dashboard when you create it:    AvailabilityStatus for AdHocFilteringOption - This status can be either ENABLED or DISABLED. When this is set to DISABLED, QuickSight disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is ENABLED by default.     AvailabilityStatus for ExportToCSVOption - This status can be either ENABLED or DISABLED. The visual option to export data to .csv format isn't enabled when this is set to DISABLED. This option is ENABLED by default.     VisibilityState for SheetControlsOption - This visibility state can be either COLLAPSED or EXPANDED. The sheet controls pane is collapsed by default when set to true. This option is COLLAPSED by default.   
    */
  var DashboardPublishOptions: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.DashboardPublishOptions] = js.native
  /**
    * The display name of the dashboard.
    */
  var Name: DashboardName = js.native
  /**
    * A structure that contains the parameters of the dashboard. These are parameter overrides for a dashboard. A dashboard can have any type of parameters, and some parameters might accept multiple values. You can use the dashboard permissions structure described following to override two string parameters that accept multiple values. 
    */
  var Parameters: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Parameters] = js.native
  /**
    * A structure that contains the permissions of the dashboard. You can use this structure for granting permissions with principal and action information.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The source entity from which the dashboard is created. The source entity accepts the Amazon Resource Name (ARN) of the source template or analysis and also references the replacement datasets for the placeholders set when creating the template. The replacement datasets need to follow the same schema as the datasets for which placeholders were created when creating the template.  If you are creating a dashboard from a source entity in a different AWS account, use the ARN of the source template.
    */
  var SourceEntity: DashboardSourceEntity = js.native
  /**
    * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * A description for the first version of the dashboard being created.
    */
  var VersionDescription: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionDescription] = js.native
}

object CreateDashboardRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    Name: DashboardName,
    SourceEntity: DashboardSourceEntity
  ): CreateDashboardRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceEntity = SourceEntity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardRequest]
  }
  @scala.inline
  implicit class CreateDashboardRequestOps[Self <: CreateDashboardRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashboardId(value: RestrictiveResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: DashboardName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceEntity(value: DashboardSourceEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashboardPublishOptions(value: DashboardPublishOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardPublishOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashboardPublishOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardPublishOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: Parameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: ResourcePermissionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionDescription(value: VersionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionDescription")(js.undefined)
        ret
    }
  }
  
}

