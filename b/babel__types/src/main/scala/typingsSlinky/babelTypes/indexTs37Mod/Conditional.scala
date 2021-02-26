package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ConditionalExpression
import typingsSlinky.babelTypes.babelTypesStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.ConditionalExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.IfStatement_
*/
trait Conditional extends _Node
object Conditional {
  
  @scala.inline
  def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression, `type`: ConditionalExpression): typingsSlinky.babelTypes.indexTs37Mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ConditionalExpression_]
  }
  
  @scala.inline
  def IfStatement_(consequent: Statement, test: Expression, `type`: IfStatement): typingsSlinky.babelTypes.indexTs37Mod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.IfStatement_]
  }
}
