package typingsSlinky.gitlab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectId extends StObject {
  
  var projectId: js.UndefOr[String | Double] = js.native
}
object ProjectId {
  
  @scala.inline
  def apply(): ProjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectId]
  }
  
  @scala.inline
  implicit class ProjectIdMutableBuilder[Self <: ProjectId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String | Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
