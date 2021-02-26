package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.IntegrationName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdName extends StObject {
  
  var id: String = js.native
  
  var name: IntegrationName = js.native
}
object IdName {
  
  @scala.inline
  def apply(id: String, name: IntegrationName): IdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdName]
  }
  
  @scala.inline
  implicit class IdNameMutableBuilder[Self <: IdName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: IntegrationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
