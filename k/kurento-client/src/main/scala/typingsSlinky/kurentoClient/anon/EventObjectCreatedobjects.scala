package typingsSlinky.kurentoClient.anon

import typingsSlinky.kurentoClient.kurentoClientStrings.ObjectCreated
import typingsSlinky.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ObjectCreated', {  object :string}> */
@js.native
trait EventObjectCreatedobjects extends StObject {
  
  var `object`: String = js.native
  
  var source: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: ObjectCreated = js.native
}
object EventObjectCreatedobjects {
  
  @scala.inline
  def apply(
    `object`: String,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: ObjectCreated
  ): EventObjectCreatedobjects = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObjectCreatedobjects]
  }
  
  @scala.inline
  implicit class EventObjectCreatedobjectsMutableBuilder[Self <: EventObjectCreatedobjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
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
    def setType(value: ObjectCreated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
