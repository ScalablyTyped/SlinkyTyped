package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSlotTypesResponse extends StObject {
  
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of slot types.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An array of objects, one for each slot type, that provides information such as the name of the slot type, the version, and a description.
    */
  var slotTypes: js.UndefOr[SlotTypeMetadataList] = js.native
}
object GetSlotTypesResponse {
  
  @scala.inline
  def apply(): GetSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSlotTypesResponse]
  }
  
  @scala.inline
  implicit class GetSlotTypesResponseMutableBuilder[Self <: GetSlotTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSlotTypes(value: SlotTypeMetadataList): Self = StObject.set(x, "slotTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTypesUndefined: Self = StObject.set(x, "slotTypes", js.undefined)
    
    @scala.inline
    def setSlotTypesVarargs(value: SlotTypeMetadata*): Self = StObject.set(x, "slotTypes", js.Array(value :_*))
  }
}
