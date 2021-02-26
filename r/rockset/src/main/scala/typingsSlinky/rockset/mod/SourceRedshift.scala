package typingsSlinky.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceRedshift extends StObject {
  
  // name of the database in Redshift Cluster
  var database: String = js.native
  
  // field in Redshift source table to monitor for updates
  var incremental_field: js.UndefOr[String] = js.native
  
  // schema which contains the Redshift table
  var schema: String = js.native
  
  // name of Redshift table containing data
  var table_name: String = js.native
}
object SourceRedshift {
  
  @scala.inline
  def apply(database: String, schema: String, table_name: String): SourceRedshift = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], table_name = table_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRedshift]
  }
  
  @scala.inline
  implicit class SourceRedshiftMutableBuilder[Self <: SourceRedshift] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncremental_field(value: String): Self = StObject.set(x, "incremental_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncremental_fieldUndefined: Self = StObject.set(x, "incremental_field", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable_name(value: String): Self = StObject.set(x, "table_name", value.asInstanceOf[js.Any])
  }
}
