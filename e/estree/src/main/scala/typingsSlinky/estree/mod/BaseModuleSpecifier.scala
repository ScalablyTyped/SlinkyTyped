package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseModuleSpecifier extends BaseNode {
  
  var local: Identifier = js.native
}
object BaseModuleSpecifier {
  
  @scala.inline
  def apply(local: Identifier, `type`: String): BaseModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModuleSpecifier]
  }
  
  @scala.inline
  implicit class BaseModuleSpecifierMutableBuilder[Self <: BaseModuleSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: Identifier): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
  }
}
