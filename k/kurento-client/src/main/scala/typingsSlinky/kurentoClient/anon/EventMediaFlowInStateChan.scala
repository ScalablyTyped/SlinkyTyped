package typingsSlinky.kurentoClient.anon

import typingsSlinky.kurentoClient.kurentoClientStrings.MediaFlowInStateChange
import typingsSlinky.kurentoClient.mod.MediaFlowState
import typingsSlinky.kurentoClient.mod.MediaType
import typingsSlinky.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'MediaFlowInStateChange', {  state :kurento-client.kurento-client.MediaFlowState,   mediaType :kurento-client.kurento-client.MediaType,   padName :string}> */
@js.native
trait EventMediaFlowInStateChan extends StObject {
  
  var mediaType: MediaType = js.native
  
  var padName: String = js.native
  
  var source: String = js.native
  
  var state: MediaFlowState = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: MediaFlowInStateChange = js.native
}
object EventMediaFlowInStateChan {
  
  @scala.inline
  def apply(
    mediaType: MediaType,
    padName: String,
    source: String,
    state: MediaFlowState,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: MediaFlowInStateChange
  ): EventMediaFlowInStateChan = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], padName = padName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMediaFlowInStateChan]
  }
  
  @scala.inline
  implicit class EventMediaFlowInStateChanMutableBuilder[Self <: EventMediaFlowInStateChan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadName(value: String): Self = StObject.set(x, "padName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: MediaFlowState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaFlowInStateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
