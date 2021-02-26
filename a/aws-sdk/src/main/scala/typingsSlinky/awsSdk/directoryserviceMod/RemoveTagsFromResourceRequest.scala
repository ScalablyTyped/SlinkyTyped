package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsFromResourceRequest extends StObject {
  
  /**
    * Identifier (ID) of the directory from which to remove the tag.
    */
  var ResourceId: typingsSlinky.awsSdk.directoryserviceMod.ResourceId = js.native
  
  /**
    * The tag key (name) of the tag to be removed.
    */
  var TagKeys: typingsSlinky.awsSdk.directoryserviceMod.TagKeys = js.native
}
object RemoveTagsFromResourceRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceId, TagKeys: TagKeys): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
  
  @scala.inline
  implicit class RemoveTagsFromResourceRequestMutableBuilder[Self <: RemoveTagsFromResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
