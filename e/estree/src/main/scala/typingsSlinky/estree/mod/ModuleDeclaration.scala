package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ImportDeclaration
  - typingsSlinky.estree.mod.ExportNamedDeclaration
  - typingsSlinky.estree.mod.ExportDefaultDeclaration
  - typingsSlinky.estree.mod.ExportAllDeclaration
*/
trait ModuleDeclaration extends Node
object ModuleDeclaration {
  
  @scala.inline
  def ExportAllDeclaration(source: Literal, `type`: typingsSlinky.estree.estreeStrings.ExportAllDeclaration): typingsSlinky.estree.mod.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportAllDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: Declaration | Expression,
    `type`: typingsSlinky.estree.estreeStrings.ExportDefaultDeclaration
  ): typingsSlinky.estree.mod.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportDefaultDeclaration]
  }
  
  @scala.inline
  def ExportNamedDeclaration(
    specifiers: js.Array[ExportSpecifier],
    `type`: typingsSlinky.estree.estreeStrings.ExportNamedDeclaration
  ): typingsSlinky.estree.mod.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportNamedDeclaration]
  }
  
  @scala.inline
  def ImportDeclaration(
    source: Literal,
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    `type`: typingsSlinky.estree.estreeStrings.ImportDeclaration
  ): typingsSlinky.estree.mod.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportDeclaration]
  }
}
