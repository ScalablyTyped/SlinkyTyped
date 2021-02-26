package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDefaultSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  
  @JSName("type")
  var type_ImportDefaultSpecifier: typingsSlinky.estree.estreeStrings.ImportDefaultSpecifier = js.native
}
object ImportDefaultSpecifier {
  
  @scala.inline
  def apply(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportDefaultSpecifier): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
  
  @scala.inline
  implicit class ImportDefaultSpecifierMutableBuilder[Self <: ImportDefaultSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
