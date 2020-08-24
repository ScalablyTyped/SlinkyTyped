package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ExportSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import typingsSlinky.babelTypes.babelTypesStrings.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def ImportDefaultSpecifier_(local: Identifier_, `type`: ImportDefaultSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ImportNamespaceSpecifier_(local: Identifier_, `type`: ImportNamespaceSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ExportSpecifier_(exported: Identifier_, local: Identifier_, `type`: ExportSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ExportNamespaceSpecifier_(exported: Identifier_, `type`: ExportNamespaceSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ImportSpecifier_(imported: Identifier_, local: Identifier_, `type`: ImportSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ExportDefaultSpecifier_(exported: Identifier_, `type`: ExportDefaultSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
}

