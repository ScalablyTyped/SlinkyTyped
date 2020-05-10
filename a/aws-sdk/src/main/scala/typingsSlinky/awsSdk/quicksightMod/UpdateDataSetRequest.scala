package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSetRequest extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.
    */
  var ColumnGroups: js.UndefOr[ColumnGroupList] = js.native
  /**
    * The ID for the dataset that you want to update. This ID is unique per AWS Region for each AWS account.
    */
  var DataSetId: ResourceId = js.native
  /**
    * Indicates whether you want to import the data into SPICE.
    */
  var ImportMode: DataSetImportMode = js.native
  /**
    * Configures the combination and transformation of the data from the physical tables.
    */
  var LogicalTableMap: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.LogicalTableMap] = js.native
  /**
    * The display name for the dataset.
    */
  var Name: ResourceName = js.native
  /**
    * Declares the physical tables that are available in the underlying data sources.
    */
  var PhysicalTableMap: typingsSlinky.awsSdk.quicksightMod.PhysicalTableMap = js.native
  /**
    * The row-level security configuration for the data you want to create.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RowLevelPermissionDataSet] = js.native
}

object UpdateDataSetRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DataSetId: ResourceId,
    ImportMode: DataSetImportMode,
    Name: ResourceName,
    PhysicalTableMap: PhysicalTableMap
  ): UpdateDataSetRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], ImportMode = ImportMode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PhysicalTableMap = PhysicalTableMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetRequest]
  }
  @scala.inline
  implicit class UpdateDataSetRequestOps[Self <: UpdateDataSetRequest] (val x: Self) extends AnyVal {
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
    def withDataSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportMode(value: DataSetImportMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhysicalTableMap(value: PhysicalTableMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalTableMap")(value.asInstanceOf[js.Any])
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

