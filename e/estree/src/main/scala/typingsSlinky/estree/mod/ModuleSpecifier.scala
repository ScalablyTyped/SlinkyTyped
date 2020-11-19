package typingsSlinky.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.ImportSpecifier
  - typingsSlinky.estree.mod.ImportDefaultSpecifier
  - typingsSlinky.estree.mod.ImportNamespaceSpecifier
  - typingsSlinky.estree.mod.ExportSpecifier
*/
trait ModuleSpecifier extends Node
object ModuleSpecifier {
  
  @scala.inline
  def ImportSpecifier(
    imported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ImportSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportDefaultSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportNamespaceSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ExportSpecifier(
    exported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ExportSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
}
