package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
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
  def ExportSpecifier(
    exported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ExportSpecifier
  ): typingsSlinky.estree.mod.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ExportSpecifier]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportDefaultSpecifier): typingsSlinky.estree.mod.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportDefaultSpecifier]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(local: Identifier, `type`: typingsSlinky.estree.estreeStrings.ImportNamespaceSpecifier): typingsSlinky.estree.mod.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportNamespaceSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier(
    imported: Identifier,
    local: Identifier,
    `type`: typingsSlinky.estree.estreeStrings.ImportSpecifier
  ): typingsSlinky.estree.mod.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ImportSpecifier]
  }
}
