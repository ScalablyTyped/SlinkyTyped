package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to remove one or more tags from.
    */
  var ResourceArn: AmazonResourceName = js.native
  
  /**
    * The tags (tag keys) that you want to remove from the resource. When you specify a tag key, the action removes both that key and its associated tag value. To remove more than one tag from the resource, append the TagKeys parameter and argument for each additional tag to remove, separated by an ampersand. For example: /v1/email/tags?ResourceArn=ResourceArn&amp;TagKeys=Key1&amp;TagKeys=Key2 
    */
  var TagKeys: TagKeyList = js.native
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: AmazonResourceName, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
