package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier
*/
trait ModuleSpecifierKind extends StObject
object ModuleSpecifierKind {
  
  @scala.inline
  def ExportSpecifier(exported: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.ExportSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(`type`: typingsSlinky.astTypes.astTypesStrings.ImportDefaultSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(`type`: typingsSlinky.astTypes.astTypesStrings.ImportNamespaceSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier(imported: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.ImportSpecifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  }
}
