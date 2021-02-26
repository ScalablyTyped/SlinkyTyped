package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
*/
trait IdentifierKind extends StObject
object IdentifierKind {
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.Identifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.JSXIdentifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  @scala.inline
  def TSTypeParameter(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
}
