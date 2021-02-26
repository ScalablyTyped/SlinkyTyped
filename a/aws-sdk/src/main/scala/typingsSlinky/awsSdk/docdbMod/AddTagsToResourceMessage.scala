package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTagsToResourceMessage extends StObject {
  
  /**
    * The Amazon DocumentDB resource that the tags are added to. This value is an Amazon Resource Name .
    */
  var ResourceName: String = js.native
  
  /**
    * The tags to be assigned to the Amazon DocumentDB resource.
    */
  var Tags: TagList = js.native
}
object AddTagsToResourceMessage {
  
  @scala.inline
  def apply(ResourceName: String, Tags: TagList): AddTagsToResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToResourceMessage]
  }
  
  @scala.inline
  implicit class AddTagsToResourceMessageMutableBuilder[Self <: AddTagsToResourceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
