package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ExportSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ExportSpecifier_
  - typingsSlinky.babelTypes.mod.ImportDefaultSpecifier_
  - typingsSlinky.babelTypes.mod.ImportNamespaceSpecifier_
  - typingsSlinky.babelTypes.mod.ImportSpecifier_
  - typingsSlinky.babelTypes.mod.ExportNamespaceSpecifier_
  - typingsSlinky.babelTypes.mod.ExportDefaultSpecifier_
*/
trait ModuleSpecifier extends _Node
object ModuleSpecifier {
  
  @scala.inline
  def ExportDefaultSpecifier_(exported: Identifier_, `type`: ExportDefaultSpecifier): typingsSlinky.babelTypes.mod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ExportDefaultSpecifier_]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier_(exported: Identifier_, `type`: ExportNamespaceSpecifier): typingsSlinky.babelTypes.mod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ExportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ExportSpecifier): typingsSlinky.babelTypes.mod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ExportSpecifier_]
  }
  
  @scala.inline
  def ImportDefaultSpecifier_(local: Identifier_, `type`: ImportDefaultSpecifier): typingsSlinky.babelTypes.mod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ImportDefaultSpecifier_]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier_(local: Identifier_, `type`: ImportNamespaceSpecifier): typingsSlinky.babelTypes.mod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ImportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ImportSpecifier): typingsSlinky.babelTypes.mod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ImportSpecifier_]
  }
}
