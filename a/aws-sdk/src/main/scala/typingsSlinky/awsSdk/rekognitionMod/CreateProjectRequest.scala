package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectRequest extends StObject {
  
  /**
    * The name of the project to create.
    */
  var ProjectName: typingsSlinky.awsSdk.rekognitionMod.ProjectName = js.native
}
object CreateProjectRequest {
  
  @scala.inline
  def apply(ProjectName: ProjectName): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit class CreateProjectRequestMutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
  }
}
