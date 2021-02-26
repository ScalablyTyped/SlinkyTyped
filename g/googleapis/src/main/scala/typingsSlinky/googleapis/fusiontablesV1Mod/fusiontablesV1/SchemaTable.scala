package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a table. Specifies the name, whether it is exportable,
  * description, attribution, and attribution link.
  */
@js.native
trait SchemaTable extends StObject {
  
  /**
    * Optional attribution assigned to the table.
    */
  var attribution: js.UndefOr[String] = js.native
  
  /**
    * Optional link for attribution.
    */
  var attributionLink: js.UndefOr[String] = js.native
  
  /**
    * Optional base table identifier if this table is a view or merged table.
    */
  var baseTableIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Columns in the table.
    */
  var columns: js.UndefOr[js.Array[SchemaColumn]] = js.native
  
  /**
    * Optional description assigned to the table.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Variable for whether table is exportable.
    */
  var isExportable: js.UndefOr[Boolean] = js.native
  
  /**
    * Type name: a template for an individual table.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name assigned to a table.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional sql that encodes the table definition for derived tables.
    */
  var sql: js.UndefOr[String] = js.native
  
  /**
    * Encrypted unique alphanumeric identifier for the table.
    */
  var tableId: js.UndefOr[String] = js.native
}
object SchemaTable {
  
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  @scala.inline
  implicit class SchemaTableMutableBuilder[Self <: SchemaTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionLink(value: String): Self = StObject.set(x, "attributionLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionLinkUndefined: Self = StObject.set(x, "attributionLink", js.undefined)
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setBaseTableIds(value: js.Array[String]): Self = StObject.set(x, "baseTableIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTableIdsUndefined: Self = StObject.set(x, "baseTableIds", js.undefined)
    
    @scala.inline
    def setBaseTableIdsVarargs(value: String*): Self = StObject.set(x, "baseTableIds", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[SchemaColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: SchemaColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsExportable(value: Boolean): Self = StObject.set(x, "isExportable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExportableUndefined: Self = StObject.set(x, "isExportable", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
  }
}
