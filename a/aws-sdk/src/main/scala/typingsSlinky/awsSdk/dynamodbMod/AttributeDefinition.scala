package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeDefinition extends StObject {
  
  /**
    * A name for the attribute.
    */
  var AttributeName: KeySchemaAttributeName = js.native
  
  /**
    * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
    */
  var AttributeType: ScalarAttributeType = js.native
}
object AttributeDefinition {
  
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, AttributeType: ScalarAttributeType): AttributeDefinition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDefinition]
  }
  
  @scala.inline
  implicit class AttributeDefinitionMutableBuilder[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: KeySchemaAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeType(value: ScalarAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
  }
}
