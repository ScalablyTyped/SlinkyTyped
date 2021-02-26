package typingsSlinky.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectReference extends StObject {
  
  var projectId: js.UndefOr[String] = js.native
}
object ProjectReference {
  
  @scala.inline
  def apply(): ProjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectReference]
  }
  
  @scala.inline
  implicit class ProjectReferenceMutableBuilder[Self <: ProjectReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
