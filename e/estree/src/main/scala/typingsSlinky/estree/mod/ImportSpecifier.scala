package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifier
  extends BaseModuleSpecifier
     with ModuleSpecifier {
  
  var imported: Identifier = js.native
  
  @JSName("type")
  var type_ImportSpecifier: typingsSlinky.estree.estreeStrings.ImportSpecifier = js.native
}
object ImportSpecifier {
  
  @scala.inline
  def apply(
    imported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ImportSpecifier
  ): ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier]
  }
  
  @scala.inline
  implicit class ImportSpecifierMutableBuilder[Self <: ImportSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImported(value: Identifier): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
