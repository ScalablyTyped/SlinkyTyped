package typingsSlinky.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.riotjsDomBindings.mod.IfBindingData
  - typingsSlinky.riotjsDomBindings.mod.EachBindingData
  - typingsSlinky.riotjsDomBindings.mod.SimpleBindingData
  - typingsSlinky.riotjsDomBindings.mod.SlotBindingData
  - typingsSlinky.riotjsDomBindings.mod.TagBindingData
*/
trait BindingData extends StObject
object BindingData {
  
  @scala.inline
  def EachBindingData(itemName: String, template: TemplateChunk[_, _]): typingsSlinky.riotjsDomBindings.mod.EachBindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.EachBindingData]
  }
  
  @scala.inline
  def IfBindingData(template: TemplateChunk[_, _]): typingsSlinky.riotjsDomBindings.mod.IfBindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.IfBindingData]
  }
  
  @scala.inline
  def SimpleBindingData(expressions: js.Array[ExpressionData]): typingsSlinky.riotjsDomBindings.mod.SimpleBindingData = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.SimpleBindingData]
  }
  
  @scala.inline
  def SlotBindingData(bindings: BindingData, html: String, id: String): typingsSlinky.riotjsDomBindings.mod.SlotBindingData = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.SlotBindingData]
  }
  
  @scala.inline
  def TagBindingData(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => TemplateChunk[_, _],
    slots: js.Array[SlotBindingData]
  ): typingsSlinky.riotjsDomBindings.mod.TagBindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.riotjsDomBindings.mod.TagBindingData]
  }
}
