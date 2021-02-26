package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.managed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedStarterTemplate
  extends BaseStarterTemplate
     with StarterTemplate {
  
  var id: String = js.native
  
  var `type`: managed = js.native
}
object ManagedStarterTemplate {
  
  @scala.inline
  def apply(id: String, name: String, projectType: ProjectType, `type`: managed): ManagedStarterTemplate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedStarterTemplate]
  }
  
  @scala.inline
  implicit class ManagedStarterTemplateMutableBuilder[Self <: ManagedStarterTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: managed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
