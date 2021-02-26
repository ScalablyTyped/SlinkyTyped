package typingsSlinky.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutAttributesRequest extends StObject {
  
  /**
    * The name of the domain in which the attributes are being stored.
    */
  var DomainName: String = js.native
  
  /**
    * A list of items on which to perform the operation.
    */
  var Items: ReplaceableItemList = js.native
}
object BatchPutAttributesRequest {
  
  @scala.inline
  def apply(DomainName: String, Items: ReplaceableItemList): BatchPutAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAttributesRequest]
  }
  
  @scala.inline
  implicit class BatchPutAttributesRequestMutableBuilder[Self <: BatchPutAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: ReplaceableItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ReplaceableItem*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
