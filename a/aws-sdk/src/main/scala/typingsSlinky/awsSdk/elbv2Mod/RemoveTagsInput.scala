package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArns: typingsSlinky.awsSdk.elbv2Mod.ResourceArns = js.native
  
  /**
    * The tag keys for the tags to remove.
    */
  var TagKeys: typingsSlinky.awsSdk.elbv2Mod.TagKeys = js.native
}
object RemoveTagsInput {
  
  @scala.inline
  def apply(ResourceArns: ResourceArns, TagKeys: TagKeys): RemoveTagsInput = {
    val __obj = js.Dynamic.literal(ResourceArns = ResourceArns.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsInput]
  }
  
  @scala.inline
  implicit class RemoveTagsInputMutableBuilder[Self <: RemoveTagsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
    
    @scala.inline
    def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
