package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  /**
    * Groupings of columns that work together in certain Amazon QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.native
  /**
    * The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't imported into SPICE.
    */
  var ConsumedSpiceCapacityInBytes: js.UndefOr[Long_] = js.native
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
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.LogicalTableMap] = js.native
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The list of columns after all transforms. These columns are available in templates, analyses, and dashboards.
    */
  var OutputColumns: js.UndefOr[OutputColumnList] = js.native
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.PhysicalTableMap] = js.native
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.native
}

object DataSet {
  @scala.inline
  def apply(): DataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSet]
  }
  @scala.inline
  implicit class DataSetOps[Self <: DataSet] (val x: Self) extends AnyVal {
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
    def withColumnGroups(value: ColumnGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumedSpiceCapacityInBytes(value: Long_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedSpiceCapacityInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumedSpiceCapacityInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConsumedSpiceCapacityInBytes")(js.undefined)
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
    def withLogicalTableMap(value: LogicalTableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalTableMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalTableMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalTableMap")(js.undefined)
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
    def withOutputColumns(value: OutputColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalTableMap(value: PhysicalTableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalTableMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalTableMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalTableMap")(js.undefined)
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

