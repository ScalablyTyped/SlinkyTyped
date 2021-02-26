package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
*/
trait FlowPredicateKind extends StObject
object FlowPredicateKind {
  
  @scala.inline
  def DeclaredPredicate(`type`: typingsSlinky.astTypes.astTypesStrings.DeclaredPredicate, value: ExpressionKind): typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  }
  
  @scala.inline
  def InferredPredicate(`type`: typingsSlinky.astTypes.astTypesStrings.InferredPredicate): typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  }
}
