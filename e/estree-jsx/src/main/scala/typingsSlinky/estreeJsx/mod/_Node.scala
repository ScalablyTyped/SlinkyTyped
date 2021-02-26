package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Node extends StObject
object _Node {
  
  @scala.inline
  def JSXAttribute(
    name: JSXIdentifier | JSXNamespacedName,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXAttribute
  ): typingsSlinky.estreeJsx.mod.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXAttribute]
  }
  
  @scala.inline
  def JSXClosingElement(
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXClosingElement
  ): typingsSlinky.estreeJsx.mod.JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXClosingElement]
  }
  
  @scala.inline
  def JSXClosingFragment(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXClosingFragment): typingsSlinky.estreeJsx.mod.JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXClosingFragment]
  }
  
  @scala.inline
  def JSXElement(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | typingsSlinky.estreeJsx.mod.JSXElement | JSXFragment
    ],
    openingElement: JSXOpeningElement,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXElement
  ): typingsSlinky.estreeJsx.mod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXElement]
  }
  
  @scala.inline
  def JSXEmptyExpression(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXEmptyExpression): typingsSlinky.estreeJsx.mod.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXEmptyExpression]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: Expression | JSXEmptyExpression,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXExpressionContainer
  ): typingsSlinky.estreeJsx.mod.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXExpressionContainer]
  }
  
  @scala.inline
  def JSXFragment(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | typingsSlinky.estreeJsx.mod.JSXFragment
    ],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXFragment
  ): typingsSlinky.estreeJsx.mod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXFragment]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXIdentifier): typingsSlinky.estreeJsx.mod.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXIdentifier]
  }
  
  @scala.inline
  def JSXMemberExpression(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXMemberExpression): typingsSlinky.estreeJsx.mod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXMemberExpression]
  }
  
  @scala.inline
  def JSXNamespacedName(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXNamespacedName): typingsSlinky.estreeJsx.mod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXNamespacedName]
  }
  
  @scala.inline
  def JSXOpeningElement(
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    name: JSXIdentifier | JSXMemberExpression | JSXNamespacedName,
    selfClosing: Boolean,
    `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXOpeningElement
  ): typingsSlinky.estreeJsx.mod.JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXOpeningElement]
  }
  
  @scala.inline
  def JSXOpeningFragment(`type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXOpeningFragment): typingsSlinky.estreeJsx.mod.JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXOpeningFragment]
  }
  
  @scala.inline
  def JSXSpreadAttribute(argument: Expression, `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): typingsSlinky.estreeJsx.mod.JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXSpreadAttribute]
  }
  
  @scala.inline
  def JSXText(raw: String, `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXText, value: String): typingsSlinky.estreeJsx.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estreeJsx.mod.JSXText]
  }
}
