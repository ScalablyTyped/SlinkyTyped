package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetColumnStatisticsForTableRequest extends StObject {
  
  /**
    * The ID of the Data Catalog where the partitions in question reside. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * A list of the column names.
    */
  var ColumnNames: GetColumnNamesList = js.native
  
  /**
    * The name of the catalog database where the partitions reside.
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The name of the partitions' table.
    */
  var TableName: NameString = js.native
}
object GetColumnStatisticsForTableRequest {
  
  @scala.inline
  def apply(ColumnNames: GetColumnNamesList, DatabaseName: NameString, TableName: NameString): GetColumnStatisticsForTableRequest = {
    val __obj = js.Dynamic.literal(ColumnNames = ColumnNames.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetColumnStatisticsForTableRequest]
  }
  
  @scala.inline
  implicit class GetColumnStatisticsForTableRequestMutableBuilder[Self <: GetColumnStatisticsForTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setColumnNames(value: GetColumnNamesList): Self = StObject.set(x, "ColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "ColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: NameString): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
