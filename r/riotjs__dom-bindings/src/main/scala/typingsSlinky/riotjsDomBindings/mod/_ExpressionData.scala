package typingsSlinky.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ExpressionData extends StObject
object _ExpressionData {
  
  @scala.inline
  def AttributeExpressionData(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): typingsSlinky.riotjsDomBindings.mod.AttributeExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.AttributeExpressionData]
  }
  
  @scala.inline
  def EventExpressionData(evaluate: js.Any => js.Any, name: String, `type`: ExpressionType): typingsSlinky.riotjsDomBindings.mod.EventExpressionData = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.EventExpressionData]
  }
  
  @scala.inline
  def TextExpressionData(childNodeIndex: Double, evaluate: js.Any => js.Any, `type`: ExpressionType): typingsSlinky.riotjsDomBindings.mod.TextExpressionData = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.TextExpressionData]
  }
}
