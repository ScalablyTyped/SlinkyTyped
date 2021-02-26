package typingsSlinky.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProjectResponse extends StObject {
  
  /**
    * The current status of the delete project operation.
    */
  var Status: js.UndefOr[ProjectStatus] = js.native
}
object DeleteProjectResponse {
  
  @scala.inline
  def apply(): DeleteProjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteProjectResponse]
  }
  
  @scala.inline
  implicit class DeleteProjectResponseMutableBuilder[Self <: DeleteProjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ProjectStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
