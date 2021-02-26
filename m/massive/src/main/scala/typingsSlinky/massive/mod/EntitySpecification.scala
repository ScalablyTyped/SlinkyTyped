package typingsSlinky.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitySpecification extends StObject {
  
  /** A Database. */
  var db: Database = js.native
  
  /** Name of the loader that discovered the entity. */
  var loader: String = js.native
  
  /** The entity's name. */
  var name: String = js.native
  
  /** Path to the entity, if a file. */
  var path: String = js.native
  
  /** Entity's owning schema, if a database object. */
  var schema: String = js.native
}
object EntitySpecification {
  
  @scala.inline
  def apply(db: Database, loader: String, name: String, path: String, schema: String): EntitySpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySpecification]
  }
  
  @scala.inline
  implicit class EntitySpecificationMutableBuilder[Self <: EntitySpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb(value: Database): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
