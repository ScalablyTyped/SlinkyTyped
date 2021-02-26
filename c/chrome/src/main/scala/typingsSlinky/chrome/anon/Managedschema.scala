package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Managedschema extends StObject {
  
  var managed_schema: String = js.native
}
object Managedschema {
  
  @scala.inline
  def apply(managed_schema: String): Managedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Managedschema]
  }
  
  @scala.inline
  implicit class ManagedschemaMutableBuilder[Self <: Managedschema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManaged_schema(value: String): Self = StObject.set(x, "managed_schema", value.asInstanceOf[js.Any])
  }
}
