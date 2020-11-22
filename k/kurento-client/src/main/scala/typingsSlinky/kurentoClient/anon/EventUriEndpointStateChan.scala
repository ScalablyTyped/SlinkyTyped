package typingsSlinky.kurentoClient.anon

import typingsSlinky.kurentoClient.kurentoClientStrings.UriEndpointStateChanged
import typingsSlinky.kurentoClient.mod.Tag
import typingsSlinky.kurentoClient.mod.UriEndpointState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'UriEndpointStateChanged', {  state :kurento-client.kurento-client.UriEndpointState}> */
@js.native
trait EventUriEndpointStateChan extends js.Object {
  
  var source: String = js.native
  
  var state: UriEndpointState = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: UriEndpointStateChanged = js.native
}
object EventUriEndpointStateChan {
  
  @scala.inline
  def apply(
    source: String,
    state: UriEndpointState,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: UriEndpointStateChanged
  ): EventUriEndpointStateChan = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventUriEndpointStateChan]
  }
  
  @scala.inline
  implicit class EventUriEndpointStateChanOps[Self <: EventUriEndpointStateChan] (val x: Self) extends AnyVal {
    
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: UriEndpointState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UriEndpointStateChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
