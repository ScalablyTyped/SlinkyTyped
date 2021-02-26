package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimensions extends StObject {
  
  /**
    * The channel used for grouping and filters.
    */
  var Channel: js.UndefOr[typingsSlinky.awsSdk.connectMod.Channel] = js.native
  
  /**
    * Information about the queue for which metrics are returned.
    */
  var Queue: js.UndefOr[QueueReference] = js.native
}
object Dimensions {
  
  @scala.inline
  def apply(): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimensions]
  }
  
  @scala.inline
  implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
    
    @scala.inline
    def setQueue(value: QueueReference): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
  }
}
