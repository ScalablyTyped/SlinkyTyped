package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tag extends StObject {
  
  /**
    * The key of the tag.
    */
  var TagKey: TagKeyType = js.native
  
  /**
    * The value of the tag.
    */
  var TagValue: TagValueType = js.native
}
object Tag {
  
  @scala.inline
  def apply(TagKey: TagKeyType, TagValue: TagValueType): Tag = {
    val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValue = TagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  @scala.inline
  implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagKey(value: TagKeyType): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagValue(value: TagValueType): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
  }
}
