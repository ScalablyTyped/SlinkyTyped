package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
*/
trait ClassPropertyKind extends StObject
object ClassPropertyKind {
  
  @scala.inline
  def ClassPrivateProperty(key: PrivateNameKind, `type`: typingsSlinky.astTypes.astTypesStrings.ClassPrivateProperty): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  }
  
  @scala.inline
  def ClassProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ClassProperty
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ClassProperty]
  }
}
