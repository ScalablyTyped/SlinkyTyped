package typingsSlinky.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel from which you want to remove tags.
    */
  var ResourceARN: typingsSlinky.awsSdk.kinesisvideoMod.ResourceARN = js.native
  
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typingsSlinky.awsSdk.kinesisvideoMod.TagKeyList = js.native
}
object UntagResourceInput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit class UntagResourceInputMutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = StObject.set(x, "TagKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyListVarargs(value: TagKey*): Self = StObject.set(x, "TagKeyList", js.Array(value :_*))
  }
}
