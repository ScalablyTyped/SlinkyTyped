package typingsSlinky.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueuesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var queues: js.Array[Queue] = js.native
}
object ListQueuesResponse {
  
  @scala.inline
  def apply(queues: js.Array[Queue]): ListQueuesResponse = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesResponse]
  }
  
  @scala.inline
  implicit class ListQueuesResponseMutableBuilder[Self <: ListQueuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setQueues(value: js.Array[Queue]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "queues", js.Array(value :_*))
  }
}
