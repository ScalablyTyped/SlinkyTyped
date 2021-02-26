package typingsSlinky.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAttributeGroupRequest extends StObject {
  
  /**
    * The name or ID of the attribute group that holds the attributes to describe the application.
    */
  var attributeGroup: AttributeGroupSpecifier = js.native
  
  /**
    * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an application and its components.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The description of the attribute group that the user provides.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The new name of the attribute group. The name must be unique in the region in which you are updating the attribute group.
    */
  var name: js.UndefOr[Name] = js.native
}
object UpdateAttributeGroupRequest {
  
  @scala.inline
  def apply(attributeGroup: AttributeGroupSpecifier): UpdateAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(attributeGroup = attributeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAttributeGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateAttributeGroupRequestMutableBuilder[Self <: UpdateAttributeGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeGroup(value: AttributeGroupSpecifier): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
