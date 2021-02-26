package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportAllDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typingsSlinky.babelTypes.babelTypesStrings.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.ExportAllDeclaration_
  - typingsSlinky.babelTypes.ts36Mod.ExportDefaultDeclaration_
  - typingsSlinky.babelTypes.ts36Mod.ExportNamedDeclaration_
  - typingsSlinky.babelTypes.ts36Mod.ImportDeclaration_
*/
trait ModuleDeclaration extends StObject
object ModuleDeclaration {
  
  @scala.inline
  def ExportAllDeclaration_(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    start: Double,
    `type`: ExportAllDeclaration
  ): typingsSlinky.babelTypes.ts36Mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ExportAllDeclaration_]
  }
  
  @scala.inline
  def ExportDefaultDeclaration_(
    declaration: Declaration | Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ExportDefaultDeclaration
  ): typingsSlinky.babelTypes.ts36Mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ExportDefaultDeclaration_]
  }
  
  @scala.inline
  def ExportNamedDeclaration_(
    declaration: Declaration,
    end: Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier_],
    start: Double,
    `type`: ExportNamedDeclaration
  ): typingsSlinky.babelTypes.ts36Mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ExportNamedDeclaration_]
  }
  
  @scala.inline
  def ImportDeclaration_(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    start: Double,
    `type`: ImportDeclaration
  ): typingsSlinky.babelTypes.ts36Mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ImportDeclaration_]
  }
}
