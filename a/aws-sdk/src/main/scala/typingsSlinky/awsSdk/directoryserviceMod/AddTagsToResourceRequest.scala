package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsToResourceRequest extends StObject {
  
  /**
    * Identifier (ID) for the directory to which to add the tag.
    */
  var ResourceId: typingsSlinky.awsSdk.directoryserviceMod.ResourceId = js.native
  
  /**
    * The tags to be assigned to the directory.
    */
  var Tags: typingsSlinky.awsSdk.directoryserviceMod.Tags = js.native
}
object AddTagsToResourceRequest {
  
  @scala.inline
  def apply(ResourceId: ResourceId, Tags: Tags): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
  
  @scala.inline
  implicit class AddTagsToResourceRequestMutableBuilder[Self <: AddTagsToResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
