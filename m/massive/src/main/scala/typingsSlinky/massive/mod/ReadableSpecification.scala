package typingsSlinky.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableSpecification extends StObject {
  
  /** A Database. */
  var db: Database = js.native
  
  /** Whether the object is a materialized view (default false). */
  var is_matview: js.UndefOr[Boolean] = js.native
  
  /** The table or view's name. */
  var name: String = js.native
  
  /** The name of the schema owning the table or view. */
  var schema: String = js.native
}
object ReadableSpecification {
  
  @scala.inline
  def apply(db: Database, name: String, schema: String): ReadableSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableSpecification]
  }
  
  @scala.inline
  implicit class ReadableSpecificationMutableBuilder[Self <: ReadableSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb(value: Database): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_matview(value: Boolean): Self = StObject.set(x, "is_matview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_matviewUndefined: Self = StObject.set(x, "is_matview", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
