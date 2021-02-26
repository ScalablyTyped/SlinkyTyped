package typingsSlinky.kurentoClient.anon

import typingsSlinky.kurentoClient.kurentoClientStrings.MediaTranscodingStateChange
import typingsSlinky.kurentoClient.mod.MediaTranscodingState
import typingsSlinky.kurentoClient.mod.MediaType
import typingsSlinky.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'MediaTranscodingStateChange', {  state :kurento-client.kurento-client.MediaTranscodingState,   binName :string,   mediaType :kurento-client.kurento-client.MediaType}> */
@js.native
trait EventMediaTranscodingStat extends StObject {
  
  var binName: String = js.native
  
  var mediaType: MediaType = js.native
  
  var source: String = js.native
  
  var state: MediaTranscodingState = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: MediaTranscodingStateChange = js.native
}
object EventMediaTranscodingStat {
  
  @scala.inline
  def apply(
    binName: String,
    mediaType: MediaType,
    source: String,
    state: MediaTranscodingState,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: MediaTranscodingStateChange
  ): EventMediaTranscodingStat = {
    val __obj = js.Dynamic.literal(binName = binName.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMediaTranscodingStat]
  }
  
  @scala.inline
  implicit class EventMediaTranscodingStatMutableBuilder[Self <: EventMediaTranscodingStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinName(value: String): Self = StObject.set(x, "binName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: MediaTranscodingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaTranscodingStateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
