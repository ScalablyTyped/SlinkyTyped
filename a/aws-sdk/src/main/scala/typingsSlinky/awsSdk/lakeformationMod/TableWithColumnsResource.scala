package typingsSlinky.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableWithColumnsResource extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, it is the account ID of the caller.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * The list of column names for the table. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnNames: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ColumnNames] = js.native
  
  /**
    * A wildcard specified by a ColumnWildcard object. At least one of ColumnNames or ColumnWildcard is required.
    */
  var ColumnWildcard: js.UndefOr[typingsSlinky.awsSdk.lakeformationMod.ColumnWildcard] = js.native
  
  /**
    * The name of the database for the table with columns resource. Unique to the Data Catalog. A database is a set of associated table definitions organized into a logical group. You can Grant and Revoke database privileges to a principal. 
    */
  var DatabaseName: NameString = js.native
  
  /**
    * The name of the table resource. A table is a metadata definition that represents your data. You can Grant and Revoke table privileges to a principal. 
    */
  var Name: NameString = js.native
}
object TableWithColumnsResource {
  
  @scala.inline
  def apply(DatabaseName: NameString, Name: NameString): TableWithColumnsResource = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableWithColumnsResource]
  }
  
  @scala.inline
  implicit class TableWithColumnsResourceMutableBuilder[Self <: TableWithColumnsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setColumnNames(value: ColumnNames): Self = StObject.set(x, "ColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNamesUndefined: Self = StObject.set(x, "ColumnNames", js.undefined)
    
    @scala.inline
    def setColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "ColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setColumnWildcard(value: ColumnWildcard): Self = StObject.set(x, "ColumnWildcard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWildcardUndefined: Self = StObject.set(x, "ColumnWildcard", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
