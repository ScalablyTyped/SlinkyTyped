package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
*/
trait TypeAliasKind extends StObject
object TypeAliasKind {
  
  @scala.inline
  def DeclareTypeAlias(
    id: IdentifierKind,
    right: FlowTypeKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareTypeAlias
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias]
  }
  
  @scala.inline
  def TypeAlias(id: IdentifierKind, right: FlowTypeKind, `type`: typingsSlinky.astTypes.astTypesStrings.TypeAlias): typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias]
  }
}
