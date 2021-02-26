package typingsSlinky.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryFieldType extends StObject {
  
  // name of the field
  var name: String = js.native
  
  // data type of the field
  var `type`: String = js.native
}
object QueryFieldType {
  
  @scala.inline
  def apply(name: String, `type`: String): QueryFieldType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFieldType]
  }
  
  @scala.inline
  implicit class QueryFieldTypeMutableBuilder[Self <: QueryFieldType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
