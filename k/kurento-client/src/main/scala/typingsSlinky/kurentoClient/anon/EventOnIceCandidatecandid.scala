package typingsSlinky.kurentoClient.anon

import typingsSlinky.kurentoClient.kurentoClientStrings.OnIceCandidate
import typingsSlinky.kurentoClient.mod.IceCandidate
import typingsSlinky.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'OnIceCandidate', {  candidate :kurento-client.kurento-client.IceCandidate}> */
@js.native
trait EventOnIceCandidatecandid extends StObject {
  
  var candidate: IceCandidate = js.native
  
  var source: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: OnIceCandidate = js.native
}
object EventOnIceCandidatecandid {
  
  @scala.inline
  def apply(
    candidate: IceCandidate,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: OnIceCandidate
  ): EventOnIceCandidatecandid = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnIceCandidatecandid]
  }
  
  @scala.inline
  implicit class EventOnIceCandidatecandidMutableBuilder[Self <: EventOnIceCandidatecandid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidate(value: IceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OnIceCandidate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
