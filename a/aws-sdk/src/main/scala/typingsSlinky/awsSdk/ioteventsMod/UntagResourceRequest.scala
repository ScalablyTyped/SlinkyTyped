package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceRequest extends StObject {
  
  /**
    * The ARN of the resource.
    */
  var resourceArn: AmazonResourceName = js.native
  
  /**
    * A list of the keys of the tags to be removed from the resource.
    */
  var tagKeys: TagKeys = js.native
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(resourceArn: AmazonResourceName, tagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeys): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "tagKeys", js.Array(value :_*))
  }
}
