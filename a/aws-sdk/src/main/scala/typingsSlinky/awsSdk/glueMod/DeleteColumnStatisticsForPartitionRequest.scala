package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteColumnStatisticsForPartitionRequest extends js.Object {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * Name of the column.
    */
  var ColumnName: NameString = js.native
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * A list of partition values identifying the partition.
    */
  var PartitionValues: ValueStringList = js.native
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}
object DeleteColumnStatisticsForPartitionRequest {
  
  @scala.inline
  def apply(
    ColumnName: NameString,
    DatabaseName: NameString,
    PartitionValues: ValueStringList,
    TableName: NameString
  ): DeleteColumnStatisticsForPartitionRequest = {
    val __obj = js.Dynamic.literal(ColumnName = ColumnName.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], PartitionValues = PartitionValues.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteColumnStatisticsForPartitionRequest]
  }
  
  @scala.inline
  implicit class DeleteColumnStatisticsForPartitionRequestOps[Self <: DeleteColumnStatisticsForPartitionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnName(value: NameString): Self = this.set("ColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionValuesVarargs(value: ValueString*): Self = this.set("PartitionValues", js.Array(value :_*))
    
    @scala.inline
    def setPartitionValues(value: ValueStringList): Self = this.set("PartitionValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
  }
}
