package typingsSlinky.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectRequest extends StObject {
  
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  
  /**
    * The ID of the project you want to update.
    */
  var id: ProjectId = js.native
  
  /**
    * The name of the project you want to update.
    */
  var name: js.UndefOr[ProjectName] = js.native
}
object UpdateProjectRequest {
  
  @scala.inline
  def apply(id: ProjectId): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  @scala.inline
  implicit class UpdateProjectRequestMutableBuilder[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ProjectDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
