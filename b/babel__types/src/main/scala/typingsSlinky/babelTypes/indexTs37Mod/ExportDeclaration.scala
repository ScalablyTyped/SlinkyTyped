package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportNamedDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.ExportAllDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.ExportDefaultDeclaration_
  - typingsSlinky.babelTypes.indexTs37Mod.ExportNamedDeclaration_
*/
trait ExportDeclaration extends _Node
object ExportDeclaration {
  
  @scala.inline
  def ExportAllDeclaration_(source: StringLiteral_, `type`: ExportAllDeclaration): ExportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration_(
    declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression,
    `type`: ExportDefaultDeclaration
  ): ExportDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDeclaration]
  }
  
  @scala.inline
  def ExportNamedDeclaration_(
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
    `type`: ExportNamedDeclaration
  ): ExportDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDeclaration]
  }
}
