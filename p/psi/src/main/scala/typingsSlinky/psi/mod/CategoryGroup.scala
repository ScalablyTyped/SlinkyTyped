package typingsSlinky.psi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryGroup extends StObject {
  
  var description: String = js.native
  
  var title: String = js.native
}
object CategoryGroup {
  
  @scala.inline
  def apply(description: String, title: String): CategoryGroup = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryGroup]
  }
  
  @scala.inline
  implicit class CategoryGroupMutableBuilder[Self <: CategoryGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
