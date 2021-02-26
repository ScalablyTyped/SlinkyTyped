package typingsSlinky.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SampleChannelDataRequest extends StObject {
  
  /**
    * The name of the channel whose message samples are retrieved.
    */
  var channelName: ChannelName = js.native
  
  /**
    * The end of the time window from which sample messages are retrieved.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The number of sample messages to be retrieved. The limit is 10. The default is also 10.
    */
  var maxMessages: js.UndefOr[MaxMessages] = js.native
  
  /**
    * The start of the time window from which sample messages are retrieved.
    */
  var startTime: js.UndefOr[js.Date] = js.native
}
object SampleChannelDataRequest {
  
  @scala.inline
  def apply(channelName: ChannelName): SampleChannelDataRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleChannelDataRequest]
  }
  
  @scala.inline
  implicit class SampleChannelDataRequestMutableBuilder[Self <: SampleChannelDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setMaxMessages(value: MaxMessages): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
