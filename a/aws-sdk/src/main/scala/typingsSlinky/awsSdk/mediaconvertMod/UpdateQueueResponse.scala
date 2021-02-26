package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQueueResponse extends StObject {
  
  /**
    * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
    */
  var Queue: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Queue] = js.native
}
object UpdateQueueResponse {
  
  @scala.inline
  def apply(): UpdateQueueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateQueueResponse]
  }
  
  @scala.inline
  implicit class UpdateQueueResponseMutableBuilder[Self <: UpdateQueueResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueue(value: Queue): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
