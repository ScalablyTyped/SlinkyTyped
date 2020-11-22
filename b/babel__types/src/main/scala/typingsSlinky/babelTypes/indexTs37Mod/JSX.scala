package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXEmptyExpression
import typingsSlinky.babelTypes.babelTypesStrings.JSXExpressionContainer
import typingsSlinky.babelTypes.babelTypesStrings.JSXFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXIdentifier
import typingsSlinky.babelTypes.babelTypesStrings.JSXMemberExpression
import typingsSlinky.babelTypes.babelTypesStrings.JSXNamespacedName
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXSpreadAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXSpreadChild
import typingsSlinky.babelTypes.babelTypesStrings.JSXText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.JSXAttribute_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXClosingElement_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXElement_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXEmptyExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXExpressionContainer_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadChild_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXIdentifier_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXMemberExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXNamespacedName_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningElement_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXSpreadAttribute_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXText_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXFragment_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXOpeningFragment_
  - typingsSlinky.babelTypes.indexTs37Mod.JSXClosingFragment_
*/
trait JSX extends _Node
object JSX {
  
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typingsSlinky.babelTypes.indexTs37Mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): JSX = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): JSX = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXEmptyExpression_(`type`: JSXEmptyExpression): JSX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXClosingFragment_(`type`: JSXClosingFragment): JSX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXMemberExpression_(
    `object`: typingsSlinky.babelTypes.indexTs37Mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    `type`: JSXMemberExpression
  ): JSX = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXOpeningFragment_(`type`: JSXOpeningFragment): JSX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXText_(`type`: JSXText, value: String): JSX = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): JSX = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXSpreadAttribute_(argument: Expression, `type`: JSXSpreadAttribute): JSX = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typingsSlinky.babelTypes.indexTs37Mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    `type`: JSXElement
  ): JSX = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement
  ): JSX = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXIdentifier_(name: String, `type`: JSXIdentifier): JSX = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXNamespacedName_(name: JSXIdentifier_, namespace: JSXIdentifier_, `type`: JSXNamespacedName): JSX = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXSpreadChild_(expression: Expression, `type`: JSXSpreadChild): JSX = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): JSX = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
}
