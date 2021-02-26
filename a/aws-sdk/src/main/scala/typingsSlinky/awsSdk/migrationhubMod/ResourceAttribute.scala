package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceAttribute extends StObject {
  
  /**
    * Type of resource.
    */
  var Type: ResourceAttributeType = js.native
  
  /**
    * Value of the resource type.
    */
  var Value: ResourceAttributeValue = js.native
}
object ResourceAttribute {
  
  @scala.inline
  def apply(Type: ResourceAttributeType, Value: ResourceAttributeValue): ResourceAttribute = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAttribute]
  }
  
  @scala.inline
  implicit class ResourceAttributeMutableBuilder[Self <: ResourceAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ResourceAttributeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ResourceAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
