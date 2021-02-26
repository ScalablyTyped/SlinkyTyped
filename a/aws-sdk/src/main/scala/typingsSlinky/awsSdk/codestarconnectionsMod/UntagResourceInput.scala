package typingsSlinky.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to remove tags from.
    */
  var ResourceArn: AmazonResourceName = js.native
  
  /**
    * The list of keys for the tags to be removed from the resource.
    */
  var TagKeys: TagKeyList = js.native
}
object UntagResourceInput {
  
  @scala.inline
  def apply(ResourceArn: AmazonResourceName, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit class UntagResourceInputMutableBuilder[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
