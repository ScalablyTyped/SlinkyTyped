package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataSourceResponse extends js.Object {
  /**
    * Information that describes where the data source is located and how the data source is configured. The specific information in the description depends on the data source provider.
    */
  var Configuration: js.UndefOr[DataSourceConfiguration] = js.native
  /**
    * The Unix timestamp of when the data source was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The description of the data source.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Description] = js.native
  /**
    * When the Status field value is FAILED, the ErrorMessage field contains a description of the error that caused the data source to fail.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * The identifier of the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: js.UndefOr[typingsSlinky.awsSdk.kendraMod.IndexId] = js.native
  /**
    * The name that you gave the data source when it was created.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that enables the data source to access its resources.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.kendraMod.RoleArn] = js.native
  /**
    * The schedule that Amazon Kendra will update the data source.
    */
  var Schedule: js.UndefOr[ScanSchedule] = js.native
  /**
    * The current status of the data source. When the status is ACTIVE the data source is ready to use. When the status is FAILED, the ErrorMessage field contains the reason that the data source failed.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  /**
    * The Unix timestamp of when the data source was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.native
}

object DescribeDataSourceResponse {
  @scala.inline
  def apply(): DescribeDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDataSourceResponse]
  }
  @scala.inline
  implicit class DescribeDataSourceResponseOps[Self <: DescribeDataSourceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: DataSourceConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: DataSourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: DataSourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: ScanSchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: DataSourceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DataSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(js.undefined)
        ret
    }
  }
  
}

