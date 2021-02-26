package typingsSlinky.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAttributesRequest extends StObject {
  
  /**
    * The list of attributes.
    */
  var Attributes: ReplaceableAttributeList = js.native
  
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  
  /**
    * The update condition which, if specified, determines whether the specified attributes will be updated or not. The update condition must be satisfied in order for this request to be processed and the attributes to be updated.
    */
  var Expected: js.UndefOr[UpdateCondition] = js.native
  
  /**
    * The name of the item.
    */
  var ItemName: String = js.native
}
object PutAttributesRequest {
  
  @scala.inline
  def apply(Attributes: ReplaceableAttributeList, DomainName: String, ItemName: String): PutAttributesRequest = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAttributesRequest]
  }
  
  @scala.inline
  implicit class PutAttributesRequestMutableBuilder[Self <: PutAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: ReplaceableAttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: ReplaceableAttribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected(value: UpdateCondition): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "Expected", js.undefined)
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
  }
}
