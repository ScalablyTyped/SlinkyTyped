package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    * Describes application configuration updates.
    */
  var ApplicationConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationConfigurationUpdate] = js.native
  /**
    * The name of the application to update.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging options with this action. To add a new CloudWatch logging option, use AddApplicationCloudWatchLoggingOption.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdates] = js.native
  /**
    * The current application version ID. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * Describes updates to the application's starting parameters.
    */
  var RunConfigurationUpdate: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.RunConfigurationUpdate] = js.native
  /**
    * Describes updates to the service execution role.
    */
  var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  @scala.inline
  implicit class UpdateApplicationRequestOps[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationName(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentApplicationVersionId(value: ApplicationVersionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentApplicationVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationConfigurationUpdate(value: ApplicationConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudWatchLoggingOptionUpdates(value: CloudWatchLoggingOptionUpdates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudWatchLoggingOptionUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloudWatchLoggingOptionUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withRunConfigurationUpdate(value: RunConfigurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunConfigurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunConfigurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RunConfigurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceExecutionRoleUpdate(value: RoleARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceExecutionRoleUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceExecutionRoleUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceExecutionRoleUpdate")(js.undefined)
        ret
    }
  }
  
}

