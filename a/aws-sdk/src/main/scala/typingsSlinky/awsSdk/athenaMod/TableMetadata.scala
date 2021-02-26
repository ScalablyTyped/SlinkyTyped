package typingsSlinky.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableMetadata extends StObject {
  
  /**
    * A list of the columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.native
  
  /**
    * The time that the table was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The last time the table was accessed.
    */
  var LastAccessTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the table.
    */
  var Name: NameString = js.native
  
  /**
    * A set of custom key/value pairs for table properties.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * A list of the partition keys in the table.
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.native
  
  /**
    * The type of table. In Athena, only EXTERNAL_TABLE is supported.
    */
  var TableType: js.UndefOr[TableTypeString] = js.native
}
object TableMetadata {
  
  @scala.inline
  def apply(Name: NameString): TableMetadata = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
  
  @scala.inline
  implicit class TableMetadataMutableBuilder[Self <: TableMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: ColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setLastAccessTime(value: js.Date): Self = StObject.set(x, "LastAccessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessTimeUndefined: Self = StObject.set(x, "LastAccessTime", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setPartitionKeys(value: ColumnList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    @scala.inline
    def setPartitionKeysVarargs(value: Column*): Self = StObject.set(x, "PartitionKeys", js.Array(value :_*))
    
    @scala.inline
    def setTableType(value: TableTypeString): Self = StObject.set(x, "TableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableTypeUndefined: Self = StObject.set(x, "TableType", js.undefined)
  }
}
