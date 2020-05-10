package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The ID of the dataset.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.native
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: js.UndefOr[DataSetImportMode] = js.native
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.native
}

object DataSetSummary {
  @scala.inline
  def apply(): DataSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetSummary]
  }
  @scala.inline
  implicit class DataSetSummaryOps[Self <: DataSetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withImportMode(value: DataSetImportMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
    def withRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowLevelPermissionDataSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowLevelPermissionDataSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RowLevelPermissionDataSet")(js.undefined)
        ret
    }
  }
  
}

