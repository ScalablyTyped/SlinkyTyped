package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportDeclaration_
  extends Node
     with Declaration
     with ModuleDeclaration
     with Statement {
  
  var source: StringLiteral_ = js.native
  
  var specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_] = js.native
  
  @JSName("type")
  var type_ImportDeclaration_ : ImportDeclaration = js.native
}
object ImportDeclaration_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    start: Double,
    `type`: ImportDeclaration
  ): ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDeclaration_]
  }
  
  @scala.inline
  implicit class ImportDeclaration_MutableBuilder[Self <: ImportDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiers(value: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersVarargs(value: (ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
