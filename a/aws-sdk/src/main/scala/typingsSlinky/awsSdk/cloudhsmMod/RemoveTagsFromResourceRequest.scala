package typingsSlinky.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsFromResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
    */
  var ResourceArn: String = js.native
  
  /**
    * The tag key or keys to remove. Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
    */
  var TagKeyList: typingsSlinky.awsSdk.cloudhsmMod.TagKeyList = js.native
}
object RemoveTagsFromResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: String, TagKeyList: TagKeyList): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
  
  @scala.inline
  implicit class RemoveTagsFromResourceRequestMutableBuilder[Self <: RemoveTagsFromResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = StObject.set(x, "TagKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyListVarargs(value: TagKey*): Self = StObject.set(x, "TagKeyList", js.Array(value :_*))
  }
}
