package typingsSlinky.riotjsDomBindings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.riotjsDomBindings.mod.AttributeExpressionData
    - typingsSlinky.riotjsDomBindings.mod.EventExpressionData
    - typingsSlinky.riotjsDomBindings.mod.TextExpressionData
    - typingsSlinky.riotjsDomBindings.mod.ValueExpressionData
  */
  type ExpressionData = typingsSlinky.riotjsDomBindings.mod._ExpressionData | typingsSlinky.riotjsDomBindings.mod.ValueExpressionData
  
  type ValueExpressionData = typingsSlinky.riotjsDomBindings.mod.BaseExpressionData
  
  @scala.inline
  def bindingTypes: typingsSlinky.riotjsDomBindings.mod.BindingType = typingsSlinky.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bindingTypes").asInstanceOf[typingsSlinky.riotjsDomBindings.mod.BindingType]
  
  @scala.inline
  def createBinding(root: org.scalajs.dom.raw.HTMLElement, binding: typingsSlinky.riotjsDomBindings.mod.BindingData): typingsSlinky.riotjsDomBindings.mod.Binding[_, _] = (typingsSlinky.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBinding")(root.asInstanceOf[js.Any], binding.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.riotjsDomBindings.mod.Binding[_, _]]
  @scala.inline
  def createBinding(
    root: org.scalajs.dom.raw.HTMLElement,
    binding: typingsSlinky.riotjsDomBindings.mod.BindingData,
    templateTagOffset: scala.Double
  ): typingsSlinky.riotjsDomBindings.mod.Binding[_, _] = (typingsSlinky.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBinding")(root.asInstanceOf[js.Any], binding.asInstanceOf[js.Any], templateTagOffset.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.riotjsDomBindings.mod.Binding[_, _]]
  
  @scala.inline
  def createExpression(
    node: org.scalajs.dom.raw.HTMLElement,
    expression: typingsSlinky.riotjsDomBindings.mod.ExpressionData
  ): typingsSlinky.riotjsDomBindings.mod.Expression[_] = (typingsSlinky.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createExpression")(node.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.riotjsDomBindings.mod.Expression[_]]
  
  @scala.inline
  def expressionTypes: typingsSlinky.riotjsDomBindings.mod.ExpressionType = typingsSlinky.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].selectDynamic("expressionTypes").asInstanceOf[typingsSlinky.riotjsDomBindings.mod.ExpressionType]
  
  @scala.inline
  def template(template: java.lang.String, bindings: js.Array[typingsSlinky.riotjsDomBindings.mod.BindingData]): typingsSlinky.riotjsDomBindings.mod.TemplateChunk[_, _] = (typingsSlinky.riotjsDomBindings.mod.^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any], bindings.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.riotjsDomBindings.mod.TemplateChunk[_, _]]
}
