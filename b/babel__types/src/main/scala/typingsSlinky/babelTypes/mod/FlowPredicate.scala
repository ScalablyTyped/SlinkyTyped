package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.DeclaredPredicate
import typingsSlinky.babelTypes.babelTypesStrings.InferredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.DeclaredPredicate_
  - typingsSlinky.babelTypes.mod.InferredPredicate_
*/
trait FlowPredicate extends _Node
object FlowPredicate {
  
  @scala.inline
  def DeclaredPredicate_(`type`: DeclaredPredicate, value: Flow): typingsSlinky.babelTypes.mod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DeclaredPredicate_]
  }
  
  @scala.inline
  def InferredPredicate_(`type`: InferredPredicate): typingsSlinky.babelTypes.mod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.InferredPredicate_]
  }
}
