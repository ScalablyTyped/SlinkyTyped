package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to return tags for. The AWS Firewall Manager resources that support tagging are policies, applications lists, and protocols lists. 
    */
  var ResourceArn: typingsSlinky.awsSdk.fmsMod.ResourceArn = js.native
  
  /**
    * The tags to add to the resource.
    */
  var TagList: typingsSlinky.awsSdk.fmsMod.TagList = js.native
}
object TagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn, TagList: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
