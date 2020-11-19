package typingsSlinky.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamSummary extends js.Object {
  
  /**
    * Channel ARN for the stream.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.native
  
  /**
    * The stream’s health.
    */
  var health: js.UndefOr[StreamHealth] = js.native
  
  /**
    * ISO-8601 formatted timestamp of the stream’s start.
    */
  var startTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The stream’s state.
    */
  var state: js.UndefOr[StreamState] = js.native
  
  /**
    * Number of current viewers of the stream.
    */
  var viewerCount: js.UndefOr[StreamViewerCount] = js.native
}
object StreamSummary {
  
  @scala.inline
  def apply(): StreamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSummary]
  }
  
  @scala.inline
  implicit class StreamSummaryOps[Self <: StreamSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChannelArn): Self = this.set("channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("channelArn", js.undefined)
    
    @scala.inline
    def setHealth(value: StreamHealth): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    
    @scala.inline
    def setStartTime(value: js.Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: StreamState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setViewerCount(value: StreamViewerCount): Self = this.set("viewerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewerCount: Self = this.set("viewerCount", js.undefined)
  }
}
