package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/find.html#db-index
@js.native
trait CreateIndexResponse extends StObject {
  
  // Id of the design document the index was created in.
  var id: String = js.native
  
  // Name of the index created.
  var name: String = js.native
  
  // Flag to show whether the index was created or one already exists. Can be “created” or “exists”.
  var result: String = js.native
}
object CreateIndexResponse {
  
  @scala.inline
  def apply(id: String, name: String, result: String): CreateIndexResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexResponse]
  }
  
  @scala.inline
  implicit class CreateIndexResponseMutableBuilder[Self <: CreateIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
