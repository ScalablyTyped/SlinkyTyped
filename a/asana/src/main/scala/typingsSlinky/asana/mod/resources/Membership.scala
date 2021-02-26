package typingsSlinky.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Membership extends StObject {
  
  var project: typingsSlinky.asana.mod.resources.Resource = js.native
  
  var section: typingsSlinky.asana.mod.resources.Resource | Null = js.native
}
object Membership {
  
  @scala.inline
  def apply(project: typingsSlinky.asana.mod.resources.Resource): Membership = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Membership]
  }
  
  @scala.inline
  implicit class MembershipMutableBuilder[Self <: Membership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: typingsSlinky.asana.mod.resources.Resource): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: typingsSlinky.asana.mod.resources.Resource): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionNull: Self = StObject.set(x, "section", null)
  }
}
