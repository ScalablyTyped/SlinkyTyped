package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.ExportAllDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.ExportDefaultDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.ExportNamedDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.ImportDeclaration_
*/
trait ModuleDeclaration extends _Node
object ModuleDeclaration {
  
  @scala.inline
  def ExportAllDeclaration_(source: StringLiteral_, `type`: ExportAllDeclaration): typingsSlinky.babelTypes.indexTs37Mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ExportAllDeclaration_]
  }
  
  @scala.inline
  def ExportDefaultDeclaration_(
    declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression,
    `type`: ExportDefaultDeclaration
  ): typingsSlinky.babelTypes.indexTs37Mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ExportDefaultDeclaration_]
  }
  
  @scala.inline
  def ExportNamedDeclaration_(
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
    `type`: ExportNamedDeclaration
  ): typingsSlinky.babelTypes.indexTs37Mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ExportNamedDeclaration_]
  }
  
  @scala.inline
  def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    `type`: ImportDeclaration
  ): typingsSlinky.babelTypes.indexTs37Mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ImportDeclaration_]
  }
}
