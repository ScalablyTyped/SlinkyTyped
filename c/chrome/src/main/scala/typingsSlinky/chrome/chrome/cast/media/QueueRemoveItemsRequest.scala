package typingsSlinky.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueRemoveItemsRequest extends StObject {
  
  var customData: js.Object = js.native
  
  var itemIds: js.Array[Double] = js.native
}
object QueueRemoveItemsRequest {
  
  @scala.inline
  def apply(customData: js.Object, itemIds: js.Array[Double]): QueueRemoveItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], itemIds = itemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueRemoveItemsRequest]
  }
  
  @scala.inline
  implicit class QueueRemoveItemsRequestMutableBuilder[Self <: QueueRemoveItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIds(value: js.Array[Double]): Self = StObject.set(x, "itemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdsVarargs(value: Double*): Self = StObject.set(x, "itemIds", js.Array(value :_*))
  }
}
