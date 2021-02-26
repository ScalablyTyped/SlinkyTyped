package typingsSlinky.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeKey extends StObject {
  
  /**
    * The name of the facet that the attribute exists within.
    */
  var FacetName: typingsSlinky.awsSdk.clouddirectoryMod.FacetName = js.native
  
  /**
    * The name of the attribute.
    */
  var Name: AttributeName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
    */
  var SchemaArn: Arn = js.native
}
object AttributeKey {
  
  @scala.inline
  def apply(FacetName: FacetName, Name: AttributeName, SchemaArn: Arn): AttributeKey = {
    val __obj = js.Dynamic.literal(FacetName = FacetName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeKey]
  }
  
  @scala.inline
  implicit class AttributeKeyMutableBuilder[Self <: AttributeKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetName(value: FacetName): Self = StObject.set(x, "FacetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
