package typingsSlinky.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsFromStreamInput extends StObject {
  
  /**
    * The name of the stream.
    */
  var StreamName: typingsSlinky.awsSdk.kinesisMod.StreamName = js.native
  
  /**
    * A list of tag keys. Each corresponding tag is removed from the stream.
    */
  var TagKeys: TagKeyList = js.native
}
object RemoveTagsFromStreamInput {
  
  @scala.inline
  def apply(StreamName: StreamName, TagKeys: TagKeyList): RemoveTagsFromStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromStreamInput]
  }
  
  @scala.inline
  implicit class RemoveTagsFromStreamInputMutableBuilder[Self <: RemoveTagsFromStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
