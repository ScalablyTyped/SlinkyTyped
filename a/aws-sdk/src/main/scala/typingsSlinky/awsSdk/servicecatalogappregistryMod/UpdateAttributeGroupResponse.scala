package typingsSlinky.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAttributeGroupResponse extends StObject {
  
  /**
    * The updated information of the attribute group.
    */
  var attributeGroup: js.UndefOr[AttributeGroup] = js.native
}
object UpdateAttributeGroupResponse {
  
  @scala.inline
  def apply(): UpdateAttributeGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAttributeGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateAttributeGroupResponseMutableBuilder[Self <: UpdateAttributeGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeGroup(value: AttributeGroup): Self = StObject.set(x, "attributeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeGroupUndefined: Self = StObject.set(x, "attributeGroup", js.undefined)
  }
}
