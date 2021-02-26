package typingsSlinky.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue extends StObject {
  
  /** The name of the queue. */
  val name: String = js.native
  
  /** The ARN of the queue. */
  val queueARN: String = js.native
  
  /** Alias for `queueARN`. */
  val queueId: String = js.native
}
object Queue {
  
  @scala.inline
  def apply(name: String, queueARN: String, queueId: String): Queue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], queueARN = queueARN.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
  
  @scala.inline
  implicit class QueueMutableBuilder[Self <: Queue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueARN(value: String): Self = StObject.set(x, "queueARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueId(value: String): Self = StObject.set(x, "queueId", value.asInstanceOf[js.Any])
  }
}
