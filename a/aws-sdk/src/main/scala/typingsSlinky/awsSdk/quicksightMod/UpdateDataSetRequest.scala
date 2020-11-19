package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: ResourceId): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportMode(value: DataSetImportMode): Self = this.set("ImportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalTableMap(value: PhysicalTableMap): Self = this.set("PhysicalTableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroupsVarargs(value: ColumnGroup*): Self = this.set("ColumnGroups", js.Array(value :_*))
    
    @scala.inline
    def setColumnGroups(value: ColumnGroupList): Self = this.set("ColumnGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGroups: Self = this.set("ColumnGroups", js.undefined)
    
    @scala.inline
    def setLogicalTableMap(value: LogicalTableMap): Self = this.set("LogicalTableMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicalTableMap: Self = this.set("LogicalTableMap", js.undefined)
    
    @scala.inline
    def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = this.set("RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLevelPermissionDataSet: Self = this.set("RowLevelPermissionDataSet", js.undefined)
  }
}
