package typingsSlinky.pulumiAws.outputMod.dynamodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableAttribute extends StObject {
  
  /**
    * The name of the DynamoDB table.
    */
  var name: String = js.native
  
  var `type`: String = js.native
}
object GetTableAttribute {
  
  @scala.inline
  def apply(name: String, `type`: String): GetTableAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTableAttribute]
  }
  
  @scala.inline
  implicit class GetTableAttributeMutableBuilder[Self <: GetTableAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
