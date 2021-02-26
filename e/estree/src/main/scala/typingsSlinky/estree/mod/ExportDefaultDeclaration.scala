package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportDefaultDeclaration
  extends BaseNode
     with ModuleDeclaration {
  
  var declaration: Declaration | Expression = js.native
  
  @JSName("type")
  var type_ExportDefaultDeclaration: typingsSlinky.estree.estreeStrings.ExportDefaultDeclaration = js.native
}
object ExportDefaultDeclaration {
  
  @scala.inline
  def apply(
    declaration: Declaration | Expression,
    `type`: typingsSlinky.estree.estreeStrings.ExportDefaultDeclaration
  ): ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDefaultDeclaration]
  }
  
  @scala.inline
  implicit class ExportDefaultDeclarationMutableBuilder[Self <: ExportDefaultDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclaration(value: Declaration | Expression): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
