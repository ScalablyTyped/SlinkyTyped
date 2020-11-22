package typingsSlinky.kurentoClient.anon

import typingsSlinky.kurentoClient.kurentoClientStrings.DataChannelClose
import typingsSlinky.kurentoClient.mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'DataChannelClose', {  channelId :number}> */
@js.native
trait EventDataChannelClosechan extends js.Object {
  
  var channelId: Double = js.native
  
  var source: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: DataChannelClose = js.native
}
object EventDataChannelClosechan {
  
  @scala.inline
  def apply(
    channelId: Double,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: DataChannelClose
  ): EventDataChannelClosechan = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDataChannelClosechan]
  }
  
  @scala.inline
  implicit class EventDataChannelClosechanOps[Self <: EventDataChannelClosechan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelId(value: Double): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DataChannelClose): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
