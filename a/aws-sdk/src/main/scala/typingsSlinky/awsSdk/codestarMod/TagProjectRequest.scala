package typingsSlinky.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagProjectRequest extends StObject {
  
  /**
    * The ID of the project you want to add a tag to.
    */
  var id: ProjectId = js.native
  
  /**
    * The tags you want to add to the project.
    */
  var tags: Tags = js.native
}
object TagProjectRequest {
  
  @scala.inline
  def apply(id: ProjectId, tags: Tags): TagProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProjectRequest]
  }
  
  @scala.inline
  implicit class TagProjectRequestMutableBuilder[Self <: TagProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
