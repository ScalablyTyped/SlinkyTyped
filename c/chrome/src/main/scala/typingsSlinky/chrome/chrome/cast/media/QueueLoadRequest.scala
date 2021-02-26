package typingsSlinky.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueLoadRequest extends StObject {
  
  var customData: js.Object = js.native
  
  var items: js.Array[QueueItem] = js.native
  
  var repeatMode: RepeatMode = js.native
  
  var startIndex: Double = js.native
}
object QueueLoadRequest {
  
  @scala.inline
  def apply(customData: js.Object, items: js.Array[QueueItem], repeatMode: RepeatMode, startIndex: Double): QueueLoadRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], repeatMode = repeatMode.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueLoadRequest]
  }
  
  @scala.inline
  implicit class QueueLoadRequestMutableBuilder[Self <: QueueLoadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[QueueItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: QueueItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setRepeatMode(value: RepeatMode): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
