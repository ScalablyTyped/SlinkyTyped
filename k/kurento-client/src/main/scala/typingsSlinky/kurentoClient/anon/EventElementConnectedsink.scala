package typingsSlinky.kurentoClient.anon

import typingsSlinky.kurentoClient.kurentoClientStrings.ElementConnected
import typingsSlinky.kurentoClient.mod.MediaType
import typingsSlinky.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ElementConnected', {  sink :kurento-client.kurento-client.MediaElement,   mediaType :kurento-client.kurento-client.MediaType,   sourceMediaDescription :string,   sinkMediaDescription :string}> */
@js.native
trait EventElementConnectedsink extends StObject {
  
  var mediaType: MediaType = js.native
  
  var sink: this.type = js.native
  
  var sinkMediaDescription: String = js.native
  
  var source: String = js.native
  
  var sourceMediaDescription: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: ElementConnected = js.native
}
object EventElementConnectedsink {
  
  @scala.inline
  def apply(
    mediaType: MediaType,
    sink: EventElementConnectedsink,
    sinkMediaDescription: String,
    source: String,
    sourceMediaDescription: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: ElementConnected
  ): EventElementConnectedsink = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], sinkMediaDescription = sinkMediaDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMediaDescription = sourceMediaDescription.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventElementConnectedsink]
  }
  
  @scala.inline
  implicit class EventElementConnectedsinkMutableBuilder[Self <: EventElementConnectedsink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSink(value: EventElementConnectedsink): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkMediaDescription(value: String): Self = StObject.set(x, "sinkMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMediaDescription(value: String): Self = StObject.set(x, "sourceMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ElementConnected): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
